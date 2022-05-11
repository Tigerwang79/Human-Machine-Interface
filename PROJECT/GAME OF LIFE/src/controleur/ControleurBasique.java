/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudelavie.controleur;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import jeudelavie.Main;
import jeudelavie.model.Tutoriel;

/**
 * FXML Controller class
 *
 * @author Valdrin Salihi & Baptiste Saint-Léger
 */
public class ControleurBasique {

    @FXML
    private VBox vboxApplication;
    
    private final Tutoriel tutoriel = new Tutoriel();
    
    private final Alert myPopUpInformation = new Alert(Alert.AlertType.INFORMATION);
    
    @FXML
    public void initialize() throws IOException {
        loadMenuApp();
        
        Scene tutorielScene = new Scene(tutoriel.vboxTutoriel, 660, 500);
        tutoriel.setScene(tutorielScene);
    }
    
    public void loadMenuApp() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/jeudelavie/vue/VueApplication.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) { 
            e.printStackTrace();
        }
        ControleurApplication controleurApp = loader.getController();
        controleurApp.setControllerViewBasic(this);
        this.setScreen(pane);
    }    
    
    public void setScreen(Pane pane) {
        vboxApplication.getChildren().clear();
        vboxApplication.getChildren().add(pane);
    }

    @FXML
    void menuItemTutoriel(ActionEvent event) {
        tutoriel.show();
    }
    
    @FXML
    void menuItemAPropos(ActionEvent event) {
        myPopUpInformation.setTitle("À Propos");
        myPopUpInformation.setContentText("Application développé par : \n"
                + "\n"
                + "Valdrin Salihi & Baptiste Saint-Léger\n"
                + "\n"
                + "\n"
                + "Version 1.0");
        myPopUpInformation.show();
    }

    @FXML
    void menuItemContacter(ActionEvent event) {
        myPopUpInformation.setTitle("Contacter");
        myPopUpInformation.setContentText("Pour tout problème rencontré lors de l'utilisation de l'application, veuillez vous adresser aux développeurs par le biais d'un de ces mails.\n"
                + "\n"
                + "mail : valdrin.salihi@etu.univ-poitiers.fr \n"
                + "mail : baptiste.saint.leger@etu.univ-poitiers.fr");
        myPopUpInformation.show();
    }

    @FXML
    void menuItemMinimiser(ActionEvent event) {
        Main.stage.setFullScreen(false);
    }

    @FXML
    void menuItemPleinEcran(ActionEvent event) {
        Main.stage.setFullScreen(true);
    }

    @FXML
    void menuItemQuitter(ActionEvent event) {
        Platform.exit();
    }
}