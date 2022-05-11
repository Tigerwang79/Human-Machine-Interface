/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex05;

import java.util.Optional;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi
 */
public class Ex05 extends Application {
    
    Button[][] matrix;
    private int compteur = 0;
    
    @Override
    public void start(Stage primaryStage) {
        
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(20);
        
            /*
            ===========================================================================================================
                                                            HBOXLABEL (HBOX)
            ===========================================================================================================
            */
            HBox hboxLabel = new HBox();
            hboxLabel.setMaxSize(500, 50);
            hboxLabel.setAlignment(Pos.CENTER);
            hboxLabel.setStyle("-fx-border-color:black ; -fx-border-width:1");
            
            Label label1 = new Label("Coordonnées du bouton n°X :");
            label1.setUnderline(true);
            
            Label label2 = new Label(" ( i , j )");
            
            hboxLabel.getChildren().addAll(label1, label2);
            
            GridPane grid = new GridPane();
            grid.setAlignment(Pos.CENTER);
            grid.setHgap(6);
            grid.setVgap(6);
            root.setMargin(grid, new Insets(0, 20, 0, 20));
            
            int width = 11;
            int height = 11;
            
            
            matrix = new Button[width][height];
            
            for(int i = 1 ; i < width ; i ++)
            {
                for(int j = 1 ; j < height ; j++)
                {
                    compteur++;
                    matrix[i][j] = new Button("N°"+ compteur);
                    grid.add(matrix[i][j], j, i);

                    String str_i = Integer.toString(i);
                    String str_j = Integer.toString(j);
                    String str_cmpt = Integer.toString(compteur);

                    matrix[i][j].setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event) {
                            label1.setText("Coordonnées du bouton n°" + str_cmpt + " :");
                            label1.setUnderline(true);
                            label2.setText(" ( " + str_i + " , " + str_j + " )");
                            
                            Alert myPopUp1 = new Alert(AlertType.INFORMATION);
                            myPopUp1.setTitle("Coordonnées du bouton n°" + str_cmpt + " :");
                            myPopUp1.setContentText(" ( " + str_i + " , " + str_j + " )");
                            myPopUp1.show();
                        }
                    });
                }
            }
            
            Button btnQuit = new Button("Quit");
            
            btnQuit.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Alert myPopUp2 = new Alert(AlertType.CONFIRMATION);
                    myPopUp2.setTitle("Quitter l'application");
                    myPopUp2.setContentText("Êtes vous sûr de vouloir quitter l'application?");
                    Optional<ButtonType> option = myPopUp2.showAndWait();
                    myPopUp2.show();
                    if (option.get() == ButtonType.OK){
                       Platform.exit(); 
                    }
                }
            });
            
        root.getChildren().addAll(hboxLabel, grid, btnQuit);
        
        Scene scene = new Scene(root, 650, 500);
        
        primaryStage.setTitle("Exercice 05");
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
