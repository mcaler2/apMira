/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author m.caler
 */

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    // Puedes agregar más métodos según tus necesidades


}
