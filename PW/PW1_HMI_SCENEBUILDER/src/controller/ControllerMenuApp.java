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
import modele.Damier;

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
    private Button btnEx07A;

    @FXML
    private Button btnEx07B;

    @FXML
    private Button btnEx08;

    @FXML
    private Button btnEx09;

    @FXML
    private Button btnEx10;

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
    void onActionBtnEx07A(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx07A.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx07A controllerEx07A = loader.getController();
        controllerEx07A.setControllerViewBasic(controllerViewBasic);
        controllerViewBasic.setScreen(pane);
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
    void onActionBtnEx07B(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx07B.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx07B controllerEx07B = loader.getController();
        controllerEx07B.setControllerViewBasic(controllerViewBasic);
        controllerViewBasic.setScreen(pane);
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
    void onActionBtnEx08(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx08.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx08 controllerEx08 = loader.getController();
        controllerEx08.setControllerViewBasic(controllerViewBasic);
        controllerViewBasic.setScreen(pane);
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
    void onActionBtnEx09(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx09.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx09 controllerEx09 = loader.getController();
        controllerEx09.setControllerViewBasic(controllerViewBasic);
        controllerViewBasic.setScreen(pane);
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
    void onActionBtnEx10(ActionEvent event) {
        FXMLLoader loader = new FXMLLoader(this.getClass().getResource("/view/ViewEx10.fxml"));
        Pane pane = null;
        try {
            pane = loader.load();
        } catch (IOException e) {
            e.printStackTrace();
        }
        ControllerEx10 controllerEx10 = loader.getController();
        controllerEx10.setControllerViewBasic(controllerViewBasic);
        controllerViewBasic.setScreen(pane);
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
    }
    
    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }
}
