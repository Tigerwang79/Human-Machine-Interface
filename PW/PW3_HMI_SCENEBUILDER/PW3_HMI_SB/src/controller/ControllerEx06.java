/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;

/**
 * FXML Controller class
 *
 * @author Valdrin Salihi
 */
public class ControllerEx06 {
    
    @FXML
    private FlowPane root;

    @FXML
    private Button btnPlay;

    @FXML
    private ImageView imgPlay;

    @FXML
    private Button btnPause;

    @FXML
    private ImageView imgPause;
    
    private ControllerViewBasic controllerViewBasic;
    
    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }

    @FXML
    void onActionBtnPause(ActionEvent event) {

    }

    @FXML
    void onActionBtnPlay(ActionEvent event) {

    }
}
