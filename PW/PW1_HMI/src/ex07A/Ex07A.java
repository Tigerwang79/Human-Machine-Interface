/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07A;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi
 */
public class Ex07A extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        HBox northBox = new HBox();
        northBox.setAlignment(Pos.CENTER);
        northBox.setPrefSize(400, 30);
        northBox.setStyle("-fx-border-color:black ; -fx-border-width:1");
        Label northLab = new Label("NORTH");
        northBox.getChildren().add(northLab);
        root.setTop(northBox);
        
        HBox southBox = new HBox();
        southBox.setAlignment(Pos.CENTER);
        southBox.setPrefSize(400, 30);
        southBox.setStyle("-fx-border-color:black ; -fx-border-width:1");
        Label southLab = new Label("SOUTH");
        southBox.getChildren().add(southLab);
        root.setBottom(southBox);
        
        HBox centerBox = new HBox();
        centerBox.setAlignment(Pos.CENTER);
        centerBox.setPrefSize(360, 100);
        centerBox.setStyle("-fx-border-color:black ; -fx-border-width:1");
        Label centerLab = new Label("CENTER");
        centerBox.getChildren().add(centerLab);
        root.setCenter(centerBox);
        

        VBox westBox = new VBox();
        westBox.setAlignment(Pos.CENTER);
        westBox.setPrefSize(20, 100);
        westBox.setStyle("-fx-border-color:black ; -fx-border-width:1");
        Label westLab1 = new Label("W");
        westLab1.setStyle("-fx-border-color:black");
        Label westLab2 = new Label("E");
        westLab2.setStyle("-fx-border-color:black");
        Label westLab3 = new Label("S");
        westLab3.setStyle("-fx-border-color:black");
        Label westLab4 = new Label("T");
        westLab4.setStyle("-fx-border-color:black");
        westBox.getChildren().addAll(westLab1, westLab2, westLab3, westLab4);
        root.setLeft(westBox);
        
        VBox eastBox = new VBox();
        eastBox.setAlignment(Pos.CENTER);
        eastBox.setPrefSize(20, 100);
        eastBox.setStyle("-fx-border-color:black ; -fx-border-width:1");
        Label eastLab1 = new Label("E");
        eastLab1.setStyle("-fx-border-color:black");
        Label eastLab2 = new Label("A");
        eastLab2.setStyle("-fx-border-color:black");
        Label eastLab3 = new Label("S");
        eastLab3.setStyle("-fx-border-color:black");
        Label eastLab4 = new Label("T");
        eastLab4.setStyle("-fx-border-color:black");
        eastBox.getChildren().addAll(eastLab1, eastLab2, eastLab3, eastLab4);
        root.setRight(eastBox);
        
        Scene scene = new Scene(root, 400, 150);
        
        primaryStage.setTitle("Border Layout Show");
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
