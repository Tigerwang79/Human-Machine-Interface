/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudelavie;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi & Baptiste Saint-Léger
 */
public class Main extends Application {
    
    public static Stage stage;
    
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        stage = primaryStage;
        
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/jeudelavie/vue/VueBasique.fxml"));
        
        VBox vbox = loader.load();
        Scene scene = new Scene(vbox);
        
        stage.setTitle("Jeu de la vie");
        stage.setScene(scene);
        stage.setResizable(true);
        stage.show();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}