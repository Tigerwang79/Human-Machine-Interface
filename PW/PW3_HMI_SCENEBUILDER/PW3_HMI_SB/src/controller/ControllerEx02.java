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
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import modele.EcouteurBis;

/**
 * FXML Controller class
 *
 * @author Valdrin Salihi
 */
public class ControllerEx02 {
    
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
    
    private EcouteurBis ecouteur;
    
    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }
    
    EcouteurBis e1 = new EcouteurBis("Je suis le bouton 1", btnB1, false);
    EcouteurBis e2 = new EcouteurBis("Je suis le bouton 2", btnB2, false);
    EcouteurBis e3 = new EcouteurBis("Je suis le cercle", circle, false);
    EcouteurBis e4 = new EcouteurBis("Je suis le label", labMessage, false);
    EcouteurBis e5 = new EcouteurBis("Je suis le pane", root, false);
    
    @FXML
    void onActionBtnB1(ActionEvent event) {
        btnB1.setOnAction(e1);
    }

    @FXML
    void onActionBtnB2(ActionEvent event) {
        btnB2.setOnAction(e2);
    }
    
    @FXML
    void onMouseClickedCircle(MouseEvent event) {
        circle.onMouseClickedProperty().set(e3);
    }
    
    @FXML
    void onMouseClickedLabMessage(MouseEvent event) {
        labMessage.onMouseClickedProperty().set(e4);
    }

    @FXML
    void onMouseClickedPane(MouseEvent event) {
        root.onMouseClickedProperty().set(e5);
    }
}
