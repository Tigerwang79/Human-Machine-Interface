/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import modele.Damier;

/**
 *
 * @author Valdrin Salihi
 */
public class ControllerViewBasic {
    
    @FXML
    private VBox window;

    @FXML
    private MenuBar menuBar;

    @FXML
    private Menu menuFile;

    @FXML
    private Menu menuExercices;

    @FXML
    private MenuItem menuItemEx07A;

    @FXML
    private MenuItem menuItemEx07B;

    @FXML
    private MenuItem menuItemEx08;

    @FXML
    private MenuItem menuItemEx09;

    @FXML
    private MenuItem menuItemEx10;

    @FXML
    private MenuItem menuItemHome;

    @FXML
    private MenuItem menuItemQuit;

    @FXML
    private Menu menuDisplay;

    @FXML
    private MenuItem menuItemFullScreen;

    @FXML
    private MenuItem menuItemMinimize;

    @FXML
    private Menu menuHelp;
    
    @FXML
    private MenuItem menuItemContact;

    @FXML
    private MenuItem menuItemAboutUs;

    @FXML
    private VBox vboxMenu;
    
    private ControllerMenuApp controllerMenuApp;
    
    private ControllerEx08 controllerEx08;
    
    @FXML
    public void initialize() {
        loadMenuApp();
    }
    
    public void loadMenuApp() {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewMenuApp.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) { 
            e.printStackTrace();
        }
        ControllerMenuApp controllerMenuApp = loader.getController();
        controllerMenuApp.setControllerViewBasic(this);
        this.setScreen(pane);
    }    
    
    public void setScreen(Pane pane) {
        vboxMenu.getChildren().clear();
        vboxMenu.getChildren().add(pane);
    }
    
    @FXML
    void onActionMenuItemContact(ActionEvent event) {
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println("Pour tout problème rencontré lors de l'utilisation de l'application, veuillez vous adresser au développeur de cette dernière par le biais de son mail.");
        System.out.println();
        System.out.println();
        System.out.println("mail : valdrin.salihi@etu.univ-poitiers.fr");
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }

    @FXML
    void onActionMenuItemAboutUs(ActionEvent event) {
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println("Application développé par : Valdrin Salihi");
        System.out.println();
        System.out.println();
        System.out.println("Version 1.0");
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }

    @FXML
    void onActionMenuItemEx07A(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx07A.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx07A controllerEx07A = loader.getController();
        controllerEx07A.setControllerViewBasic(this);
        this.setScreen(pane);
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Exercice 07-A : Border et Box");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }

    @FXML
    void onActionMenuItemEx07B(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx07B.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx07B controllerEx07B = loader.getController();
        controllerEx07B.setControllerViewBasic(this);
        this.setScreen(pane);
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Exercice 07-B : Border et Box");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }

    @FXML
    void onActionMenuItemEx08(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx08.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx08 controllerEx08 = loader.getController();
        controllerEx08.setControllerViewBasic(this);
        this.setScreen(pane);
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Exercice 08 : Damier, Tab et TabPane, RadioButton, ToggleGroup");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }

    @FXML
    void onActionMenuItemEx09(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx09.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx09 controllerEx09 = loader.getController();
        controllerEx09.setControllerViewBasic(this);
        this.setScreen(pane);
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Exercice 09 : une rampe paramètrable");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }

    @FXML
    void onActionMenuItemEx10(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx10.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx10 controllerEx10 = loader.getController();
        controllerEx10.setControllerViewBasic(this);
        this.setScreen(pane);
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Exercice 10 : ComboBox");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }

    @FXML
    void onActionMenuItemFullScreen(ActionEvent event) {
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("L'action ''Plein écran'' n'est pas encore fonctionnelle et est en cours de développement.");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");        
    }

    @FXML
    void onActionMenuItemHome(ActionEvent event) {
        loadMenuApp();
    }

    @FXML
    void onActionMenuItemMinimize(ActionEvent event) {
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("L'action ''Minimaliser'' n'est pas encore fonctionnelle et est en cours de développement.");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }

    @FXML
    void onActionMenuItemQuit(ActionEvent event) {
        Platform.exit();
    }
}
