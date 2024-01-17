/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author m.caler
 */

import conexiondb.ConexionMySQL;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloDatos {

    private Map<String, String> datos;
    private static ModeloDatos instance;

    private ModeloDatos() {
        // Constructor privado para implementar el patrón singleton
        datos = new HashMap<>();
    }

    public static synchronized ModeloDatos getInstance() {
        if (instance == null) {
            instance = new ModeloDatos();
        }
        return instance;
    }

     public String obtenerDato(String nombre) {
        return datos.get(nombre);
    }

    public void agregarDato(String nombre, String dato) {
        datos.put(nombre, dato);
    }

    public Map<String, String> obtenerTodosLosDatos() {
        return new HashMap<>(datos);
    }
    public void insertarTodo() throws SQLException{
        ConexionMySQL con = establecerConexion();
        insertarDatosCurso(con);
        selectCurso(con);
        insertarInfoCurso(con);
        insertarDiasSemana(con);
        con.cerrarConexion();
    }
    public ConexionMySQL establecerConexion() throws SQLException{
        // Establecer la conexión
        ConexionMySQL con = new ConexionMySQL("localhost", "gestion_reservas_cursos", "root", "");
            
        return con;
    }
    
    public void insertarDatosCurso(ConexionMySQL con) throws SQLException{
        String SQL = "INSERT INTO RESERVA_CURSO (NCC, MODALIDAD, FECHA_INICIO, DURACION_DIAS, DURACION_HORAS, HORARIO, FECHA_FIN, ZONA_HORARIA) "
            + "values("
                + "'" + datos.get("NCC") + "', "
                + "'" + datos.get("MODALIDAD") + "', "
                + "'" + datos.get("FECHAINICIO") + "', "
                + "'" + datos.get("DIASDURACION") + "', "
                + "'" + datos.get("HORASDURACION") + "', "
                + "'" + datos.get("HORARIOXDIA") + "', "
                + "'" + datos.get("FECHAFIN") + "', "
                + "'" + datos.get("ZONAHORARIA") + "'"
            + " )";
          
        int filas = con.ejecutarInstruccion(SQL);

        for (Map.Entry<String, String> entry : datos.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Clave: " + key + ", Valor: " + value);
        }
    }
    
    public String [] selectCurso(ConexionMySQL con) throws SQLException{
        // Construir la sentencia SQL de consulta con ORDER BY y LIMIT
        con.ejecutarConsulta("SELECT * FROM reserva_curso ORDER BY RESERVA_ID DESC LIMIT 1");
        ResultSet rs = con.getResultSet();
        String id = "";
        String modalidad = "";
        
        if (rs.next()) {
            // Acceder a los valores de las columnas por nombre o índice
            id = rs.getString("RESERVA_ID");
            modalidad = rs.getString("MODALIDAD");
        } else {
            System.out.println("No hay registros en la tabla.");
        }
        
        String []  adatos = {id, modalidad};
        return adatos;
    }
    
    public void insertarInfoCurso(ConexionMySQL con) throws SQLException{
            String sql = "INSERT INTO DATO (RESERVA_ID, WEBEX, DOMICILIO, PROVINCIA, TELEFONO, OBSERVACIONES) ";
            String [] a_id = selectCurso(con);
            if(a_id[1].equalsIgnoreCase("PRESENCIAL")){
                sql += "values("
                    + "'" + a_id[0] + "', "
                    + "' ', "
                    + "'" + datos.get("DOMICILIO") + "', "
                    + "'" + datos.get("PROVINCIA") + "', "
                    + "'" + datos.get("TELEFONO") + "', "
                    + "'" + datos.get("OBS") + "'"
                + " )";
            }else{
                sql += "values("
                    + "'" + a_id[0] + "', "
                    + "'" + datos.get("WEBEX") + "', "
                    + "' ', "
                    + "' ', "
                    + "' ', "
                    + "' '"
                + " )";
        }
        int filas = con.ejecutarInstruccion(sql);
    }
    public void insertarDiasSemana(ConexionMySQL con) throws SQLException{
        String [] a_dias =  datos.get("DIASSEMANA").split(",");
        int monday = 0;
        int tuesday = 0; 
        int wednesday = 0;
        int thursday = 0; 
        int friday = 0; 
        int saturday = 0;
        int sunday = 0;
        
        for (int i = 0; i < a_dias.length; i++) {
            if(a_dias[i].equalsIgnoreCase("MONDAY")) {
                monday = 1;
            }else if(a_dias[i].equalsIgnoreCase("TUESDAY")) {
                tuesday = 1;
            }else if(a_dias[i].equalsIgnoreCase("WEDNESDAY")) {
                wednesday = 1;
            }else if(a_dias[i].equalsIgnoreCase("THURSDAY")) {
                thursday = 1;
            }else if(a_dias[i].equalsIgnoreCase("FRIDAY")) {
                friday = 1;
            }else if(a_dias[i].equalsIgnoreCase("SATURDAY")) {
                saturday = 1;
            }else if(a_dias[i].equalsIgnoreCase("SUNDAY")) {
                sunday = 1;
            }
        }
        
        String [] a_id = selectCurso(con);
        
        String sql = "INSERT INTO DIAS_SEMANA (RESERVA_ID, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY) "
            + "values("
                + "'" + a_id[0] + "', "
                + "'" + monday + "', "
                + "'" + tuesday + "', "
                + "'" + wednesday + "',"
                + "'" + thursday + "',"
                + "'" + friday + "',"
                + "'" + saturday + "',"
                + "'" + sunday + "'"
            + " )";

        // Ejecutar la sentencia SQL de inserción
        int filas = con.ejecutarInstruccion(sql);
    }
}
