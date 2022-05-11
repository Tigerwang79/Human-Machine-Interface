/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class ViewRestaurantController extends ControlleurGeneral {

    
    @FXML
    private BorderPane borderPane;

    @FXML
    private TextFlow txtFlow;

    @FXML
    private FlowPane fPane;

    @FXML
    private Pane paneImg;

    @FXML
    private ImageView imgRestaurant;

    @FXML
    private ImageView imgMaire;
    
    @FXML
    private ImageView imgCuisinier;
       
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
    
    @FXML
    void mouseEnteredCui(MouseEvent event) {
        Image img = new Image("/jeu/images/cuisinier-vert.png");
        this.imgCuisinier.setImage(img);
    }

    @FXML
    void mouseEnteredMaire(MouseEvent event) {
        Image img = new Image("/jeu/images/maire-vert.png");
        this.imgMaire.setImage(img);
    }

    @FXML
    void mouseExitedCui(MouseEvent event) {
        Image img = new Image("/jeu/images/cuisinier.png");
        this.imgCuisinier.setImage(img);
    }

    @FXML
    void mouseExitedMaire(MouseEvent event) {
        Image img = new Image("/jeu/images/maire.png");
        this.imgMaire.setImage(img);
    }

    @FXML
    void talkToCui(MouseEvent event) {
        this.clearText();
        this.cont.choixPerso(0);
    }

    @FXML
    void talkToMaire(MouseEvent event) {
        this.clearText();
        this.cont.choixPerso(1);
    }
    
    
    @Override
    public void buttonReset(){}
    @Override
    public void actionJoueur(){}
      
    
}
