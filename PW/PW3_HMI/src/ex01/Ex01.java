/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

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
public class Ex01 extends Application {
    
    private Ecouteur ecouteur;
    
    @Override
    public void start(Stage primaryStage) {
        
        Pane root = new Pane();
        root.setMaxSize(500, 400);
        
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
        
        Ecouteur filter1 = new Ecouteur("filter_b1", false);
        Ecouteur handler1 = new Ecouteur("handler_b1", false);
        Ecouteur setOn1 = new Ecouteur("setOn1_b1", false);
        Ecouteur setOn2 = new Ecouteur("setOn2_b1", true);
         
        btnB1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                btnB1.addEventFilter(ActionEvent.ACTION, filter1);
                btnB1.addEventHandler(ActionEvent.ACTION, handler1);
                btnB1.setOnAction(setOn1);
            }
        });
        
        Button btnB2 = new Button("b2");
        btnB2.setLayoutX(295);
        btnB2.setLayoutY(310);
        
        root.getChildren().addAll(circle1, labMessage, btnB1, btnB2);
        
        Scene scene = new Scene(root, 500, 400);
        
        primaryStage.setTitle("Exercice 01");
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
