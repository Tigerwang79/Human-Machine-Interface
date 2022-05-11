/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.controller;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author vlesc
 */
public class ViewVilleController extends ControlleurGeneral{
    
    @FXML
    private Pane myPane;

    @FXML
    private ImageView imgV;

      @FXML
    private TextField tfMonique;

    @FXML
    private Button buttonMonique;

    @FXML
    private TextField tfPont;

    @FXML
    private Button buttonPont;

    @FXML
    private TextField tfComissariat;

    @FXML
    private Button buttonComissariat;

    @FXML
    private TextField tfVictime;

    @FXML
    private Button buttonVictime;

    @FXML
    private TextField tfRestaurant;

    @FXML
    private Button buttonRestaurant;
    
       @FXML
    private TextField tfMorgue;

    @FXML
    private Button buttonMorgue;

    @FXML
    private TextField tfBureau;

    @FXML
    private Button buttonBureau;

    
    private Controller cont;
    
    @Override
    public void addController(Controller v){
        this.cont = v;
    }
    
    @Override
    public void add(int i){
        switch(i){
            case 0:
                this.buttonBureau.setDisable(false);
                this.tfBureau.setVisible(true);
                this.buttonBureau.setOnAction(new EventHandler<ActionEvent>() {   
                    @Override 
                    public void handle(ActionEvent e) { 
                        clearText();
                        try {
                            cont.changePos(i);
                        } catch (IOException ex) {
                            Logger.getLogger(ViewVilleController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                });
                break;
            case 1:
                this.buttonComissariat.setDisable(false);
                this.tfComissariat.setVisible(true);
                this.buttonComissariat.setOnAction(new EventHandler<ActionEvent>() {   
                    @Override 
                    public void handle(ActionEvent e) { 
                        clearText();
                        try {
                            cont.changePos(i);
                        } catch (IOException ex) {
                            Logger.getLogger(ViewVilleController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                });
                break;
            case 2:
                this.buttonMorgue.setDisable(false);
                this.tfMorgue.setVisible(true);
                this.buttonMorgue.setOnAction(new EventHandler<ActionEvent>() {   
                    @Override 
                    public void handle(ActionEvent e) { 
                        clearText();
                        try {
                            cont.changePos(i);
                        } catch (IOException ex) {
                            Logger.getLogger(ViewVilleController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                });
                break;
            case 3:
                this.buttonMonique.setDisable(false);
                this.tfMonique.setVisible(true);
                this.buttonMonique.setOnAction(new EventHandler<ActionEvent>() {   
                    @Override 
                    public void handle(ActionEvent e) { 
                        clearText();
                        try {
                            cont.changePos(i);
                        } catch (IOException ex) {
                            Logger.getLogger(ViewVilleController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                });
                break;    
            case 4:
                this.buttonPont.setDisable(false);
                this.tfPont.setVisible(true);
                this.buttonPont.setOnAction(new EventHandler<ActionEvent>() {   
                    @Override 
                    public void handle(ActionEvent e) { 
                        clearText();
                        try {
                            cont.changePos(i);
                        } catch (IOException ex) {
                            Logger.getLogger(ViewVilleController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                });
                break;
            case 5:
                this.buttonRestaurant.setDisable(false);
                this.tfRestaurant.setVisible(true);
                this.buttonRestaurant.setOnAction(new EventHandler<ActionEvent>() {   
                    @Override 
                    public void handle(ActionEvent e) { 
                        clearText();
                        try {
                            cont.changePos(i);
                        } catch (IOException ex) {
                            Logger.getLogger(ViewVilleController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                });
                break;
            case 6:
                this.buttonVictime.setDisable(false);
                this.tfVictime.setVisible(true);
                this.buttonVictime.setOnAction(new EventHandler<ActionEvent>() {   
                    @Override 
                    public void handle(ActionEvent e) { 
                        clearText();
                        try {
                            cont.changePos(i);
                        } catch (IOException ex) {
                            Logger.getLogger(ViewVilleController.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    } 
                });
                break;
            default :
        }
            
    }
    
    
    
}
