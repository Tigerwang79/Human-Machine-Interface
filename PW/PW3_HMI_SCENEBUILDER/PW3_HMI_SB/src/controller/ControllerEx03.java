/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import modele.EcouteurBis;

/**
 * FXML Controller class
 *
 * @author Valdrin Salihi
 */
public class ControllerEx03 {
    
    @FXML
    private BorderPane root;

    @FXML
    private Button btnQuit;

    private ControllerViewBasic controllerViewBasic;
    
    private EcouteurBis ecouteur;
    
    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }

    @FXML
    void onActionBtnQuit(ActionEvent event) {
        Platform.exit();
        System.out.println("Merci de votre visite, à bientôt !");
    }
}
