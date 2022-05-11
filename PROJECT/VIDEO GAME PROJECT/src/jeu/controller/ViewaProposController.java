/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class ViewaProposController extends ControlleurGeneral {

    @FXML
    private BorderPane borderPane;

    @FXML
    private TextFlow txtFlow;

    @FXML
    private FlowPane fPane;

    @FXML
    private Pane paneImg;

    @FXML
    private ImageView imgV;
    
    private Controller cont;
    
    @Override
    public void addController(Controller v){
        this.cont = v;
    }
    
    @Override
    public void showString(String s){
        this.txtFlow.getChildren().add(new Text(s));
    }
    @Override
    public void clearText(){
        this.txtFlow.getChildren().clear();
    }
    @Override
    public void addButton(Button b){
        this.fPane.getChildren().add(b);
    }
    @Override
    public void clearButton(){
        this.fPane.getChildren().clear();
    }
    @Override
    public void buttonReset(){}
    @Override
    public void actionJoueur(){}
}