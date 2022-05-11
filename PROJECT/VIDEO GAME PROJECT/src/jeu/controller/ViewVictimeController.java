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
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

/**
 * FXML Controller class
 *
 * @author BF3TE
 */
public class ViewVictimeController extends ControlleurGeneral {



  @FXML
    private BorderPane borderPane;

    @FXML
    private TextFlow txtFlow;

    @FXML
    private FlowPane fPane;

    @FXML
    private Pane paneImg;

    @FXML
    private ImageView imgMaison;

    @FXML
    private ImageView imgMere;
    
    private Controller cont;
    
     @FXML
    private Rectangle objet1;


    
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
    void mouseEnteredMere(MouseEvent event) {
        Image img = new Image("/jeu/images/mere-vert.png");
        this.imgMere.setImage(img);
    }

    @FXML
    void mouseExitedMere(MouseEvent event) {
        Image img = new Image("/jeu/images/mere.png");
        this.imgMere.setImage(img);
    }

    @FXML
    void talkToMere(MouseEvent event) {
        this.clearText();
        this.cont.choixPerso(0);
    }

    
    
    @Override
    public void buttonReset(){}
    @Override
    public void actionJoueur(){}
    
    @FXML
    void enteredObj1(MouseEvent event) {
        this.objet1.setFill(javafx.scene.paint.Color.RED);
        this.objet1.setOpacity(0.5);
    }
   
    @FXML
    void exitedObj1(MouseEvent event) {
        this.objet1.setFill(javafx.scene.paint.Color.WHITE);
        this.objet1.setOpacity(0.5);
    }
    
    @FXML
    void takeObj1(MouseEvent event) {
        clearText();
        this.cont.addObjetInv(0);
        this.objet1.setVisible(false);
    }
    
    @Override
    public void add(int i){
        switch(i){
            case 0 :
                this.objet1.setVisible(true);
                break;
            default :
        }
    } 
}
