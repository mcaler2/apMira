/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import modelo.ModeloDatos;

public class VistaAbrirCursoController {

    private Main mainApp;
    @FXML
    private TextField txtNCC;
    @FXML
    private Button btnAtras;
    @FXML
    private Button btnCont;
    @FXML
    private CheckBox chkRemoto;
    @FXML
    private CheckBox chkPresencial;
    @FXML
    private TextField txtEnlace;
    @FXML
    private Hyperlink enlaceWebex;

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    @FXML
    private void ncc(ActionEvent event) {
    }

    @FXML
    private void atras(ActionEvent event) {
        this.mainApp.showMenu();
    }

    @FXML
    private void cont(ActionEvent event) {
        // Obtener la instancia de ModeloDatos
        ModeloDatos modeloDatos = ModeloDatos.getInstance();
        
        String ncc = txtNCC.getText();
        modeloDatos.agregarDato("NCC",ncc);
        
        if(chkRemoto.isSelected()){
            modeloDatos.agregarDato("MODALIDAD","REMOTO");
            
            String enlaceWebex = txtEnlace.getText();
            modeloDatos.agregarDato("WEBEX",enlaceWebex);
            
            this.mainApp.showFinalFecha("VistaFinalFecha.fxml");
        }else if(chkPresencial.isSelected()){
            modeloDatos.agregarDato("MODALIDAD","PRESENCIAL");
            this.mainApp.showPresencial("VistaPresencial.fxml");
        }
    }

    @FXML
    private void remoto(ActionEvent event) {
    }

    @FXML
    private void presencial(ActionEvent event) {
    }

    @FXML
    private void enlace(ActionEvent event) {
    }

    @FXML
    private void enlaceWebex(ActionEvent event) {
    }

}

