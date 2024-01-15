/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import modelo.ModeloDatos;

/**
 * FXML Controller class
 *
 * @author m.caler
 */
public class VistaFinalFechaController implements Initializable {
    private Main mainApp;
    
    @FXML
    private TextField txtDias;
    @FXML
    private TextField txtHoras;
    @FXML
    private DatePicker tmpFechaInicio;
    @FXML
    private TextField txtZona;
    @FXML
    private CheckBox checkL;
    @FXML
    private CheckBox checkM;
    @FXML
    private CheckBox checkMi;
    @FXML
    private CheckBox checkJ;
    @FXML
    private CheckBox checkV;
    @FXML
    private CheckBox checkS;
    @FXML
    private CheckBox checkD;
    @FXML
    private TextField txtHorario;
    @FXML
    private DatePicker tmpFechaFin;
    @FXML
    private Button btnAtras;
    @FXML
    private Button btnCont;
    @FXML
    private Button btnCalc;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void dias(ActionEvent event) {
    }

    @FXML
    private void horas(ActionEvent event) {
    }

    @FXML
    private void fechaInicio(ActionEvent event) {
    }

    @FXML
    private void zona(ActionEvent event) {
    }


    @FXML
    private void lunes(ActionEvent event) {
    }

    @FXML
    private void martes(ActionEvent event) {
    }

    @FXML
    private void miercoles(ActionEvent event) {
    }

    @FXML
    private void jueves(ActionEvent event) {
    }

    @FXML
    private void viernes(ActionEvent event) {
    }

    @FXML
    private void sabado(ActionEvent event) {
    }

    @FXML
    private void domingo(ActionEvent event) {
    }

    @FXML
    private void atras(ActionEvent event) {
        this.mainApp.showPresencial("VistaPresencial.fxml");
    }

    @FXML
    private void cont(ActionEvent event) {       
        //this.mainApp.showFinalFecha("VistaPresencial.fxml");
        this.mainApp.showPrueba("VistaPrueba.fxml");
    }

    @FXML
    private void horario(ActionEvent event) {
    }

    @FXML
    private void fechaFin(ActionEvent event) {
    }
    
    
    private LocalDate obtenerFechaFin(){
        ModeloDatos modeloDatos = ModeloDatos.getInstance();
        
        LocalDate fechaInicio = tmpFechaInicio.getValue();

        int duracionDias = Integer.parseInt(txtDias.getText());
        
        String diasSemana = modeloDatos.obtenerDato("DIASSEMANA");
        String[] a_diasSemana = diasSemana.split(",");
        
        List<DayOfWeek> diasDeCurso = generarArrayDayOfWeek(a_diasSemana);
        DayOfWeek[] arrayDias = diasDeCurso.toArray(DayOfWeek[]::new);
        
        return calcularFechaTermino(fechaInicio, duracionDias, arrayDias);
    }
    
    private List<DayOfWeek> generarArrayDayOfWeek(String[] diasSemana){        
        List<DayOfWeek> diasDeLaSemana = new ArrayList<>();

        for (String diasSemana1 : diasSemana) {
            switch (diasSemana1) {
                case "MONDAY" -> diasDeLaSemana.add(DayOfWeek.MONDAY);
                case "TUESDAY" -> diasDeLaSemana.add(DayOfWeek.TUESDAY);
                case "WEDNESDAY" -> diasDeLaSemana.add(DayOfWeek.WEDNESDAY);
                case "THURSDAY" -> diasDeLaSemana.add(DayOfWeek.THURSDAY);
                case "FRIDAY" -> diasDeLaSemana.add(DayOfWeek.FRIDAY);
                case "SATURDAY" -> diasDeLaSemana.add(DayOfWeek.SATURDAY);
                case "SUNDAY" -> diasDeLaSemana.add(DayOfWeek.SUNDAY);
                default -> {}
            }
        }
        
        return diasDeLaSemana;
    }
    
    private static LocalDate calcularFechaTermino(LocalDate fechaInicio, int diasNecesarios, DayOfWeek[] diasTrabajo) {
        LocalDate fechaActual = fechaInicio;
        int diasTrabajados = 0;

        while (diasTrabajados < diasNecesarios) {
            // Verificar si el día actual es un día de trabajo
            if (esDiaDeTrabajo(fechaActual, diasTrabajo)) {
                diasTrabajados++;
            }

            // Avanzar al siguiente día
            fechaActual = fechaActual.plusDays(1);
        }

        return fechaActual.minusDays(1); // Restamos un día para obtener el último día trabajado
    }
    private static boolean esDiaDeTrabajo(LocalDate fecha, DayOfWeek[] diasTrabajo) {
        for (DayOfWeek dia : diasTrabajo) {
            if (fecha.getDayOfWeek() == dia) {
                return true;
            }
        }
        return false;
    }

    @FXML
    private void calc(ActionEvent event) {
        ModeloDatos modeloDatos = ModeloDatos.getInstance();
        LocalDate fechaInicio = tmpFechaInicio.getValue();

        String duracionDias = txtDias.getText();
        String duracionHoras = txtHoras.getText();
        String zonaHoraria = txtZona.getText();
        String horarioDia = txtHorario.getText();
        
        String diasSemana = "";
        if(checkL.isSelected()){
            diasSemana += "MONDAY,";
        }
        if(checkM.isSelected()){
            diasSemana += "TUESDAY,";
        }
        if(checkMi.isSelected()){
            diasSemana += "WEDNESDAY,";
        }
        if(checkJ.isSelected()){
            diasSemana += "THURSDAY,";
        }
        if(checkV.isSelected()){
            diasSemana += "FRIDAY,";
        }
        if(checkS.isSelected()){
            diasSemana += "SATURDAY,";
        }
        if(checkD.isSelected()){
            diasSemana += "SUNDAY,";
        }
        
        
        
        modeloDatos.agregarDato("FECHAINICIO", fechaInicio + "");
        modeloDatos.agregarDato("DIASDURACION",duracionDias);
        modeloDatos.agregarDato("HORASDURACION",duracionHoras);
        modeloDatos.agregarDato("ZONAHORARIA", zonaHoraria);
        modeloDatos.agregarDato("HORARIOXDIA",horarioDia);
        modeloDatos.agregarDato("DIASSEMANA",diasSemana);
        
        tmpFechaFin.setValue(obtenerFechaFin());
        
        LocalDate fechaFin = tmpFechaFin.getValue();
        
        modeloDatos.agregarDato("FECHAFIN", fechaFin + "");
    }
}
