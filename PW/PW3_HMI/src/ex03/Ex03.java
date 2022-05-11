/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex03;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi
 */
public class Ex03 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        Button btnQuit = new Button("Quit");
        root.setAlignment(btnQuit, Pos.BOTTOM_RIGHT);
        root.setMargin(btnQuit, new Insets(0, 5, 5, 0));
        
        root.setBottom(btnQuit);
        
        btnQuit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
                System.out.println("Merci de votre visite, à bientôt !");
            }
        });
        
        Scene scene = new Scene(root, 600, 400);
        
        primaryStage.setTitle("Exercice 03");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
