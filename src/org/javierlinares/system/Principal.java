package org.javierlinares.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * Programador: Javier Linares
 * Fecha creacion:
 *      15/04/2021
 * Fecha de modificacion:
 *      19/04/2021
 *      22/04/2021
 *      23/04/2021
 */
public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        escenarioPrincipal.setTitle("Calculadora por: Javier Linares");
        escenarioPrincipal.getIcons().add(new Image("/org/javierlinares/images/Logo Calculadora.png"));
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
