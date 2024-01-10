/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlador;

/**
 *
 * @author m.caler
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        showMenu();
    }

    public void showMenu() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/Menu.fxml"));
            Parent root = loader.load();

            MenuController controller = loader.getController();
            controller.setMainApp(this);

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Menú");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showView1(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/" + fxmlFile));
            Parent root = loader.load();

            View1Controller controller = loader.getController();
            controller.setMainApp(this);

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Vista1");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showView2(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/" + fxmlFile));
            Parent root = loader.load();

            View2Controller controller = loader.getController();
            controller.setMainApp(this);

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Vista2");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showView3(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/vista/" + fxmlFile));
            Parent root = loader.load();

            View3Controller controller = loader.getController();
            controller.setMainApp(this);

            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Vista3");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}
