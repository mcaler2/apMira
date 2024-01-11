/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author m.caler
 */
public class VistaFinalFechaController implements Initializable {
    private Main mainApp;
    @FXML
    private Button btnCont;
    @FXML
    private TextField txtDias;
    @FXML
    private TextField txtHoras;
    @FXML
    private DatePicker tmpFechaInicio;
    @FXML
    private TextField txtZona;
    @FXML
    private TextField txtFinHorario;
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
    private Button btnAtras;
    @FXML
    private DatePicker tmpFechaInicio1;
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
    private void cont(ActionEvent event) {
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
    private void finHorario(ActionEvent event) {
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
    }
    
}
