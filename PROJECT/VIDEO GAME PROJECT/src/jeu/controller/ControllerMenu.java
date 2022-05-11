/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu.controller;

/**
 *
 * @author vlesc
 */
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class ControllerMenu extends ControlleurGeneral{
    @FXML
    private Pane pane;
    
    @FXML
    private ImageView img;
    
    @FXML
    private Button jouer;

    @FXML
    private Button aPropos;

    @FXML
    private Button quitter;
    
    private Controller cont;
    
    public void addController(Controller v){
        this.cont = v;
    }

    @FXML
    void aPropos(ActionEvent event) throws IOException {
        cont.goMenu(2);
    }

    @FXML
    void jouer(ActionEvent event) throws IOException {
        cont.goMenu(1);
    }

    @FXML
    void quitter(ActionEvent event) throws IOException {
        cont.goMenu(3);
    }

}

