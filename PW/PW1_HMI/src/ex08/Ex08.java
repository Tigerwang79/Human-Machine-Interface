/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex08;

import java.util.Optional;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.Side;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi
 */
public class Ex08 extends Application {
    
    Label[][] labelDamier;
    Label[][] labelExcept;
    
    /*
    *===========================================================================================================
    *   JOUEUR P0 "LE BON"
    *============================================================================================================
    */
    private final int initialPosIP0 = 5;
    private int currentPosIP0 = 0;
    private int finalPosIP0 = initialPosIP0;
    
    private final int initialPosJP0 = 4;
    private int currentPosJP0 = 0;
    private int finalPosJP0 = initialPosJP0;
    
    private boolean killedP0 = false;
    
    /*
    *===========================================================================================================
    *   JOUEUR P1 "LA BRUTE"
    *============================================================================================================
    */
    private final int initialPosIP1 = 2;
    private int currentPosIP1 = 0;
    private int finalPosIP1 = initialPosIP1;
    
    private final int initialPosJP1 = 3;
    private int currentPosJP1 = 0;
    private int finalPosJP1 = initialPosJP1;
    
    private boolean killedP1 = false;
    
    /*
    *===========================================================================================================
    *   JOUEUR P2 "LE TRUAND"
    *============================================================================================================
    */
    private final int initialPosIP2 = 2;
    private int currentPosIP2 = 0;
    private int finalPosIP2 = initialPosIP2;
    
    private final int initialPosJP2 = 4;
    private int currentPosJP2 = 0;
    private int finalPosJP2 = initialPosJP2;
    
    private boolean killedP2 = false;
    
    @Override
    public void start(Stage primaryStage) {
        
        HBox root = new HBox();
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-border-color:black ; -fx-border-width:2");
        
        
        /*
        ===========================================================================================================
                                                        LEFTBOX (VBOX)
        ===========================================================================================================
        */
        VBox leftBox = new VBox();
        leftBox.setPrefSize(300, 350);
        leftBox.setAlignment(Pos.TOP_CENTER);
        leftBox.setPadding(new Insets(0, 0, 10, 0));
        
        Label titleLab = new Label("Plateau de Jeu");
        leftBox.setVgrow(titleLab, Priority.ALWAYS);
        leftBox.setMargin(titleLab, new Insets(15,0,0,0));
        
            /*
            ===========================================================================================================
                                                            DAMIER (GRIDPANE)
            ===========================================================================================================
            */
            GridPane damier = new GridPane();
            damier.setMaxSize(300, 260);
            damier.setStyle("-fx-border-color:red ; -fx-border-width:4 ; -fx-border-radius:5");
            damier.setAlignment(Pos.CENTER);
            damier.setHgap(3);
            damier.setVgap(3);
            damier.setPadding(new Insets(5, 5, 5, 0));
            leftBox.setMargin(damier, new Insets(5, 10, 5, 10));
            
            int width = 11;
            int height = 11;

            final int a0 = 0;
            final int a1 = 1;
            final int a2 = 2;
            final int a3 = 3;
            final int a4 = 4;
            final int a5 = 5;
            final int a6 = 6;
            final int a7 = 7;
            final int a8 = 8;
            final int a9 = 9;
            final int a10 = 10;
            
            final int x1 = 3;
            final int y1 = 2;

            final int x2 = 4;
            final int y2 = 2;

            labelDamier = new Label[width][height];
            labelExcept = new Label[width][height];
            
            for(int i = 0 ; i <= width ; i ++) {
                for (int j = 0 ; j <= height ; j++) {
                    if (i == a0 && j == a1) {
                        labelExcept[i][j] = new Label(" A ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a0 && j == a2) {
                        labelExcept[i][j] = new Label(" B ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a0 && j == a3) {
                        labelExcept[i][j] = new Label(" C ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a0 && j == a4) {
                        labelExcept[i][j] = new Label(" D ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a0 && j == a5) {
                        labelExcept[i][j] = new Label(" E ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a0 && j == a6) {
                        labelExcept[i][j] = new Label(" F ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a0 && j == a7) {
                        labelExcept[i][j] = new Label(" G ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a0 && j == a8) {
                        labelExcept[i][j] = new Label(" H ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a0 && j == a9) {
                        labelExcept[i][j] = new Label(" I ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a0 && j == a10) {
                        labelExcept[i][j] = new Label(" J ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a1 && j == a0) {
                        labelExcept[i][j] = new Label("  1 ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a2 && j == a0) {
                        labelExcept[i][j] = new Label("  2 ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a3 && j == a0) {
                        labelExcept[i][j] = new Label("  3 ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a4 && j == a0) {
                        labelExcept[i][j] = new Label("  4 ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a5 && j == a0) {
                        labelExcept[i][j] = new Label("  5 ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a6 && j == a0) {
                        labelExcept[i][j] = new Label("  6 ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a7 && j == a0) {
                        labelExcept[i][j] = new Label("  7 ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a8 && j == a0) {
                        labelExcept[i][j] = new Label("  8 ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a9 && j == a0) {
                        labelExcept[i][j] = new Label("  9 ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == a10 && j == a0) {
                        labelExcept[i][j] = new Label(" 10 ");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                }
            }
            
            for(int i = 1 ; i < width ; i++) {
                for(int j = 1 ; j < height ; j++) {
                    labelDamier[i][j] = new Label("     ");
                    labelDamier[i][j].setStyle("-fx-background-color:red");
                    damier.add(labelDamier[i][j], j, i);

                    if(i == y1 && j == x1) {
                        labelExcept[i][j] = new Label("  1 ");
                        labelExcept[i][j].setStyle("-fx-background-color:green");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == y2 && j == x2) {
                        labelExcept[i][j] = new Label("  2 ");
                        labelExcept[i][j].setStyle("-fx-background-color:cyan");
                        damier.add(labelExcept[i][j], j, i);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                    else if(i == initialPosIP0 && j == initialPosJP0) {
                        labelExcept[i][j] = new Label("  0 ");
                        labelExcept[i][j].setStyle("-fx-background-color:grey");
                        damier.add(labelExcept[i][j], initialPosJP0, initialPosIP0);
                        labelExcept[i][j].setAlignment(Pos.CENTER);
                    }
                }
            }
            
            
            
            /*
            ===========================================================================================================
                                                            BUTTONBOX (HBOX)
            ===========================================================================================================
            */
            HBox buttonBox = new HBox();
            buttonBox.setPrefSize(280, 25);
            buttonBox.setAlignment(Pos.CENTER);
            leftBox.setVgrow(buttonBox, Priority.ALWAYS);
            leftBox.setMargin(buttonBox, new Insets(0, 5, 0, 5));
            
            Button btnReset = new Button("reset");
            btnReset.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                           for(int i = 1 ; i < width ; i++) {
                               for(int j = 1 ; j < height ; j++) {
                                    labelDamier[i][j] = new Label("     ");
                                    labelDamier[i][j].setStyle("-fx-background-color:red");
                                    damier.add(labelDamier[i][j], j, i);

                                    if(i == initialPosIP0 && j == initialPosJP0) {
                                        labelExcept[i][j] = new Label("  0 ");
                                        labelExcept[i][j].setStyle("-fx-background-color:grey");
                                        damier.add(labelExcept[i][j], initialPosJP0, initialPosIP0);
                                        labelExcept[i][j].setAlignment(Pos.CENTER);
                                        
                                        finalPosIP0 = initialPosIP0;
                                        finalPosJP0 = initialPosJP0;
                                        killedP0 = false;
                                    }
                                    else if(i == initialPosIP1 && j == initialPosJP1) {
                                        labelExcept[i][j] = new Label("  1 ");
                                        labelExcept[i][j].setStyle("-fx-background-color:green");
                                        damier.add(labelExcept[i][j], j, i);
                                        labelExcept[i][j].setAlignment(Pos.CENTER);
                                        
                                        finalPosIP1 = initialPosIP1;
                                        finalPosJP1 = initialPosJP1;
                                        killedP1 = false;
                                    }
                                    else if(i == initialPosIP2 && j == initialPosJP2) {
                                        labelExcept[i][j] = new Label("  2 ");
                                        labelExcept[i][j].setStyle("-fx-background-color:cyan");
                                        damier.add(labelExcept[i][j], j, i);
                                        labelExcept[i][j].setAlignment(Pos.CENTER);
                                        
                                        finalPosIP2 = initialPosIP2;
                                        finalPosJP2 = initialPosJP2;
                                        killedP2 = false;
                                    }
                               }
                           }
                           event.consume();
                        }
                    });
            
            Region region1 = new Region();
            buttonBox.setHgrow(region1, Priority.ALWAYS);
            
            Button btnQuit = new Button("quit");
            
            btnQuit.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event){
                    Alert myPopUp1 = new Alert(Alert.AlertType.CONFIRMATION);
                    myPopUp1.setTitle("Quitter l'application");
                    myPopUp1.setContentText("Êtes vous sûr de vouloir quitter l'application?");
                    Optional<ButtonType> option = myPopUp1.showAndWait();
                    myPopUp1.show();
                    if (option.get() == ButtonType.OK){
                       Platform.exit();
                       System.out.println("Merci de votre visite à bientôt !");
                    }
                }
            });
            
            buttonBox.getChildren().addAll(btnReset, region1, btnQuit);
            
        
            
        leftBox.getChildren().addAll(titleLab, damier, buttonBox);
        /*
        ===========================================================================================================
                                                        RIGHTBOX (TABPANE)
        ===========================================================================================================
        */
        TabPane rightBox = new TabPane();
        rightBox.setPrefSize(300, 350);
        rightBox.setSide(Side.TOP);
        rightBox.setStyle("-fx-border-color:blue ; -fx-border-width:5 ; -fx-border-radius:5");
        
            /*
            ===========================================================================================================
                                                            BONTAB (TAB)
            ===========================================================================================================
            */
            Tab bonTab = new Tab("0: le bon");
            bonTab.setClosable(true);
            
                /*
                ===========================================================================================================
                                                                BONBOX (VBOX)
                ===========================================================================================================
                */
                VBox bonBox = new VBox();
                bonBox.setAlignment(Pos.TOP_LEFT);
                bonBox.setStyle("-fx-border-color:green ; -fx-border-width:5 ; -fx-border-radius:1");
                
                ToggleGroup groupBon = new ToggleGroup();
                        
                RadioButton radioBon1 = new RadioButton("elfe");
                bonBox.setMargin(radioBon1, new Insets(35, 0, 0, 30));
                radioBon1.setToggleGroup(groupBon);
                
                RadioButton radioBon2 = new RadioButton("magicien");
                bonBox.setMargin(radioBon2, new Insets(10, 0, 0, 30));
                radioBon2.setToggleGroup(groupBon);
                
                RadioButton radioBon3 = new RadioButton("chasseur");
                bonBox.setMargin(radioBon3, new Insets(10, 0, 0, 30));
                radioBon3.setToggleGroup(groupBon);
                radioBon3.setSelected(true);
                
                RadioButton radioBon4 = new RadioButton("lapin");
                bonBox.setMargin(radioBon4, new Insets(10, 0, 0, 30));
                radioBon4.setToggleGroup(groupBon);
                
                Region region2 = new Region();
                region2.setPrefSize(300, 50);
                
                    /*
                    ===========================================================================================================
                                                                    BONDIR (BORDERPANE)
                    ===========================================================================================================
                    */
                    BorderPane bonDir = new BorderPane();
                    bonDir.setMaxSize(160, 115);
                    bonDir.setStyle("-fx-border-color:yellow ; -fx-border-width:5 ; -fx-border-radius:5");
                    bonBox.setMargin(bonDir, new Insets(0, 60, 20, 60));
                    //bonBox.setVgrow(bonDir, Priority.ALWAYS);
                    
                    //Image imageFlecheHaut = new Image(getClass().getResourceAsStream("ex08/fleche_haut.png"));
                    //ImageView iconeFlecheHaut = new ImageView(imageFlecheHaut);
                    Button btnBonHaut = new Button("H");
                    btnBonHaut.setAlignment(Pos.CENTER);
                    btnBonHaut.setMaxSize(30, 30);
                    bonDir.setMargin(btnBonHaut, new Insets(0, 0, 0, 55));
                    bonDir.setTop(btnBonHaut);
                    
                    btnBonHaut.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                           currentPosIP0 = finalPosIP0;
                           currentPosJP0 = finalPosJP0;
                           if(currentPosIP0 > 1) {
                           for(int i = 1 ; i < width ; i++) {
                               for(int j = 1 ; j < height ; j++) {
                                        if (killedP0 == false && i == currentPosIP0 && j == currentPosJP0) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP0, currentPosIP0);

                                            currentPosIP0 -= 1;

                                            labelExcept[i][j] = new Label("  0 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:grey");
                                            damier.add(labelExcept[i][j], currentPosJP0, currentPosIP0);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);

                                            finalPosIP0 = currentPosIP0;
                                            finalPosJP0 = currentPosJP0;
                                       }
                                        else if(currentPosIP0-1 == finalPosIP1 && currentPosJP0 == finalPosJP1){
                                            killedP1 = true;
                                        }
                                        else if(currentPosIP0-1 == finalPosIP2 && currentPosJP0 == finalPosJP2) {
                                            killedP2 = true;
                                        }
                                   }
                               }
                           }
                           event.consume();
                        }
                    });
                    
                    //Image imageFlecheBas = new Image(getClass().getResourceAsStream("ex08/fleche_bas.png"));
                    //ImageView iconeFlecheBas = new ImageView(imageFlecheBas);
                    Button btnBonBas = new Button("B");
                    btnBonBas.setAlignment(Pos.CENTER);
                    btnBonBas.setMaxSize(30, 30);
                    bonDir.setMargin(btnBonBas, new Insets(0, 0, 0, 55));
                    bonDir.setBottom(btnBonBas);
                    
                    btnBonBas.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                            currentPosIP0 = finalPosIP0;
                            currentPosJP0 = finalPosJP0;
                            if(currentPosIP0 < 10) {
                                for(int i = 1 ; i < width ; i++) {
                                    for(int j = 1 ; j < height ; j++) {
                                        if (killedP0 == false && i == currentPosIP0 && j == currentPosJP0) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP0, currentPosIP0);
                                            
                                            int newPosIP0 = currentPosIP0 + 1;

                                            labelExcept[i][j] = new Label("  0 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:grey");
                                            damier.add(labelExcept[i][j], currentPosJP0, newPosIP0);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP0 = newPosIP0;
                                            finalPosJP0 = currentPosJP0;
                                        }
                                        else if(currentPosIP0+1 == finalPosIP1 && currentPosJP0 == finalPosJP1){
                                            killedP1 = true;
                                        }
                                        else if(currentPosIP0+1 == finalPosIP2 && currentPosJP0 == finalPosJP2) {
                                            killedP2 = true;
                                        }
                                    }
                                }
                            }
                           event.consume();
                        }
                    });
                    
                    //Image imageFlecheGauche = new Image(getClass().getResourceAsStream("ex08/fleche_gauche.png"));
                    //ImageView iconeFlecheGauche = new ImageView(imageFlecheGauche);
                    Button btnBonGauche = new Button("G");
                    btnBonGauche.setAlignment(Pos.CENTER);
                    btnBonGauche.setMaxSize(30, 30);
                    bonDir.setMargin(btnBonGauche, new Insets(0, 0, 0, 20));
                    bonDir.setLeft(btnBonGauche);
                    
                    btnBonGauche.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                           currentPosIP0 = finalPosIP0;
                           currentPosJP0 = finalPosJP0;
                           if(currentPosJP0 > 1) {
                           for(int i = 1 ; i < width ; i++) {
                               for(int j = 1 ; j < height ; j++) {
                                        if (killedP0 == false && i == currentPosIP0 && j == currentPosJP0) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP0, currentPosIP0);
                                            
                                            currentPosJP0 -= 1;
                                            
                                            labelExcept[i][j] = new Label("  0 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:grey");
                                            damier.add(labelExcept[i][j], currentPosJP0, currentPosIP0);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP0 = currentPosIP0;
                                            finalPosJP0 = currentPosJP0;
                                       }
                                        else if(currentPosIP0 == finalPosIP1 && currentPosJP0-1 == finalPosJP1){
                                            killedP1 = true;
                                        }
                                        else if(currentPosIP0 == finalPosIP2 && currentPosJP0-1 == finalPosJP2) {
                                            killedP2 = true;
                                        }
                                   }
                               }
                           }
                           event.consume();
                        }
                    });
                    
                    //Image imageFlecheDroite = new Image(getClass().getResourceAsStream("ex08/fleche_droite.png"));
                    //ImageView iconeFlecheDroite = new ImageView(imageFlecheDroite);
                    Button btnBonDroite = new Button("D");
                    btnBonDroite.setAlignment(Pos.CENTER);
                    btnBonDroite.setMaxSize(30, 30);
                    bonDir.setMargin(btnBonDroite, new Insets(0, 25, 0, 0));
                    bonDir.setRight(btnBonDroite);
                    
                    btnBonDroite.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                            currentPosIP0 = finalPosIP0;
                            currentPosJP0 = finalPosJP0;
                            if(currentPosJP0 < 10) {
                                for(int i = 1 ; i < width ; i++) {
                                    for(int j = 1 ; j < height ; j++) {
                                        if (killedP0 == false && i == currentPosIP0 && j == currentPosJP0) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP0, currentPosIP0);
                                            
                                            int newPosJ = currentPosJP0 + 1;

                                            labelExcept[i][j] = new Label("  0 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:grey");
                                            damier.add(labelExcept[i][j], newPosJ, currentPosIP0);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP0 = currentPosIP0;
                                            finalPosJP0 = newPosJ;
                                        }
                                        else if(currentPosIP0 == finalPosIP1 && currentPosJP0+1 == finalPosJP1){
                                            killedP1 = true;
                                        }
                                        else if(currentPosIP0 == finalPosIP2 && currentPosJP0+1 == finalPosJP2) {
                                            killedP2 = true;
                                        }
                                    }
                                }
                            }
                           event.consume();
                        }
                    });
                
                bonBox.getChildren().addAll(radioBon1, radioBon2, radioBon3, radioBon4, region2, bonDir);
                
            bonTab.setContent(bonBox);
                
            /*
            ===========================================================================================================
                                                            BRUTETAB (TAB)
            ===========================================================================================================
            */
            Tab bruteTab = new Tab("1: la brute");
            bonTab.setClosable(true);
            
                /*
                ===========================================================================================================
                                                                BRUTEBOX (VBOX)
                ===========================================================================================================
                */
                VBox bruteBox = new VBox();
                bruteBox.setAlignment(Pos.TOP_LEFT);
                bruteBox.setStyle("-fx-border-color:green ; -fx-border-width:5 ; -fx-border-radius:1");
                
                ToggleGroup groupBrute = new ToggleGroup();
                        
                RadioButton radioBrute1 = new RadioButton("elfe");
                bruteBox.setMargin(radioBrute1, new Insets(35, 0, 0, 30));
                radioBrute1.setToggleGroup(groupBrute);
                
                RadioButton radioBrute2 = new RadioButton("magicien");
                bruteBox.setMargin(radioBrute2, new Insets(10, 0, 0, 30));
                radioBrute2.setToggleGroup(groupBrute);
                radioBrute2.setSelected(true);
                
                RadioButton radioBrute3 = new RadioButton("chasseur");
                bruteBox.setMargin(radioBrute3, new Insets(10, 0, 0, 30));
                radioBrute3.setToggleGroup(groupBrute);
                
                
                RadioButton radioBrute4 = new RadioButton("lapin");
                bruteBox.setMargin(radioBrute4, new Insets(10, 0, 0, 30));
                radioBrute4.setToggleGroup(groupBrute);
                
                Region region3 = new Region();
                region3.setPrefSize(300, 50);
                
                    /*
                    ===========================================================================================================
                                                                    BRUTEDIR (BORDERPANE)
                    ===========================================================================================================
                    */
                    BorderPane bruteDir = new BorderPane();
                    bruteDir.setMaxSize(160, 115);
                    bruteDir.setStyle("-fx-border-color:purple ; -fx-border-width:5 ; -fx-border-radius:5");
                    bruteBox.setMargin(bruteDir, new Insets(0, 60, 20, 60));
                    //bonBox.setVgrow(bonDir, Priority.ALWAYS);
                    
                    //Image imageFlecheHaut = new Image(getClass().getResourceAsStream("ex08/fleche_haut.png"));
                    //ImageView iconeFlecheHaut = new ImageView(imageFlecheHaut);
                    Button btnBruteHaut = new Button("H");
                    btnBruteHaut.setAlignment(Pos.CENTER);
                    btnBruteHaut.setMaxSize(30, 30);
                    bruteDir.setMargin(btnBruteHaut, new Insets(0, 0, 0, 55));
                    bruteDir.setTop(btnBruteHaut);
                    
                    btnBruteHaut.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                           currentPosIP1 = finalPosIP1;
                           currentPosJP1 = finalPosJP1;
                           if(currentPosIP1 > 1) {
                           for(int i = 1 ; i < width ; i++) {
                               for(int j = 1 ; j < height ; j++) {
                                        if (killedP1 == false && i == currentPosIP1 && j == currentPosJP1) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP1, currentPosIP1);
                                            
                                            currentPosIP1 -= 1;
                                            
                                            labelExcept[i][j] = new Label("  1 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:green");
                                            damier.add(labelExcept[i][j], currentPosJP1, currentPosIP1);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP1 = currentPosIP1;
                                            finalPosJP1 = currentPosJP1;
                                       }
                                        else if(currentPosIP1-1 == finalPosIP0 && currentPosJP1 == finalPosJP0){
                                            killedP0 = true;
                                        }
                                        else if(currentPosIP1-1 == finalPosIP2 && currentPosJP1 == finalPosJP2) {
                                            killedP2 = true;
                                        }
                                   }
                               }
                           }
                           event.consume();
                        }
                    });
                    
                    //Image imageFlecheBas = new Image(getClass().getResourceAsStream("ex08/fleche_bas.png"));
                    //ImageView iconeFlecheBas = new ImageView(imageFlecheBas);
                    Button btnBruteBas = new Button("B");
                    btnBruteBas.setAlignment(Pos.CENTER);
                    btnBruteBas.setMaxSize(30, 30);
                    bruteDir.setMargin(btnBruteBas, new Insets(0, 0, 0, 55));
                    bruteDir.setBottom(btnBruteBas);
                    
                    btnBruteBas.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                            currentPosIP1 = finalPosIP1;
                            currentPosJP1 = finalPosJP1;
                            if(currentPosIP1 < 10) {
                                for(int i = 1 ; i < width ; i++) {
                                    for(int j = 1 ; j < height ; j++) {
                                        if (killedP1 == false && i == currentPosIP1 && j == currentPosJP1) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP1, currentPosIP1);
                                            
                                            int newPosIP1 = currentPosIP1 + 1;

                                            labelExcept[i][j] = new Label("  1 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:green");
                                            damier.add(labelExcept[i][j], currentPosJP1, newPosIP1);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP1 = newPosIP1;
                                            finalPosJP1 = currentPosJP1;
                                        }
                                        else if(currentPosIP1+1 == finalPosIP0 && currentPosJP1 == finalPosJP0){
                                            killedP0 = true;
                                        }
                                        else if(currentPosIP1+1 == finalPosIP2 && currentPosJP1 == finalPosJP2) {
                                            killedP2 = true;
                                        }
                                    }
                                }
                            }
                           event.consume();
                        }
                    });
                    
                    //Image imageFlecheGauche = new Image(getClass().getResourceAsStream("ex08/fleche_gauche.png"));
                    //ImageView iconeFlecheGauche = new ImageView(imageFlecheGauche);
                    Button btnBruteGauche = new Button("G");
                    btnBruteGauche.setAlignment(Pos.CENTER);
                    btnBruteGauche.setMaxSize(30, 30);
                    bruteDir.setMargin(btnBruteGauche, new Insets(0, 0, 0, 20));
                    bruteDir.setLeft(btnBruteGauche);
                    
                    btnBruteGauche.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                           currentPosIP1 = finalPosIP1;
                           currentPosJP1 = finalPosJP1;
                           if(currentPosJP1 > 1) {
                           for(int i = 1 ; i < width ; i++) {
                               for(int j = 1 ; j < height ; j++) {
                                        if (killedP1 == false && i == currentPosIP1 && j == currentPosJP1) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP1, currentPosIP1);
                                            
                                            currentPosJP1 -= 1;
                                            
                                            labelExcept[i][j] = new Label("  1 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:green");
                                            damier.add(labelExcept[i][j], currentPosJP1, currentPosIP1);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP1 = currentPosIP1;
                                            finalPosJP1 = currentPosJP1;
                                       }
                                        else if(currentPosIP1 == finalPosIP0 && currentPosJP1-1 == finalPosJP0){
                                            killedP0 = true;
                                        }
                                        else if(currentPosIP1 == finalPosIP2 && currentPosJP1-1 == finalPosJP2) {
                                            killedP2 = true;
                                        }
                                   }
                               }
                           }
                           event.consume();
                        }
                    });
                    
                    //Image imageFlecheDroite = new Image(getClass().getResourceAsStream("ex08/fleche_droite.png"));
                    //ImageView iconeFlecheDroite = new ImageView(imageFlecheDroite);
                    Button btnBruteDroite = new Button("D");
                    btnBruteDroite.setAlignment(Pos.CENTER);
                    btnBruteDroite.setMaxSize(30, 30);
                    bruteDir.setMargin(btnBruteDroite, new Insets(0, 25, 0, 0));
                    bruteDir.setRight(btnBruteDroite);
                    
                    btnBruteDroite.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                            currentPosIP1 = finalPosIP1;
                            currentPosJP1 = finalPosJP1;
                            if(currentPosJP1 < 10) {
                                for(int i = 1 ; i < width ; i++) {
                                    for(int j = 1 ; j < height ; j++) {
                                        if (killedP1 == false && i == currentPosIP1 && j == currentPosJP1) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP1, currentPosIP1);
                                            
                                            int newPosJP1 = currentPosJP1 + 1;

                                            labelExcept[i][j] = new Label("  1 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:green");
                                            damier.add(labelExcept[i][j], newPosJP1, currentPosIP1);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP1 = currentPosIP1;
                                            finalPosJP1 = newPosJP1;
                                        }
                                        else if(currentPosIP1 == finalPosIP0 && currentPosJP1+1 == finalPosJP0){
                                            killedP0 = true;
                                        }
                                        else if(currentPosIP1 == finalPosIP2 && currentPosJP1+1 == finalPosJP2) {
                                            killedP2 = true;
                                        }
                                    }
                                }
                            }
                           event.consume();
                        }
                    });
                
                bruteBox.getChildren().addAll(radioBrute1, radioBrute2, radioBrute3, radioBrute4, region3, bruteDir);
                
            bruteTab.setContent(bruteBox);
            
            /*
            ===========================================================================================================
                                                            TRUANDTAB (TAB)
            ===========================================================================================================
            */
            Tab truandTab = new Tab("2: le truand");
            truandTab.setClosable(true);
            
                /*
                ===========================================================================================================
                                                                TRUANDBOX (VBOX)
                ===========================================================================================================
                */
                VBox truandBox = new VBox();
                truandBox.setAlignment(Pos.TOP_LEFT);
                truandBox.setStyle("-fx-border-color:green ; -fx-border-width:5 ; -fx-border-radius:1");
                
                ToggleGroup groupTruand = new ToggleGroup();
                        
                RadioButton radioTruand1 = new RadioButton("elfe");
                truandBox.setMargin(radioTruand1, new Insets(35, 0, 0, 30));
                radioTruand1.setToggleGroup(groupTruand);
                radioTruand1.setSelected(true);
                
                RadioButton radioTruand2 = new RadioButton("magicien");
                truandBox.setMargin(radioTruand2, new Insets(10, 0, 0, 30));
                radioTruand2.setToggleGroup(groupTruand);
                
                RadioButton radioTruand3 = new RadioButton("chasseur");
                truandBox.setMargin(radioTruand3, new Insets(10, 0, 0, 30));
                radioTruand3.setToggleGroup(groupTruand);
                
                
                RadioButton radioTruand4 = new RadioButton("lapin");
                truandBox.setMargin(radioTruand4, new Insets(10, 0, 0, 30));
                radioTruand4.setToggleGroup(groupTruand);
                
                Region region4 = new Region();
                region4.setPrefSize(300, 50);
                
                    /*
                    ===========================================================================================================
                                                                    TRUANDDIR (BORDERPANE)
                    ===========================================================================================================
                    */
                    BorderPane truandDir = new BorderPane();
                    truandDir.setMaxSize(160, 115);
                    truandDir.setStyle("-fx-border-color:blue ; -fx-border-width:5 ; -fx-border-radius:5");
                    truandBox.setMargin(truandDir, new Insets(0, 60, 20, 60));
                    
                    //Image imageFlecheHaut = new Image(getClass().getResourceAsStream("ex08/fleche_haut.png"));
                    //ImageView iconeFlecheHaut = new ImageView(imageFlecheHaut);
                    Button btnTruandHaut = new Button("H");
                    btnTruandHaut.setAlignment(Pos.CENTER);
                    btnTruandHaut.setMaxSize(30, 30);
                    truandDir.setMargin(btnTruandHaut, new Insets(0, 0, 0, 55));
                    truandDir.setTop(btnTruandHaut);
                    
                    btnTruandHaut.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                           currentPosIP2 = finalPosIP2;
                           currentPosJP2 = finalPosJP2;
                           if(currentPosIP2 > 1) {
                           for(int i = 1 ; i < width ; i++) {
                               for(int j = 1 ; j < height ; j++) {
                                        if (killedP2 == false && i == currentPosIP2 && j == currentPosJP2) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP2, currentPosIP2);
                                            
                                            currentPosIP2 -= 1;
                                            
                                            labelExcept[i][j] = new Label("  2 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:cyan");
                                            damier.add(labelExcept[i][j], currentPosJP2, currentPosIP2);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP2 = currentPosIP2;
                                            finalPosJP2 = currentPosJP2;
                                       }
                                        else if(currentPosIP2-1 == finalPosIP0 && currentPosJP2 == finalPosJP0) {
                                            killedP0 = true;
                                        }
                                        else if(currentPosIP2-1 == finalPosIP1 && currentPosJP2 == finalPosJP1) {
                                            killedP1 = true;
                                        }
                                   }
                               }
                           }
                           event.consume();
                        }
                    });
                    
                    //Image imageFlecheBas = new Image(getClass().getResourceAsStream("ex08/fleche_bas.png"));
                    //ImageView iconeFlecheBas = new ImageView(imageFlecheBas);
                    Button btnTruandBas = new Button("B");
                    btnTruandBas.setAlignment(Pos.CENTER);
                    btnTruandBas.setMaxSize(30, 30);
                    truandDir.setMargin(btnTruandBas, new Insets(0, 0, 0, 55));
                    truandDir.setBottom(btnTruandBas);
                    
                    btnTruandBas.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                            currentPosIP2 = finalPosIP2;
                            currentPosJP2 = finalPosJP2;
                            if(currentPosIP2 < 10) {
                                for(int i = 1 ; i < width ; i++) {
                                    for(int j = 1 ; j < height ; j++) {
                                        if (killedP2 == false && i == currentPosIP2 && j == currentPosJP2) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP2, currentPosIP2);
                                            
                                            int newPosIP2 = currentPosIP2 + 1;

                                            labelExcept[i][j] = new Label("  2 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:cyan");
                                            damier.add(labelExcept[i][j], currentPosJP2, newPosIP2);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP2 = newPosIP2;
                                            finalPosJP2 = currentPosJP2;
                                        }
                                        else if(currentPosIP2+1 == finalPosIP0 && currentPosJP2 == finalPosJP0){
                                            killedP0 = true;
                                        }
                                        else if(currentPosIP2+1 == finalPosIP1 && currentPosJP2 == finalPosJP1) {
                                            killedP1 = true;
                                        }
                                    }
                                }
                            }
                           event.consume();
                        }
                    });
                    
                    //Image imageFlecheGauche = new Image(getClass().getResourceAsStream("ex08/fleche_gauche.png"));
                    //ImageView iconeFlecheGauche = new ImageView(imageFlecheGauche);
                    Button btnTruandGauche = new Button("G");
                    btnTruandGauche.setAlignment(Pos.CENTER);
                    btnTruandGauche.setMaxSize(30, 30);
                    truandDir.setMargin(btnTruandGauche, new Insets(0, 0, 0, 20));
                    truandDir.setLeft(btnTruandGauche);
                    
                    btnTruandGauche.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                           currentPosIP2 = finalPosIP2;
                           currentPosJP2 = finalPosJP2;
                           if(currentPosJP2 > 1) {
                           for(int i = 1 ; i < width ; i++) {
                               for(int j = 1 ; j < height ; j++) {
                                        if (killedP2 == false && i == currentPosIP2 && j == currentPosJP2) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP2, currentPosIP2);
                                            
                                            currentPosJP2 -= 1;
                                            
                                            labelExcept[i][j] = new Label("  2 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:cyan");
                                            damier.add(labelExcept[i][j], currentPosJP2, currentPosIP2);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP2 = currentPosIP2;
                                            finalPosJP2 = currentPosJP2;
                                       }
                                        else if(currentPosIP2 == finalPosIP0 && currentPosJP2-1 == finalPosJP0){
                                            killedP0 = true;
                                        }
                                        else if(currentPosIP2 == finalPosIP1 && currentPosJP2-1 == finalPosJP1) {
                                            killedP1 = true;
                                        }
                                   }
                               }
                           }
                           event.consume();
                        }
                    });
                    
                    //Image imageFlecheDroite = new Image(getClass().getResourceAsStream("ex08/fleche_droite.png"));
                    //ImageView iconeFlecheDroite = new ImageView(imageFlecheDroite);
                    Button btnTruandDroite = new Button("D");
                    btnTruandDroite.setAlignment(Pos.CENTER);
                    btnTruandDroite.setMaxSize(30, 30);
                    truandDir.setMargin(btnTruandDroite, new Insets(0, 25, 0, 0));
                    truandDir.setRight(btnTruandDroite);
                    
                    btnTruandDroite.setOnAction(new EventHandler<ActionEvent>() {
                        @Override
                        public void handle(ActionEvent event){
                            currentPosIP2 = finalPosIP2;
                            currentPosJP2 = finalPosJP2;
                            if(currentPosJP2 < 10) {
                                for(int i = 1 ; i < width ; i++) {
                                    for(int j = 1 ; j < height ; j++) {
                                        if (killedP2 == false && i == currentPosIP2 && j == currentPosJP2) {
                                            labelDamier[i][j] = new Label("     ");
                                            labelDamier[i][j].setStyle("-fx-background-color:red");
                                            damier.add(labelDamier[i][j], currentPosJP2, currentPosIP2);
                                            
                                            int newPosJP2 = currentPosJP2 + 1;

                                            labelExcept[i][j] = new Label("  2 ");
                                            labelExcept[i][j].setStyle("-fx-background-color:cyan");
                                            damier.add(labelExcept[i][j], newPosJP2, currentPosIP2);
                                            labelExcept[i][j].setAlignment(Pos.CENTER);
                                            
                                            finalPosIP2 = currentPosIP2;
                                            finalPosJP2 = newPosJP2;
                                        }
                                        else if(currentPosIP2 == finalPosIP0 && currentPosJP2+1 == finalPosJP0){
                                            killedP0 = true;
                                        }
                                        else if(currentPosIP2 == finalPosIP1 && currentPosJP2+1 == finalPosJP1) {
                                            killedP1 = true;
                                        }
                                    }
                                }
                            }
                           event.consume();
                        }
                    });
                
                truandBox.getChildren().addAll(radioTruand1, radioTruand2, radioTruand3, radioTruand4, region4, truandDir);
                
            truandTab.setContent(truandBox);
        
        rightBox.getTabs().addAll(bonTab, bruteTab, truandTab);
        
        root.getChildren().addAll(leftBox, rightBox);
        
        Scene scene = new Scene(root, 600, 350);
        
        primaryStage.setTitle("Damier");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}