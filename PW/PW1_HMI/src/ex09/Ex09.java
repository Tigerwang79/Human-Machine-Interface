/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex09;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi
 */
public class Ex09 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        HBox root = new HBox();
        root.setAlignment(Pos.BOTTOM_LEFT);
        root.setStyle("-fx-border-color:black ; -fx-border-width:1");
        
        /*
        ===========================================================================================================
                                                        VBOX1 (VBOX)
        ===========================================================================================================
        */
        VBox vbox1 = new VBox();
        vbox1.setMaxSize(22, 100);
        vbox1.setAlignment(Pos.CENTER);
        vbox1.setStyle("-fx-border-color:black ; -fx-background-color:#1376da");
        
        Label lab1 = new Label("0");
        lab1.setFont(new Font(30));
        
        Label lab1Bis = new Label("0");
        lab1Bis.setFont(new Font(30));
        
        vbox1.getChildren().addAll(lab1, lab1Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX2 (VBOX)
        ===========================================================================================================
        */
        VBox vbox2 = new VBox();
        vbox2.setMaxSize(22, 100);
        vbox2.setAlignment(Pos.CENTER);
        vbox2.setStyle("-fx-border-color:black ; -fx-background-color:#1f7cda");
        root.setMargin(vbox2, new Insets(0, 0, 4, 0));
        
        Label lab2 = new Label("0");
        lab2.setFont(new Font(30));
        
        Label lab2Bis = new Label("1");
        lab2Bis.setFont(new Font(30));
        
        vbox2.getChildren().addAll(lab2, lab2Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX3 (VBOX)
        ===========================================================================================================
        */
        VBox vbox3 = new VBox();
        vbox3.setMaxSize(22, 100);
        vbox3.setAlignment(Pos.CENTER);
        vbox3.setStyle("-fx-border-color:black ; -fx-background-color:#4393dd");
        root.setMargin(vbox3, new Insets(0, 0, 8, 0));
        
        Label lab3 = new Label("0");
        lab3.setFont(new Font(30));
        
        Label lab3Bis = new Label("2");
        lab3Bis.setFont(new Font(30));
        
        vbox3.getChildren().addAll(lab3, lab3Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX4 (VBOX)
        ===========================================================================================================
        */
        VBox vbox4 = new VBox();
        vbox4.setMaxSize(22, 100);
        vbox4.setAlignment(Pos.CENTER);
        vbox4.setStyle("-fx-border-color:black ; -fx-background-color:#4d9add");
        root.setMargin(vbox4, new Insets(0, 0, 12, 0));
        
        Label lab4 = new Label("0");
        lab4.setFont(new Font(30));
        
        Label lab4Bis = new Label("3");
        lab4Bis.setFont(new Font(30));
        
        vbox4.getChildren().addAll(lab4, lab4Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX5 (VBOX)
        ===========================================================================================================
        */
        VBox vbox5 = new VBox();
        vbox5.setMaxSize(22, 100);
        vbox5.setAlignment(Pos.CENTER);
        vbox5.setStyle("-fx-border-color:black ; -fx-background-color:#59a0da");
        root.setMargin(vbox5, new Insets(0, 0, 16, 0));
        
        Label lab5 = new Label("0");
        lab5.setFont(new Font(30));
        
        Label lab5Bis = new Label("4");
        lab5Bis.setFont(new Font(30));
        
        vbox5.getChildren().addAll(lab5, lab5Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX6 (VBOX)
        ===========================================================================================================
        */
        VBox vbox6 = new VBox();
        vbox6.setMaxSize(22, 100);
        vbox6.setAlignment(Pos.CENTER);
        vbox6.setStyle("-fx-border-color:black ; -fx-background-color:#63a4d6");
        root.setMargin(vbox6, new Insets(0, 0, 20, 0));
        
        Label lab6 = new Label("0");
        lab6.setFont(new Font(30));
        
        Label lab6Bis = new Label("5");
        lab6Bis.setFont(new Font(30));
        
        vbox6.getChildren().addAll(lab6, lab6Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX7 (VBOX)
        ===========================================================================================================
        */
        VBox vbox7 = new VBox();
        vbox7.setMaxSize(22, 100);
        vbox7.setAlignment(Pos.CENTER);
        vbox7.setStyle("-fx-border-color:black ; -fx-background-color:#83b0d3");
        root.setMargin(vbox7, new Insets(0, 0, 24, 0));
        
        Label lab7 = new Label("0");
        lab7.setFont(new Font(30));
        
        Label lab7Bis = new Label("6");
        lab7Bis.setFont(new Font(30));
        
        vbox7.getChildren().addAll(lab7, lab7Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX8 (VBOX)
        ===========================================================================================================
        */
        VBox vbox8 = new VBox();
        vbox8.setMaxSize(22, 100);
        vbox8.setAlignment(Pos.CENTER);
        vbox8.setStyle("-fx-border-color:black ; -fx-background-color: #8cbfb6");
        root.setMargin(vbox8, new Insets(0, 0, 28, 0));
        
        Label lab8 = new Label("0");
        lab8.setFont(new Font(30));
        
        Label lab8Bis = new Label("7");
        lab8Bis.setFont(new Font(30));
        
        vbox8.getChildren().addAll(lab8, lab8Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX9 (VBOX)
        ===========================================================================================================
        */
        VBox vbox9 = new VBox();
        vbox9.setMaxSize(22, 100);
        vbox9.setAlignment(Pos.CENTER);
        vbox9.setStyle("-fx-border-color:black ; -fx-background-color:  #6fb895");
        root.setMargin(vbox9, new Insets(0, 0, 32, 0));
        
        Label lab9 = new Label("0");
        lab9.setFont(new Font(30));
        
        Label lab9Bis = new Label("8");
        lab9Bis.setFont(new Font(30));
        
        vbox9.getChildren().addAll(lab9, lab9Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX10 (VBOX)
        ===========================================================================================================
        */
        VBox vbox10 = new VBox();
        vbox10.setMaxSize(22, 100);
        vbox10.setAlignment(Pos.CENTER);
        vbox10.setStyle("-fx-border-color:black ; -fx-background-color:  #5bb589");
        root.setMargin(vbox10, new Insets(0, 0, 36, 0));
        
        Label lab10 = new Label("0");
        lab10.setFont(new Font(30));
        
        Label lab10Bis = new Label("9");
        lab10Bis.setFont(new Font(30));
        
        vbox10.getChildren().addAll(lab10, lab10Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX11 (VBOX)
        ===========================================================================================================
        */
        VBox vbox11 = new VBox();
        vbox11.setMaxSize(22, 100);
        vbox11.setAlignment(Pos.CENTER);
        vbox11.setStyle("-fx-border-color:black ; -fx-background-color:  #45ae79");
        root.setMargin(vbox11, new Insets(0, 0, 40, 0));
        
        Label lab11 = new Label("1");
        lab11.setFont(new Font(30));
        
        Label lab11Bis = new Label("0");
        lab11Bis.setFont(new Font(30));
        
        vbox11.getChildren().addAll(lab11, lab11Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX12 (VBOX)
        ===========================================================================================================
        */
        VBox vbox12 = new VBox();
        vbox12.setMaxSize(22, 100);
        vbox12.setAlignment(Pos.CENTER);
        vbox12.setStyle("-fx-border-color:black ; -fx-background-color:  #3fb578");
        root.setMargin(vbox12, new Insets(0, 0, 44, 0));
        
        Label lab12 = new Label("1");
        lab12.setFont(new Font(30));
        
        Label lab12Bis = new Label("1");
        lab12Bis.setFont(new Font(30));
        
        vbox12.getChildren().addAll(lab12, lab12Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX13 (VBOX)
        ===========================================================================================================
        */
        VBox vbox13 = new VBox();
        vbox13.setMaxSize(22, 100);
        vbox13.setAlignment(Pos.CENTER);
        vbox13.setStyle("-fx-border-color:black ; -fx-background-color:  #046b33");
        root.setMargin(vbox13, new Insets(0, 0, 48, 0));
        
        Label lab13 = new Label("1");
        lab13.setFont(new Font(30));
        
        Label lab13Bis = new Label("2");
        lab13Bis.setFont(new Font(30));
        
        vbox13.getChildren().addAll(lab13, lab13Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX14 (VBOX)
        ===========================================================================================================
        */
        VBox vbox14 = new VBox();
        vbox14.setMaxSize(22, 100);
        vbox14.setAlignment(Pos.CENTER);
        vbox14.setStyle("-fx-border-color:black ; -fx-background-color:  #7ebf0f");
        root.setMargin(vbox14, new Insets(0, 0, 52, 0));
        
        Label lab14 = new Label("1");
        lab14.setFont(new Font(30));
        
        Label lab14Bis = new Label("3");
        lab14Bis.setFont(new Font(30));
        
        vbox14.getChildren().addAll(lab14, lab14Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX15 (VBOX)
        ===========================================================================================================
        */
        VBox vbox15 = new VBox();
        vbox15.setMaxSize(22, 100);
        vbox15.setAlignment(Pos.CENTER);
        vbox15.setStyle("-fx-border-color:black ; -fx-background-color:  #b1bc0f");
        root.setMargin(vbox15, new Insets(0, 0, 56, 0));
        
        Label lab15 = new Label("1");
        lab15.setFont(new Font(30));
        
        Label lab15Bis = new Label("4");
        lab15Bis.setFont(new Font(30));
        
        vbox15.getChildren().addAll(lab15, lab15Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX16 (VBOX)
        ===========================================================================================================
        */
        VBox vbox16 = new VBox();
        vbox16.setMaxSize(22, 100);
        vbox16.setAlignment(Pos.CENTER);
        vbox16.setStyle("-fx-border-color:black ; -fx-background-color:  #b7b22d");
        root.setMargin(vbox16, new Insets(0, 0, 60, 0));
        
        Label lab16 = new Label("1");
        lab16.setFont(new Font(30));
        
        Label lab16Bis = new Label("5");
        lab16Bis.setFont(new Font(30));
        
        vbox16.getChildren().addAll(lab16, lab16Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX17 (VBOX)
        ===========================================================================================================
        */
        VBox vbox17 = new VBox();
        vbox17.setMaxSize(22, 100);
        vbox17.setAlignment(Pos.CENTER);
        vbox17.setStyle("-fx-border-color:black ; -fx-background-color:  #ccc430");
        root.setMargin(vbox17, new Insets(0, 0, 64, 0));
        
        Label lab17 = new Label("1");
        lab17.setFont(new Font(30));
        
        Label lab17Bis = new Label("6");
        lab17Bis.setFont(new Font(30));
        
        vbox17.getChildren().addAll(lab17, lab17Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX18 (VBOX)
        ===========================================================================================================
        */
        VBox vbox18 = new VBox();
        vbox18.setMaxSize(22, 100);
        vbox18.setAlignment(Pos.CENTER);
        vbox18.setStyle("-fx-border-color:black ; -fx-background-color:  #d69e2c");
        root.setMargin(vbox18, new Insets(0, 0, 68, 0));
        
        Label lab18 = new Label("1");
        lab18.setFont(new Font(30));
        
        Label lab18Bis = new Label("7");
        lab18Bis.setFont(new Font(30));
        
        vbox18.getChildren().addAll(lab18, lab18Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX19 (VBOX)
        ===========================================================================================================
        */
        VBox vbox19 = new VBox();
        vbox19.setMaxSize(22, 100);
        vbox19.setAlignment(Pos.CENTER);
        vbox19.setStyle("-fx-border-color:black ; -fx-background-color:  #ce8a1c");
        root.setMargin(vbox19, new Insets(0, 0, 72, 0));
        
        Label lab19 = new Label("1");
        lab19.setFont(new Font(30));
        
        Label lab19Bis = new Label("8");
        lab19Bis.setFont(new Font(30));
        
        vbox19.getChildren().addAll(lab19, lab19Bis);
        
        /*
        ===========================================================================================================
                                                        VBOX20 (VBOX)
        ===========================================================================================================
        */
        VBox vbox20 = new VBox();
        vbox20.setMaxSize(22, 100);
        vbox20.setAlignment(Pos.CENTER);
        vbox20.setStyle("-fx-border-color:black ; -fx-background-color:  #e0871a");
        root.setMargin(vbox20, new Insets(0, 0, 76, 0));
        
        Label lab20 = new Label("1");
        lab20.setFont(new Font(30));
        
        Label lab20Bis = new Label("9");
        lab20Bis.setFont(new Font(30));
        
        vbox20.getChildren().addAll(lab20, lab20Bis);
        
        root.getChildren().addAll(vbox1, vbox2, vbox3, vbox4, vbox5, vbox6, vbox7, vbox8, vbox9, vbox10, vbox11, vbox12, vbox13, vbox14, vbox15, vbox16, vbox17, vbox18, vbox19, vbox20);
        
        Scene scene = new Scene(root, 382, 176);
        
        primaryStage.setTitle("Rampe paramétrable");
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
