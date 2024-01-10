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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class View1Controller {

    private Main mainApp;
    @FXML
    private TextField txtNCC;
    
    @FXML
    private TextField txtNCC1;
    
    @FXML
    private Button btnAtras;
    @FXML
    private Button btnCont;

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
        this.mainApp.showPresencial("VistaPresencial.fxml");
    }

}

