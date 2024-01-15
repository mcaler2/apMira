/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import com.sun.tools.javac.Main;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author m.caler
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {

    private controlador.Main mainApp;
    @FXML
    private Button btnAbrirCurso;

    public void setMainApp(controlador.Main mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void abrirCurso(ActionEvent event) {
        mainApp.showAbrirCurso("VistaAbrirCurso.fxml");
    }
}
