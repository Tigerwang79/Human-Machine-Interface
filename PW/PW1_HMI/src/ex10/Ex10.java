/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi
 */
public class Ex10 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        HBox root = new HBox();
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-border-color:black ; -fx-border-width:1");
        
        Region region1 = new Region();
        root.setHgrow(region1, Priority.ALWAYS);
        
        Region region2 = new Region();
        root.setHgrow(region2, Priority.ALWAYS);
        
            /*
            ===========================================================================================================
                                                            HBOX1 (HBOX)
            ===========================================================================================================
            */
            HBox hbox1 = new HBox();
            hbox1.setMaxSize(550, 100);
            root.setAlignment(Pos.CENTER);
            hbox1.setStyle("-fx-border-color:cyan ; -fx-border-width:1");
            root.setHgrow(hbox1, Priority.ALWAYS);
            root.setMargin(hbox1, new Insets(0, 0, 20, 0));

                /*
                ===========================================================================================================
                                                                LEFTBOX (VBOX)
                ===========================================================================================================
                */
                VBox leftBox = new VBox();
                leftBox.setMaxSize(183, 100);
                leftBox.setAlignment(Pos.TOP_LEFT);
                hbox1.setHgrow(leftBox, Priority.ALWAYS);

                Label labMetric = new Label("Metric");
                labMetric.setStyle("-fx-font-weight: bold");

                ComboBox comboBoxMillimeter = new ComboBox();
                comboBoxMillimeter.setMaxSize(110, 25);
                leftBox.setVgrow(comboBoxMillimeter, Priority.ALWAYS);
                comboBoxMillimeter.setPromptText("millimeter");
                comboBoxMillimeter.setStyle("-fx-background-radius:0");
                leftBox.setMargin(comboBoxMillimeter, new Insets(15, 0, 0, 0));
                comboBoxMillimeter.setPadding(new Insets(0, 0, 0, -6));

                TextField textFieldLeftBox = new TextField();
                textFieldLeftBox.setMaxSize(160, 15);
                leftBox.setVgrow(textFieldLeftBox, Priority.ALWAYS);
                textFieldLeftBox.setPromptText("0.00");
                textFieldLeftBox.setText("0.00");
                textFieldLeftBox.setAlignment(Pos.CENTER_RIGHT);
                textFieldLeftBox.setStyle("-fx-border-color:blue");
                leftBox.setMargin(textFieldLeftBox, new Insets(28, 0, 0, 0));
                textFieldLeftBox.setPadding(new Insets(-2, 0, -2, 0));


                leftBox.getChildren().addAll(labMetric, comboBoxMillimeter, textFieldLeftBox);

                /*
                ===========================================================================================================
                                                                CENTERBOX (VBOX)
                ===========================================================================================================
                */
                VBox centerBox = new VBox();
                centerBox.setMaxSize(184, 100);
                centerBox.setAlignment(Pos.CENTER);
                hbox1.setHgrow(centerBox, Priority.ALWAYS);

                Button millToImp = new Button("-->");
                millToImp.setMaxSize(60, 25);
                centerBox.setVgrow(millToImp, Priority.ALWAYS);
                centerBox.setMargin(millToImp, new Insets(0, 10, 27, 0));

                millToImp.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        System.out.println("Conversion millimeters to inches... ");
                    }
                });

                Button impToMill = new Button("<--");
                impToMill.setMaxSize(60, 25);
                centerBox.setVgrow(impToMill, Priority.ALWAYS);
                centerBox.setMargin(impToMill, new Insets(0, 10, 0, 0));

                impToMill.setOnAction(new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent event) {
                        System.out.println("Conversion inches to millimeters... ");
                    }
                });


                centerBox.getChildren().addAll(millToImp, impToMill);

                /*
                ===========================================================================================================
                                                                RIGHTBOX (VBOX)
                ===========================================================================================================
                */
                VBox rightBox = new VBox();
                rightBox.setMaxSize(165, 100);
                rightBox.setAlignment(Pos.TOP_LEFT);
                hbox1.setHgrow(rightBox, Priority.ALWAYS);

                Label labImperial = new Label("Imperial");
                labImperial.setStyle("-fx-font-weight: Bold");

                ComboBox comboBoxImperial = new ComboBox();
                comboBoxImperial.setMaxSize(70, 25);
                rightBox.setVgrow(comboBoxImperial, Priority.ALWAYS);
                comboBoxImperial.setPromptText("inch");
                comboBoxImperial.setStyle("-fx-background-radius:0");
                rightBox.setMargin(comboBoxImperial, new Insets(15, 0, 0, 0));
                comboBoxMillimeter.setPadding(new Insets(0, -4, 0, -6));

                TextField textFieldRightBox = new TextField();
                textFieldRightBox.setMaxSize(165, 15);
                rightBox.setVgrow(textFieldRightBox, Priority.ALWAYS);
                textFieldRightBox.setPromptText("0.00");
                textFieldRightBox.setText("0.00");
                textFieldRightBox.setAlignment(Pos.CENTER_RIGHT);
                textFieldRightBox.setStyle("-fx-border-color:blue");
                rightBox.setMargin(textFieldRightBox, new Insets(28, 0, 0, 0));
                textFieldRightBox.setPadding(new Insets(-2, 0, -2, 0));

                rightBox.getChildren().addAll(labImperial, comboBoxImperial, textFieldRightBox);

            hbox1.getChildren().addAll(leftBox, centerBox, rightBox);
        
        root.getChildren().addAll(region1, hbox1, region2);
        
        Scene scene = new Scene(root, 600, 150);
        
        primaryStage.setTitle("ComboBox");
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
