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
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

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
    private MenuItem menuItemEx01;
    
    @FXML
    private MenuItem menuItemEx02;
    
    @FXML
    private MenuItem menuItemEx03;
    
    @FXML
    private MenuItem menuItemEx04;
    
    @FXML
    private MenuItem menuItemEx06;

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
    void onActionMenuItemEx01(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx01.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx01 controllerEx01 = loader.getController();
        controllerEx01.setControllerViewBasic(this);
        this.setScreen(pane);
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Exercice 01 : parcours d'un évènement dans le graphe de scene : addEventHandler, addEventFilter, consume");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }
    
    @FXML
    void onActionMenuItemEx02(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx02.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx02 controllerEx02 = loader.getController();
        controllerEx02.setControllerViewBasic(this);
        this.setScreen(pane);
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Exercice 02 : setonxxx");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }
    
    @FXML
    void onActionMenuItemEx03(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx03.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx03 controllerEx03 = loader.getController();
        controllerEx03.setControllerViewBasic(this);
        this.setScreen(pane);
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Exercice 03 : BorderWithQuit...");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }
    
    @FXML
    void onActionMenuItemEx04(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx04.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx04 controllerEx04 = loader.getController();
        controllerEx04.setControllerViewBasic(this);
        this.setScreen(pane);
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Exercice 04 : Application BorderWithQuit...");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }
    
    @FXML
    void onActionMenuItemEx06(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx06.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx06 controllerEx06 = loader.getController();
        controllerEx06.setControllerViewBasic(this);
        this.setScreen(pane);
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Exercice 06 : ButtonStartPause");
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
    void onActionMenuItemQuit(ActionEvent event) {
        Platform.exit();
        System.out.println("Merci de votre visite, à bientôt !");
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
}