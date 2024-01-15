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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import modelo.ModeloDatos;

/**
 * FXML Controller class
 *
 * @author m.caler
 */
public class VistaPresencialController implements Initializable {

    @FXML
    private TextArea txtObs;
    @FXML
    private TextField txtTelefono;
    @FXML
    private TextField txtProvincia;
    @FXML
    private TextField txtDomicilio;
    @FXML
    private Button btnCont;
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
    private void obs(MouseEvent event) {
    }

    @FXML
    private void telefono(ActionEvent event) {
    }

    @FXML
    private void provincia(ActionEvent event) {
    }

    @FXML
    private void domicilio(ActionEvent event) {
    }

    @FXML
    private void atras(ActionEvent event) {
        this.mainApp.showAbrirCurso("VistaAbrirCurso.fxml");
    }

    @FXML
    private void cont(ActionEvent event) {
        // Obtener la instancia de ModeloDatos
        ModeloDatos modeloDatos = ModeloDatos.getInstance();

        String domicilio = txtDomicilio.getText();
        String tel = txtTelefono.getText();
        String provincia = txtProvincia.getText();
        String obs = txtObs.getText();
        
        modeloDatos.agregarDato("DOMICILIO",domicilio);
        modeloDatos.agregarDato("TELEFONO",tel);
        modeloDatos.agregarDato("PROVINCIA",provincia);
        modeloDatos.agregarDato("OBS",obs);

        this.mainApp.showFinalFecha("VistaFinalFecha.fxml");
    }
}
