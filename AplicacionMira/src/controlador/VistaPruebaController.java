/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controlador;

import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import modelo.ModeloDatos;

/**
 * FXML Controller class
 *
 * @author m.caler
 */
public class VistaPruebaController implements Initializable {
    
    private Main mainApp;
    
    @FXML
    private TextArea txtPrueba;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // Obtener la instancia de ModeloDatos
        ModeloDatos modeloDatos = ModeloDatos.getInstance();
        Map<String, String> listaDatos = modeloDatos.obtenerTodosLosDatos();
        
        for (Map.Entry<String, String> entry : listaDatos.entrySet()) {
            String nombre = entry.getKey();
            String valor = entry.getValue();
            txtPrueba.appendText(nombre + ": " + valor);
        }
    }    
    public void setMainApp(Main mainApp) {
        this.mainApp = mainApp;
    }
    @FXML
    private void prueba(MouseEvent event) {
    }

    
    
}
