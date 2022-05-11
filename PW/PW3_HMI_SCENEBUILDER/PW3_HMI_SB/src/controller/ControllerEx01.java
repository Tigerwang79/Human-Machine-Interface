/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;

import modele.Ecouteur;

/**
 * FXML Controller class
 *
 * @author Valdrin Salihi
 */
public class ControllerEx01 {
    
    @FXML
    private Pane root;

    @FXML
    private Circle circle;

    @FXML
    private Label labMessage;

    @FXML
    private Button btnB1;

    @FXML
    private Button btnB2;
    
    private ControllerViewBasic controllerViewBasic;
    
    private Ecouteur ecouteur;
    
    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }

    Ecouteur filter1 = new Ecouteur("filter_b1", false);
    Ecouteur handler1 = new Ecouteur("handler_b1", false);
    Ecouteur setOn1 = new Ecouteur("setOn1_b1", false);
    Ecouteur setOn2 = new Ecouteur("setOn2_b1", true);
    
    @FXML
    void onActionBtnB1(ActionEvent event) {
        btnB1.addEventFilter(ActionEvent.ACTION, filter1);
        btnB1.addEventHandler(ActionEvent.ACTION, handler1);
        btnB1.setOnAction(setOn1);
        btnB1.setOnAction(setOn2);
    }

    Ecouteur filter2 = new Ecouteur("filter_b2", false);
    Ecouteur handler2 = new Ecouteur("handler_b2", false);
    Ecouteur setOn3 = new Ecouteur("setOn1_b2", false);
    Ecouteur setOn4 = new Ecouteur("setOn2_b2", true);
    
    @FXML
    void onActionBtnB2(ActionEvent event) {
        btnB2.addEventFilter(ActionEvent.ACTION, filter2);
        btnB2.addEventHandler(ActionEvent.ACTION, handler2);
        btnB2.setOnAction(setOn3);
        btnB2.setOnAction(setOn4);
    }   
}
