/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi
 */
public class Ex08 extends Application {
    
    private int compteur = 0;
    private String strCmpt;
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane root = new Pane();
        
            Label label1 = new Label("Compteur :");
            label1.setUnderline(true);
            label1.setLayoutX(150);
            label1.setLayoutY(134);
            
            Label label2 = new Label("X");
            label2.setLayoutX(230);
            label2.setLayoutY(134);
            
            root.setOnScroll(new EventHandler<ScrollEvent>() {
                @Override
                public void handle(ScrollEvent event) {
                    double deltaY = event.getDeltaY();
                    boolean shift = event.isShiftDown();
                    
                    if (deltaY > 0 && shift == true){
                        compteur *= 10;
                        System.out.println("Je fais +10");
                    }
                    else if (deltaY < 0 && shift == true) {
                        compteur *= 10;
                        System.out.println("Je fais -10");
                    }
                    else if (deltaY < 0) {
                        compteur--;
                    }
                    else if (deltaY > 0) {
                        compteur++;
                    }
                    strCmpt = Integer.toString(compteur);
                    label2.setText(strCmpt);
                    event.consume();
                }
            });
        
        root.getChildren().addAll(label1, label2);
        
        Scene scene = new Scene(root, 400, 300);
        
        primaryStage.setTitle("Exercice 08");
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
