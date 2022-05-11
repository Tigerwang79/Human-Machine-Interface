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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

/**
 *
 * @author Valdrin Salihi
 */
public class ControllerEx01 {
    
    @FXML
    private VBox root;

    @FXML
    private HBox hboxTitle;

    @FXML
    private Label labJavaFx;

    @FXML
    private Label labReversi;

    @FXML
    private Region region1;

    @FXML
    private Button btnRestart;

    @FXML
    private GridPane chessboard;

    @FXML
    private HBox hboxPlayer;

    @FXML
    private HBox hboxPlayerWhite;

    @FXML
    private Label labHboxPlayerWhite2;

    @FXML
    private VBox vboxPlayerWhite;

    @FXML
    private Region region2;

    @FXML
    private Circle circleBlack;

    @FXML
    private Label labHboxWhitePlayer;

    @FXML
    private HBox vboxPlayerBlack;

    @FXML
    private Label labHboxPlayerBlack2;

    @FXML
    private VBox vboxPlayerBlack2;

    @FXML
    private Region region3;

    @FXML
    private Circle circleWhite;

    @FXML
    private Label labHboxBlackPlayer;

    @FXML
    void onActionBtnRestart(ActionEvent event) {
        Platform.exit();
    }
    
    private ControllerViewBasic controllerViewBasic;

    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }
}
