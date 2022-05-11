/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 *
 * @author Valdrin Salihi
 */
public class ControllerMenuApp {
    
    @FXML
    private VBox window;

    @FXML
    private Region region1;

    @FXML
    private Label labMenuTitle;

    @FXML
    private Region region2;

    @FXML
    private VBox vboxMenu;

    @FXML
    private Label labMenuSubTitle;

    @FXML
    private Button btnEx01;
    
    @FXML
    private Button btnEx02;
    
    @FXML
    private Button btnEx03;
    
    @FXML
    private Button btnEx04;
    
    @FXML
    private Button btnEx06;

    @FXML
    private Region region3;

    @FXML
    private HBox hboxBtnAnnx;

    @FXML
    private Button btnCredit;

    @FXML
    private Region region4;

    @FXML
    private Button btnQuit;
    
    private ControllerViewBasic controllerViewBasic;

    @FXML
    void onActionBtnEx01(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx01.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx01 controllerEx01 = loader.getController();
        controllerEx01.setControllerViewBasic(controllerViewBasic);
        controllerViewBasic.setScreen(pane);
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
    void onActionBtnEx02(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx02.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx02 controllerEx02 = loader.getController();
        controllerEx02.setControllerViewBasic(controllerViewBasic);
        controllerViewBasic.setScreen(pane);
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
    void onActionBtnEx03(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx03.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx03 controllerEx03 = loader.getController();
        controllerEx03.setControllerViewBasic(controllerViewBasic);
        controllerViewBasic.setScreen(pane);
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
    void onActionBtnEx04(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx04.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx04 controllerEx04 = loader.getController();
        controllerEx04.setControllerViewBasic(controllerViewBasic);
        controllerViewBasic.setScreen(pane);
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
    void onActionBtnEx06(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx06.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx06 controllerEx06 = loader.getController();
        controllerEx06.setControllerViewBasic(controllerViewBasic);
        controllerViewBasic.setScreen(pane);
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
    void onActionBtnCredit(ActionEvent event) {
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
        System.out.println();
        System.out.println();
        System.out.println("Développeur : Valdrin Salihi");
        System.out.println();
        System.out.println();
        System.out.println("======================================================================================================================================================");
        System.out.println("======================================================================================================================================================");
    }

    @FXML
    void onActionBtnQuit(ActionEvent event) {
        Platform.exit();
        System.out.println("Merci de votre visite, à bientôt !");
    }
    
    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }
}
