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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class View1Controller {

    private Main mainApp;
    @FXML
    private TextField txtNCC;
    @FXML
    private TextField txtNCC1;

    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initCombos();
    }
    
    public void initCombos() {

        Instructor u = new Instructor();

        ObservableList<Instructor> obsInstructor = u.getInstructores();

        this.cmbInstructor.setItems(obsInstructor);

        Curso v = new Curso();

        ObservableList<Curso> obsCurso = v.getCursos();

        this.cmbCurso.setItems(obsCurso);

    }

    @FXML
    private void backToMenu(ActionEvent event) {
        mainApp.showMenu();
    }


    @FXML
    private void ncc(ActionEvent event) {
    }
}

