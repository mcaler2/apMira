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

public class MenuController {

    private controlador.Main mainApp;

    public void setMainApp(controlador.Main mainApp) {
        this.mainApp = mainApp;
    }

    @FXML
    private void showView1(ActionEvent event) {
        mainApp.showView1("View1.fxml");
    }

    @FXML
    private void showView2(ActionEvent event) {
        mainApp.showView2("View2.fxml");
    }

    @FXML
    private void showView3(ActionEvent event) {
        this.mainApp.showPresencial("VistaPresencial.fxml");
    }
}
