/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 *
 * @author Valdrin Salihi
 */
public class ControllerEx07B {
    
    @FXML
    private BorderPane root;

    @FXML
    private VBox westBox;

    @FXML
    private Label westLab1;

    @FXML
    private Label westLab2;

    @FXML
    private Label westLab3;

    @FXML
    private Label westLab4;

    @FXML
    private VBox eastBox;

    @FXML
    private Label eastLab1;

    @FXML
    private Label eastLab2;

    @FXML
    private Label eastLab3;

    @FXML
    private Label eastLab4;

    @FXML
    private HBox northBox;

    @FXML
    private Label northLab;

    @FXML
    private HBox centerBox;

    @FXML
    private Label centerLab1;

    @FXML
    private Region ressort1;

    @FXML
    private Label centerLab2;

    @FXML
    private Region ressort2;

    @FXML
    private Label centerLab3;

    @FXML
    private Region ressort3;

    @FXML
    private Label centerLab4;

    @FXML
    private Region ressort4;

    @FXML
    private Label centerLab5;

    @FXML
    private Region ressort5;

    @FXML
    private Label centerLab6;

    @FXML
    private HBox southBox;

    @FXML
    private Label southLab;
    
    private ControllerViewBasic controllerViewBasic;

    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }
}
