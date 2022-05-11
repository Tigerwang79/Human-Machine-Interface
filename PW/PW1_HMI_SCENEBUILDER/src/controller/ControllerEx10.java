/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 *
 * @author Valdrin Salihi
 */
public class ControllerEx10 {
    
    @FXML
    private HBox root;

    @FXML
    private Region ressort1;

    @FXML
    private HBox hbox1;

    @FXML
    private VBox leftBox;

    @FXML
    private Label metricLab;

    @FXML
    private ComboBox<?> millimeterComboBox;

    @FXML
    private TextField txtFldLeftBox;

    @FXML
    private VBox centerBox;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private VBox rightBox;

    @FXML
    private Label imperialLab;

    @FXML
    private ComboBox<?> inchComboBox;

    @FXML
    private TextField txtFldRightBox;

    @FXML
    private Region ressort2;
    
    private ControllerViewBasic controllerViewBasic;

    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }
}
