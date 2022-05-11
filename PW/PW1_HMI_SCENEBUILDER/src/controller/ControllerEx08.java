/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import modele.Damier;

/**
 *
 * @author Valdrin Salihi
 */
public class ControllerEx08 {
    
    // PS : je n'ai pas trouvé comment faire pour colorer les cases comme il est demandé dans l'exercice avec ce modèle MVC, donc j'aimerais bien pouvoir être éclairé sur ce qu'il me manque à rajouter dans mon controller ou modèle associé.
    
    @FXML
    private HBox root;

    @FXML
    private VBox leftBox;

    @FXML
    private Label titleLab;

    @FXML
    public GridPane damier;

    @FXML
    private Label labelA;

    @FXML
    private Label labelB;

    @FXML
    private Label labelC;

    @FXML
    private Label labelD;

    @FXML
    private Label labelE;

    @FXML
    private Label labelF;

    @FXML
    private Label labelG;

    @FXML
    private Label labelH;

    @FXML
    private Label labelI;

    @FXML
    private Label labelJ;

    @FXML
    private Label labelN1;

    @FXML
    private Label labelN2;

    @FXML
    private Label labelN3;

    @FXML
    private Label labelN4;

    @FXML
    private Label labelN5;

    @FXML
    private Label labelN6;

    @FXML
    private Label labelN7;

    @FXML
    private Label labelN8;

    @FXML
    private Label labelN9;

    @FXML
    private Label labelN10;

    @FXML
    private HBox buttonBox;

    @FXML
    private Button resetBtn;

    @FXML
    private Region ressort1;

    @FXML
    private Button quitBtn;

    @FXML
    private TabPane rightBox;

    @FXML
    private Tab bonTab;

    @FXML
    private VBox bonBox;

    @FXML
    private RadioButton bonRadio1;

    @FXML
    private RadioButton bonRadio2;

    @FXML
    private RadioButton bonRadio3;

    @FXML
    private RadioButton bonRadio4;

    @FXML
    private Region ressort2;

    @FXML
    private BorderPane bonDir;

    @FXML
    private Button bonBtnH;

    @FXML
    private Button bonBtnG;

    @FXML
    private Button bonBtnB;

    @FXML
    private Button bonBtnD;

    @FXML
    private Tab bruteTab;

    @FXML
    private VBox bruteBox;

    @FXML
    private RadioButton bruteRadio1;

    @FXML
    private RadioButton bruteRadio2;

    @FXML
    private RadioButton bruteRadio3;

    @FXML
    private RadioButton bruteRadio4;

    @FXML
    private Region ressort3;

    @FXML
    private BorderPane bruteDir;

    @FXML
    private Button bruteBtnH;

    @FXML
    private Button bruteBtnG;

    @FXML
    private Button bruteBtnB;

    @FXML
    private Button bruteBtnD;

    @FXML
    private Tab truandTab;

    @FXML
    private VBox truandBox;

    @FXML
    private RadioButton truandRadio1;

    @FXML
    private RadioButton truandRadio2;

    @FXML
    private RadioButton truandRadio3;

    @FXML
    private RadioButton truandRadio4;

    @FXML
    private Region ressort4;

    @FXML
    private BorderPane truandDir;

    @FXML
    private Button truandBtnH;

    @FXML
    private Button truandBtnG;

    @FXML
    private Button truandBtnB;

    @FXML
    private Button truandBtnD;
    
    private ControllerViewBasic controllerViewBasic;
    
    private Damier damierModele;

    public void setControllerViewBasic(ControllerViewBasic controllerViewBasic) {
        this.controllerViewBasic = controllerViewBasic;
    }
    
    public GridPane getDamier(){
        return damier;
    }
    
    public void setColorDamier(Damier damier) {
        damierModele.colorDamier(damier);
    }
}
