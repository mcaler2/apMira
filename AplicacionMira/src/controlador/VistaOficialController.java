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
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author m.caler
 */
public class VistaOficialController implements Initializable {

    @FXML
    private ChoiceBox<?> selCursoOficial;
    @FXML
    private Button btnConf;
    @FXML
    private Button btnAtras;
    
    private Main mainApp;
     
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void cursoOficial(MouseEvent event) {
    }

    @FXML
    private void cont(ActionEvent event) {       
        //this.mainApp.showFinalFecha("VistaPresencial.fxml");
        this.mainApp.showPrueba("VistaPrueba.fxml");
    }

    @FXML
    private void atras(ActionEvent event) {
        this.mainApp.showFinalFecha("VistaFinalFecha.fxml");
    }
    
}
