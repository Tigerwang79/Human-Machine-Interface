/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex04;

import ex01.EcouteurBis;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi
 */
public class Ex04 extends Application {
    
    private int compteur = 0;
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        root.setStyle("-fx-border-color:black ; -fx-border-width:2");
        
            /*
            ===========================================================================================================
                                                            TOPBOX (HBOX)
            ===========================================================================================================
            */
            HBox topHBox = new HBox();
            topHBox.setAlignment(Pos.BASELINE_CENTER);
            topHBox.setPadding(new Insets(0, 0, 0, 70));
            topHBox.setSpacing(20);
            root.setAlignment(topHBox, Pos.CENTER);
            
            Button btnPlus5 = new Button("+5");
            
            Line line1 = new Line();
            line1.setStartX(0);
            line1.setEndX(0);
            line1.setStartY(20);
            line1.setEndY(0);
            
            Button btnMoins5 = new Button("-5");
            
            Label label1 = new Label(":");
            
            Label label2 = new Label("10");
            
            topHBox.getChildren().addAll(btnPlus5, line1, btnMoins5, label1, label2);
            
            root.setTop(topHBox);
            
            /*
            ===========================================================================================================
                                                            CENTERBOX (PANE)
            ===========================================================================================================
            */
            Pane pc = new Pane();
            pc.setStyle("-fx-border-color:blue ; -fx-border-width:2");
            pc.setMaxSize(250, 250);
            
            Circle circle1 = new Circle();
            circle1.setCenterX(125);
            circle1.setCenterY(125);
            circle1.setRadius(10);
            circle1.setFill(Color.PURPLE);
            
            pc.getChildren().add(circle1);
            
            root.setCenter(pc);
            
        Button btnQuit = new Button("Quit");
        root.setAlignment(btnQuit, Pos.BASELINE_CENTER);
        
        root.setBottom(btnQuit);
        
        
        btnPlus5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                compteur = Integer.parseInt(label2.getText());
                compteur = compteur + 5;
                label2.setText("" + compteur);
                circle1.setRadius(compteur);
            }
        });
        
        btnMoins5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                compteur = Integer.parseInt(label2.getText());
                if (compteur >= 5)
                {
                    compteur = compteur - 5;
                }
                label2.setText("" + compteur);
                circle1.setRadius(compteur);
            }
        });
        
        EcouteurBis e1 = new EcouteurBis("Je suis le pane", pc, true);
        
        pc.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event){
                double posX = event.getX();
                double posY = event.getY();
                circle1.setCenterX(posX);
                circle1.setCenterY(posY);
            }
        });
        
        btnQuit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Platform.exit();
                System.out.println("Merci de votre visite, à bientôt !");
            }
        });
        
        Scene scene = new Scene(root, 400, 400);
        
        primaryStage.setTitle("Exercice 04");
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
