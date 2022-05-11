/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex02;

import ex01.Ecouteur;
import ex01.EcouteurBis;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi
 */
public class Ex02 extends Application {
    
    private EcouteurBis ecouteurBis;
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane root = new Pane();
        
        Circle circle1 = new Circle();
        circle1.setFill(Color.RED);
        circle1.setRadius(50);
        circle1.setLayoutX(250);
        circle1.setLayoutY(200);
        
        Label labMessage = new Label("labMessage");
        labMessage.setFont(new Font(20));
        labMessage.setLayoutX(200);
        labMessage.setLayoutY(260);
        
        
        Button btnB1 = new Button("b1");
        btnB1.setLayoutX(185);
        btnB1.setLayoutY(310);
        
        Button btnB2 = new Button("b2");
        btnB2.setLayoutX(295);
        btnB2.setLayoutY(310);
        
        EcouteurBis e1 = new EcouteurBis("Je suis le bouton 1", btnB1, false);
        EcouteurBis e2 = new EcouteurBis("Je suis le bouton 2", btnB2, false);
        EcouteurBis e3 = new EcouteurBis("Je suis le cercle", circle1, false);
        EcouteurBis e4 = new EcouteurBis("Je suis le label", labMessage, false);
        EcouteurBis e5 = new EcouteurBis("Je suis le pane", root, false);
        
        btnB1.setOnAction(e1);
        
        btnB2.setOnAction(e2);
        
        circle1.setOnMouseClicked(e3);
        
        labMessage.setOnMouseClicked(e4);
        
        root.setOnMouseClicked(e5);
        
        root.getChildren().addAll(circle1, labMessage, btnB1, btnB2);
        
        Scene scene = new Scene(root, 500, 400);
        
        primaryStage.setTitle("Hello World!");
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
