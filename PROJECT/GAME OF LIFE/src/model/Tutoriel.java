/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudelavie.model;

import java.io.IOException;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 *
 * @author Valdrin Salihi & Baptiste Saint-Léger
 */
public class Tutoriel extends Stage {
    
    public VBox vboxTutoriel;
    
    public Tutoriel (){
        this.setTitle("Tutoriel");
        
        vboxTutoriel = new VBox();
        vboxTutoriel.setAlignment(Pos.TOP_CENTER);
        vboxTutoriel.setStyle("-fx-border-color: black ; -fx-border-width: 2 ; -fx-background-color:  #cccccc");
        vboxTutoriel.setSpacing(10);
        /*root.setPrefSize(650, 500);*/
        
        Label labelTitre = new Label("Tutoriel");
        labelTitre.setFont(Font.font("System", FontWeight.BOLD, 18));
        labelTitre.setTextFill(Color.RED);
        labelTitre.setUnderline(true);
        
        vboxTutoriel.setMargin(labelTitre, new Insets(5, 0, 0, 0));
        
        //HBoxRegle
        HBox hboxRegle = new HBox();
        hboxRegle.setAlignment(Pos.TOP_LEFT);
        hboxRegle.setSpacing(10);
        hboxRegle.setPrefSize(646, 280);
        
        VBox vboxTextRegle = new VBox();
        vboxTextRegle.setAlignment(Pos.TOP_LEFT);
        vboxTextRegle.setSpacing(5);
        vboxTextRegle.setPrefSize(475, 280);
        
        Label labelRegle = new Label("Règles :");
        labelRegle.setFont(Font.font("System", FontWeight.BOLD, 12));
        labelRegle.setUnderline(true);
        
        vboxTextRegle.setMargin(labelRegle, new Insets(0, 0, 0, 5));
        
        TextArea txtRegle = new TextArea();
        txtRegle.setFont(Font.font("System", FontWeight.NORMAL, 10));
        txtRegle.setEditable(false);
        txtRegle.setStyle("-fx-border-color: green");
        txtRegle.setMinSize(480, 265);
        txtRegle.setPrefSize(480, 265);
        txtRegle.setMaxSize(480, 265);
        txtRegle.setText("Le Jeu de la vie est un « jeu à zéro joueur », puisqu'il ne nécessite aucune intervention du joueur \n"
        + "lors de son déroulement. Il s’agit d’un automate cellulaire, un modèle où chaque état \n"
        + "conduit mécaniquement à l’état suivant à partir de règles préétablies. \n"
        + "\n"
        + "Le jeu se déroule sur une grille à deux dimensions, théoriquement infinie, \n"
        + "dont les cases appelées « cellules », par analogie avec les cellules vivantes peuvent prendre \n"
        + "deux états distincts : « vivante » ou « morte ». \n"
        + "\n"
        + "Une cellule possède huit voisins, qui sont les cellules adjacentes horizontalement, \n"
        + "verticalement et diagonalement. \n"
        + "\n"
        + "À chaque itération, l'état d’une cellule est entièrement déterminé par l’état de ses huit cellules voisines, \n"
        + "selon les règles suivantes : \n"
        + "     - une cellule morte possédant exactement trois cellules voisines vivantes devient vivante (elle naît) ; \n"
        + "     - une cellule vivante possédant deux ou trois cellules voisines vivantes le reste, sinon elle meurt. \n"
        + "À l'aide du clique gauche dans la grille vous pouvez ajouter/supprimer une cellule, afin de pouvoir \n"
        + "créer les motifs désirés et lancer la partie.");
        
        vboxTextRegle.setMargin(txtRegle, new Insets(0, 0, 0, 5));
        
        vboxTextRegle.getChildren().addAll(labelRegle, txtRegle);
        
        Image imageGifJeu = new Image(getClass().getResource("/jeudelavie/image/gifJeuDeLaVie.gif").toExternalForm());
        ImageView logoGifJeu = new ImageView(imageGifJeu);
        logoGifJeu.setPreserveRatio(true);
        logoGifJeu.setFitWidth(150);
        logoGifJeu.setFitHeight(150);
        
        hboxRegle.setMargin(logoGifJeu, new Insets(100, 0, 0, 0));
        
        hboxRegle.getChildren().addAll(vboxTextRegle, logoGifJeu);
        
        //HBoxStructure
        HBox hboxStructure = new HBox();
        hboxStructure.setAlignment(Pos.CENTER_LEFT);
        hboxStructure.setPrefSize(646, 117);
        
        VBox vboxListeStructure = new VBox();
        vboxListeStructure.setAlignment(Pos.TOP_LEFT);
        vboxListeStructure.setSpacing(2);
        vboxListeStructure.setPrefSize(200, 117);
        
        Label labelStructure = new Label("Quelques Structures :");
        labelStructure.setFont(Font.font("System", FontWeight.BOLD, 12));
        labelStructure.setUnderline(true);
        
        vboxListeStructure.setMargin(labelStructure, new Insets(0, 0, 0, 5));
        
        Hyperlink lienStructStable = new Hyperlink("- les structures stables");
        
        lienStructStable.setOnAction(e -> {
            try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://fr.wikipedia.org/wiki/Structure_stable_(automate_cellulaire)"));
            } catch (IOException e1) {
            e1.printStackTrace();
            }
        });
        
        Hyperlink lienStructPeriod = new Hyperlink("- les structures périodiques");
        
        lienStructPeriod.setOnAction(e -> {
            try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://fr.wikipedia.org/wiki/Oscillateur_(automate_cellulaire)"));
            } catch (IOException e1) {
            e1.printStackTrace();
            }
        });
        
        Hyperlink lienVaisseau = new Hyperlink("- les vaisseaux");
        
        lienVaisseau.setOnAction(e -> {
            try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://fr.wikipedia.org/wiki/Vaisseau_(automate_cellulaire)"));
            } catch (IOException e1) {
            e1.printStackTrace();
            }
        });
        
        Hyperlink lienMathusalem = new Hyperlink("- les mathusalems");
        
        lienMathusalem.setOnAction(e -> {
            try {
            java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://fr.wikipedia.org/wiki/Mathusalem_(automate_cellulaire)"));
            } catch (IOException e1) {
            e1.printStackTrace();
            }
        });
        
        vboxListeStructure.getChildren().addAll(labelStructure, lienStructStable, lienStructPeriod, lienVaisseau, lienMathusalem);
        
        Ressort region1 = new Ressort();
        
        Hyperlink lienJeu = new Hyperlink("Pour plus d'informations sur le Jeu de la Vie");
        hboxStructure.setMargin(lienJeu, new Insets(90, 0, 0, 0));
        
        lienJeu.setOnAction(e -> {
        try {
        java.awt.Desktop.getDesktop().browse(java.net.URI.create("https://fr.wikipedia.org/wiki/Jeu_de_la_vie"));
        } catch (IOException e1) {
        e1.printStackTrace();
        }
        });
        
        hboxStructure.getChildren().addAll(vboxListeStructure, region1, lienJeu);
        
        //ButtonOK
        Button btnOK = new Button("OK");
        btnOK.setStyle("-fx-border-color: cyan");
        
        btnOK.setOnAction(e -> {
            this.close();
        });
        
        vboxTutoriel.getChildren().addAll(labelTitre, hboxRegle, hboxStructure, btnOK);
    }
}