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
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import modele.EcouteurBis;

/**
 * FXML Controller class
 *
 * @author Valdrin Salihi
 */
public class ControllerEx04 {

    @FXML
    private BorderPane root;

    @FXML
    private HBox hboxTop;

    @FXML
    private Button btnPlus5;

    @FXML
    private Line line;

    @FXML
    private Button btnMinus5;

    @FXML
    private Label labelTop1;

    @FXML
    private Label labelTop2;

    @FXML
    private Button btnQuit;

    @FXML
    private Pane pc;

    @FXML
    private Circle circle;
    
    private ControllerViewBasic controllerViewBasic;
    
    private EcouteurBis ecouteur;
    
    private int compteur = 0;
    
    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }

    @FXML
    void onActionBtnPlus5(ActionEvent event) {
        compteur = Integer.parseInt(labelTop2.getText());
        compteur = compteur + 5;
        labelTop2.setText("" + compteur);
        circle.setRadius(compteur);
    }
    
    @FXML
    void onActionBtnMinus5(ActionEvent event) {
        compteur = Integer.parseInt(labelTop2.getText());
        if (compteur >= 5)
        {
            compteur = compteur - 5;
        }
        labelTop2.setText("" + compteur);
        circle.setRadius(compteur);
    }
    
    EcouteurBis e1 = new EcouteurBis("Je suis le cercle", circle, false);
    
    @FXML
    void onMousClickedPc(MouseEvent event) {
        double posX = pc.getLayoutX();
        double posY = pc.getLayoutY();
        circle.setCenterX(posX);
        circle.setCenterY(posY);
    }


    @FXML
    void onActionBtnQuit(ActionEvent event) {
        Platform.exit();
        System.out.println("Merci de votre visite, à bientôt !");
    }
}
