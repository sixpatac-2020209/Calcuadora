
package org.sduardixpatac.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/*
 * Nombre del Programador: Sduard Alejandro Ixpatac Sipaque
 * Codigo Tecnico: IN5AV
 * Carné: 202020
 * Fecha de Creación:
	15-04-2021
 * 
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        escenarioPrincipal.setTitle("Calculadora por: Sduard Ixpatac");
        escenarioPrincipal.getIcons().add(new Image("/org/sduardixpatac/images/calcu2.jpg"));
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
