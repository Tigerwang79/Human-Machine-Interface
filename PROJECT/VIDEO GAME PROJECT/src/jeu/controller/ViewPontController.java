/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.controller;

/**
 *
 * @author nathan
 */

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

public class ViewPontController extends ControlleurGeneral {


    @FXML
    private BorderPane borderPane;

    @FXML
    private TextFlow txtFlow;

    @FXML
    private FlowPane fPane;

    @FXML
    private Pane paneImg;

    @FXML
    private ImageView imgPont;

    @FXML
    private ImageView imgPolicier;

    
    private Controller cont;
    
     @FXML
    private Polygon objet1;

    @FXML
    private Circle objet2;
    
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
   
   

   
    

       @FXML
    void enteredObj1(MouseEvent event) {
        this.objet1.setFill(javafx.scene.paint.Color.RED);
        this.objet1.setOpacity(0.3);
    }

    @FXML
    void enteredObj2(MouseEvent event) {
        this.objet2.setFill(javafx.scene.paint.Color.RED);
        this.objet2.setOpacity(0.3);
    }

    @FXML
    void exitedObj1(MouseEvent event) {
        this.objet1.setFill(javafx.scene.paint.Color.WHITE);
        this.objet1.setOpacity(0.3);
    }

    @FXML
    void exitedObj2(MouseEvent event) {
        this.objet2.setFill(javafx.scene.paint.Color.WHITE);
        this.objet2.setOpacity(0.3);
    }

    @FXML
    void takeObj1(MouseEvent event) {
        clearText();
        this.cont.addObjetInv(0);
        this.objet1.setVisible(false);
    }

    @FXML
    void takeObj2(MouseEvent event) {
        clearText();
        this.cont.addObjetInv(1);
        this.objet2.setVisible(false);
    }
    
    @Override
    public void add(int i){
        switch(i){
            case 0 :
                this.objet1.setVisible(true);
                System.out.println("obj1");
                break;
            case 1 :
                this.objet2.setVisible(true);
                System.out.println("obj2");
                break;
            default :
            
        }
    } 
}


