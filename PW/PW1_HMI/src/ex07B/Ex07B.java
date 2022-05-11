/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex07B;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi
 */
public class Ex07B extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        /*
        ===========================================================================================================
                                                        NORTHBOX (HBOX)
        ===========================================================================================================
        */
        HBox northBox = new HBox();
        northBox.setAlignment(Pos.CENTER);
        northBox.setPrefSize(400, 30);
        northBox.setStyle("-fx-border-color:black ; -fx-border-width:1");
        
        Label northLab = new Label("NORTH");
        
        northBox.getChildren().add(northLab);
        root.setTop(northBox);
        
        /*
        ===========================================================================================================
                                                        SOUTHBOX (HBOX)
        ===========================================================================================================
        */
        HBox southBox = new HBox();
        southBox.setAlignment(Pos.CENTER);
        southBox.setPrefSize(400, 30);
        southBox.setStyle("-fx-border-color:black ; -fx-border-width:1");
        
        Label southLab = new Label("SOUTH");
        
        southBox.getChildren().add(southLab);
        root.setBottom(southBox);
        
        /*
        ===========================================================================================================
                                                        CENTERBOX (HBOX)
        ===========================================================================================================
        */
        HBox centerBox = new HBox();
        centerBox.setAlignment(Pos.TOP_LEFT);
        centerBox.setPrefSize(360, 100);
        centerBox.setStyle("-fx-border-color:black ; -fx-border-width:1");
        
        Label centerLab1 = new Label("C");
        centerLab1.setStyle("-fx-border-color:black");
        
        Region region1 = new Region();
        centerBox.setHgrow(region1, Priority.ALWAYS);
        
        Label centerLab2 = new Label("E");
        centerLab2.setStyle("-fx-border-color:black");
        centerBox.setMargin(centerLab2, new Insets(18,0,0,0));
        
        Region region2 = new Region();
        centerBox.setHgrow(region2, Priority.ALWAYS);
        
        Label centerLab3 = new Label("N");
        centerLab3.setStyle("-fx-border-color:black");
        centerBox.setMargin(centerLab3, new Insets(36,0,0,0));
        
        Region region3 = new Region();
        centerBox.setHgrow(region3, Priority.ALWAYS);
        
        Label centerLab4 = new Label("T");
        centerLab4.setStyle("-fx-border-color:black");
        centerBox.setMargin(centerLab4, new Insets(54,0,0,0));
        
        Region region4 = new Region();
        centerBox.setHgrow(region4, Priority.ALWAYS);
        
        Label centerLab5 = new Label("E");
        centerLab5.setStyle("-fx-border-color:black");
        centerBox.setMargin(centerLab5, new Insets(72,0,0,0));
        
        Region region5 = new Region();
        centerBox.setHgrow(region5, Priority.ALWAYS);
        
        Label centerLab6 = new Label("R");
        centerLab6.setStyle("-fx-border-color:black");
        centerBox.setMargin(centerLab6, new Insets(90,0,0,0));
        
        centerBox.getChildren().addAll(centerLab1, region1, centerLab2, region2, centerLab3, region3, centerLab4, region4, centerLab5, region5, centerLab6);
        root.setCenter(centerBox);        

        /*
        ===========================================================================================================
                                                        WESTBOX (VBOX)
        ===========================================================================================================
        */
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
        
        /*
        ===========================================================================================================
                                                        EASTBOX (VBOX)
        ===========================================================================================================
        */
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
        
        Scene scene = new Scene(root, 400, 170);
        
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
