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
        System.out.println("Exercice 01 : Reversi Rules");
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
