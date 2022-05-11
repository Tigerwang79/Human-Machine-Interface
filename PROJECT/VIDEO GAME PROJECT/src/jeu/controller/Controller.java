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
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import jeu.modele.Jeu;
import jeu.modele.Objets;

public class Controller extends ControlleurGeneral{
     
    @FXML
    private TabPane fenetre;

    @FXML
    private Tab tabGen;

    @FXML
    private AnchorPane AnchorPaneGen;

    @FXML
    private Tab tabInv;

    @FXML
    private AnchorPane AnchorPaneInv;

    @FXML
    private TableView<Objets> table;

    @FXML
    private TableColumn<Objets, String> tableNom;

    @FXML
    private TableColumn<Objets, String> tableDesc;
    
    private Jeu game;
    private ControlleurGeneral cg;
    
        
    @FXML
    void initialize() throws IOException{
        table.getItems().clear();
        tableNom.setCellValueFactory(
                new PropertyValueFactory<>("nom")
        );
        tableDesc.setCellValueFactory(
                new PropertyValueFactory<>("description")
        );
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/jeu/view/viewMenu.fxml");
        loader.setLocation(xmlUrl);
        ControllerMenu cm = new ControllerMenu();
        cm.addController(this);
        loader.setController(cm);
        this.cg = cm;
        tabGen.setContent(loader.load());
        
        
    }
    
    public void addGame(Jeu j){
        this.game = j;
    }
    
    @Override
    public void showString(String s){
        this.cg.showString(s);
    }
    @Override
    public void clearText(){
        this.cg.clearText();
    }
    @Override
    public void addButton(Button b){
        this.cg.addButton(b);
    
    }
    public void addButtonChoixPerso(String s, int id){
        Button b = new Button(s);
        b.setOnAction(new EventHandler<ActionEvent>() {   
            @Override 
            public void handle(ActionEvent e) { 
                clearText();
                game.parlerBis(id);
            } 
        });
        this.cg.addButton(b);
    }
    public void choixPerso(int id){
        game.parlerBis(id);
    }
    
    
    public void addButtonChoixParler(String s, int rep, int id){
        Button b = new Button(s);
        b.setOnAction(new EventHandler<ActionEvent>() {   
            @Override 
            public void handle(ActionEvent e) { 
                game.parlerTer(rep, id);
            } 
        });
        this.cg.addButton(b);
    }
      
    
    public void add(int id){
        this.cg.add(id);
    }
    public void changePos(int i) throws IOException{
        game.changePos(i);
    }
    
    
    @Override
    public void clearButton(){
        this.cg.clearButton();
    }
    @Override
    public void buttonReset(){
        Button b = new Button("Retour au menu");
        b.setOnAction(new EventHandler<ActionEvent>() {   
            @Override 
            public void handle(ActionEvent e) { 
                try {
                    initialize();
                } catch (IOException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            } 
        });
        this.cg.addButton(b);
    }
    @Override
    public void actionJoueur(){
        showString("\nPour accéder au contenu suivant Cliquer sur une des options suivantes : ");
        showString("");
        Button b4 = new Button();
        b4.setOnAction(new EventHandler<ActionEvent>() {   
            @Override 
            public void handle(ActionEvent e) { 
                try {
                    changeVue(10);
                } catch (IOException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
                game.actionsJoueur(4);
            } 
        });
        Image image1 = new Image(getClass().getResource("/jeu/images/iconCarte.png").toExternalForm());
        ImageView iconCarte = new ImageView(image1);
        iconCarte.setFitHeight(50);
        iconCarte.setFitWidth(50);
        b4.setGraphic(iconCarte);
        
        Button b5 = new Button();
        b5.setOnAction(new EventHandler<ActionEvent>() {   
            @Override 
            public void handle(ActionEvent e) { 
                game.actionsJoueur(5);
            } 
        });
        Image image2 = new Image(getClass().getResource("/jeu/images/iconExit.png").toExternalForm());
        ImageView iconExit = new ImageView(image2);
        iconExit.setFitHeight(50);
        iconExit.setFitWidth(50);
        b5.setGraphic(iconExit);
        
        
        this.cg.clearButton();
        this.cg.addButton(b4);
        this.cg.addButton(b5);
    }
    
    public void actionaPropos(){
        showString("\nPour accéder au contenu suivant Cliquer sur une des options suivantes : ");
        showString("");
        
        Button b0 = new Button("Jouer");
        b0.setOnAction(new EventHandler<ActionEvent>() {
            @Override 
            public void handle(ActionEvent e) { 
                try {
                    goMenu(1);
                } catch (IOException ex) {
                    Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
        Button b1 = new Button("Quitter");
        b1.setOnAction(new EventHandler<ActionEvent>() {   
            @Override 
            public void handle(ActionEvent e) { 
                game.actionsJoueur(5);
            } 
        });
        this.cg.addButton(b0);
        this.cg.addButton(b1);
    }
    
    public void goMenu(int i) throws IOException{
        this.game.menu(i);
    }
    public void addObjetToTable(Objets obj){
        this.table.getItems().add(obj);
    }
    public void changeVue(int i) throws IOException{
        FXMLLoader loader = new FXMLLoader();
        String s = "/jeu/view/viewBureau.fxml";
        ControlleurGeneral cgen =  new ViewBureauController();
        switch (i){
            case 0 :
                s = "/jeu/view/viewBureau.fxml";
                cgen =  new ViewBureauController();
                break;
            case 1 :
                s = "/jeu/view/viewCommisariat.fxml";
                cgen = new ViewCommissariatController();
                
                break;
            case 2 :
                s = "/jeu/view/viewMorgue.fxml";
                cgen = new ViewMorgueController();
                break;
            case 3 :
                s = "/jeu/view/viewMonique.fxml";
                cgen = new ViewMoniqueController();
                break;
            case 4 :
                s = "/jeu/view/viewPont.fxml";
                cgen = new ViewPontController();
                break;
            case 5 :
                s = "/jeu/view/viewRestaurant.fxml";
                cgen = new ViewRestaurantController();
                break;
            case 6 :
                s = "/jeu/view/viewVictime.fxml";
                cgen = new ViewVictimeController();
                break;
            case 10 :
                s = "/jeu/view/viewVille.fxml";
                cgen = new ViewVilleController();
                break;
            case 11 : 
                s = "/jeu/view/viewaPropos.fxml";
                cgen = new ViewaProposController();
            default :
        }
        URL xmlUrl = getClass().getResource(s);
        loader.setLocation(xmlUrl);
        cgen.addController(this);
        loader.setController(cgen);
        this.cg = cgen;
        this.tabGen.setContent(loader.load());
        
    }
    
    public void addObjetInv( int i){
            this.game.addObjetInv(i);
    }
    
}
