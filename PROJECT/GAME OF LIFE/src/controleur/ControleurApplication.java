/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudelavie.controleur;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import javafx.application.Platform;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.collections.FXCollections;
import javafx.concurrent.Service;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import jeudelavie.model.DefaultTampon;
import jeudelavie.model.Game;
import jeudelavie.vue.View;

/**
 * FXML Controller class
 *
 * @author Valdrin Salihi & Baptiste Saint-Léger
 */
public class ControleurApplication {
        
    @FXML
    private VBox boxEdition;

    @FXML
    private TextField txtFieldChangeTaille;

    @FXML
    private TextField txtFieldInitialisation;

    @FXML
    private VBox boxParametre;

    @FXML
    private ComboBox<Integer> comboBoxMortSolitude;

    @FXML
    private ComboBox<Integer> comboBoxMortAsphyxie;

    @FXML
    private ComboBox<Integer> comboBoxVieMin;

    @FXML
    private ComboBox<Integer> comboBoxVieMax;

    @FXML
    private Button btnPlayPause;
    
    private BooleanProperty isRun = new SimpleBooleanProperty(false);

    @FXML
    private VBox centerBox;
    
    private GridPane gc = new GridPane();
    private Game game;
    
    private IntegerProperty dim = new SimpleIntegerProperty(100);
    private double proba;
    private IntegerProperty mortSolitude = new SimpleIntegerProperty(0);
    private IntegerProperty mortAsphyxie = new SimpleIntegerProperty(0);
    private IntegerProperty vieMin = new SimpleIntegerProperty(0);
    private IntegerProperty vieMax = new SimpleIntegerProperty(0);
    private DoubleProperty cellSize = new SimpleDoubleProperty(5);

    @FXML
    private VBox rightBox;

    @FXML
    private VBox boxTampon;

    private GridPane gcTamp = new GridPane();
    private int dimTamp = 10;
    private Game gameTamp;

    @FXML
    private ComboBox<String> comboBoxModeles;

    @FXML
    private Button btnCharger;

    @FXML    
    private HBox compteur;
    private Label lbCompteur = new Label("0");
    private IntegerProperty comp = new SimpleIntegerProperty(0);
    
    private ControleurBasique controleurBasique;
    
    private List<Integer> comboBoxListChoix = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    private List<String> comboBoxListModele = Arrays.asList("Jeux prédéfinis", "bloc", "bateau", "pain", "mare", "ruche", "tube", "clignotant", "planeur", "LWSS", "mathusalem", "ruche+", "escalier", "pulsar");
    
    private final Alert myPopUpConfirmation = new Alert(Alert.AlertType.CONFIRMATION);
    
    private final Alert myPopUpErreur = new Alert(Alert.AlertType.ERROR);
    
    private final Alert myPopUpInformation = new Alert(Alert.AlertType.INFORMATION);

    public void setControllerViewBasic(ControleurBasique controleurBasique) {
        this.controleurBasique = controleurBasique;
    }
    
    @FXML
    void initialize(){
        
        comboBoxMortSolitude.setItems(FXCollections.observableList(comboBoxListChoix));
        comboBoxMortSolitude.getSelectionModel().select(0);
        
        comboBoxMortAsphyxie.setItems(FXCollections.observableList(comboBoxListChoix));
        comboBoxMortAsphyxie.getSelectionModel().select(3);
        
        comboBoxVieMin.setItems(FXCollections.observableList(comboBoxListChoix));
        comboBoxVieMin.getSelectionModel().select(2);
        
        comboBoxVieMax.setItems(FXCollections.observableList(comboBoxListChoix));
        comboBoxVieMax.getSelectionModel().select(2);
        
        comboBoxModeles.setItems(FXCollections.observableList(comboBoxListModele));
        comboBoxModeles.getSelectionModel().select(0);
        
        centerBox.getChildren().add(gc);
        compteur.getChildren().add(lbCompteur);
        compteur.setAlignment(Pos.TOP_CENTER);
        
        mortSolitude.bind(comboBoxMortSolitude.valueProperty());
        mortAsphyxie.bind(comboBoxMortAsphyxie.valueProperty());
        vieMin.bind(comboBoxVieMin.valueProperty());
        vieMax.bind(comboBoxVieMax.valueProperty());
        
        gc.disableProperty().bind(isRun);
        boxParametre.disableProperty().bind(isRun);
        boxEdition.disableProperty().bind(isRun);
        
        boxTampon.getChildren().add(gcTamp);
        init(1);
        init(2);
        
        //gc.setMinSize(200, 200);
        gc.setAlignment(Pos.TOP_CENTER);
        
        gc.setOnMouseClicked((MouseEvent event) -> {                                    //pour un clic sur le plateau
            int x = (int) (event.getX() / (gc.getWidth() / dim.get()));
            int y = (int) (event.getY() / (gc.getHeight() / dim.get()));
            
            if(event.isShiftDown() && event.getButton().equals(MouseButton.SECONDARY))  //pour le click droit et le shift
            {
                game.drawTampon(x+1, y+1, gameTamp);
                View.drawCells(gc, dim.get(), game, false);
            }
            else if(event.getButton().equals(MouseButton.PRIMARY))                      //pour le click gauche
            {
                if(game.tab[x+1][y+1]){
                    game.tab[x+1][y+1] = false;
                    View.drawCell(gc, dim.get(), x, y, "black", "white");
                }else {
                    game.tab[x+1][y+1] = true;
                    View.drawCell(gc, dim.get(), x, y, "black", "black");
                }
            }
        });
        
        gc.setOnScroll((ScrollEvent event) -> {                                         //pour un scroll sur le plateau
            if(event.getDeltaY() > 0)
            {
                if((cellSize.get() + 1) * dim.get() < 950)
                    cellSize.set(cellSize.get() + 1);
            }
            else 
                if(cellSize.get() - 1 >= 5)
                    cellSize.set(cellSize.get() - 1);
            
            gc.getChildren().clear();
            View.drawGrid(gc, dim.get(), cellSize);
            View.drawCells(gc, dim.get(), game, isRun.get());
        });
        
        gcTamp.setOnMouseClicked(event -> {                                             //pour un click sur la zone tampon
            int x = (int) (event.getX() / (gcTamp.getWidth() / dimTamp));
            int y = (int) (event.getY() / (gcTamp.getHeight() / dimTamp));
            if(gameTamp.tab[x][y]){
                gameTamp.tab[x][y] = false;
                View.drawCell(gcTamp, dimTamp, x, y, "black", "white");
            }else {
                gameTamp.tab[x][y] = true;
                View.drawCell(gcTamp, dimTamp, x, y, "black", "black");
            }
        });
    }
    
    @FXML
    void comboBoxModeles(ActionEvent event) {
        if ("Jeux prédéfinis".equals(comboBoxModeles.getValue())){
            btnCharger.setStyle("-fx-border-color: black ; -fx-background-color: red");
        }
        else {
            btnCharger.setStyle("-fx-border-color: #ffd700 ; -fx-background-color: red ; -fx-border-width: 5");
        }
    }

    @FXML
    void btnCharger(ActionEvent event) {
        init(2);
        
        if (null != comboBoxModeles.getValue())switch (comboBoxModeles.getValue()) {
            case "bloc":
                DefaultTampon.loadTamponModele(1, gameTamp, gcTamp, dimTamp);
                break;
            case "bateau":
                DefaultTampon.loadTamponModele(2, gameTamp, gcTamp, dimTamp);
                break;
            case "pain":
                DefaultTampon.loadTamponModele(3, gameTamp, gcTamp, dimTamp);
                break;
            case "mare":
                DefaultTampon.loadTamponModele(4, gameTamp, gcTamp, dimTamp);
                break;
            case "ruche":
                DefaultTampon.loadTamponModele(5, gameTamp, gcTamp, dimTamp);
                break;
            case "tube":
                DefaultTampon.loadTamponModele(6, gameTamp, gcTamp, dimTamp);
                break;
            case "clignotant":
                DefaultTampon.loadTamponModele(7, gameTamp, gcTamp, dimTamp);
                break;
            case "planeur":
                DefaultTampon.loadTamponModele(8, gameTamp, gcTamp, dimTamp);
                break;
            case "LWSS":
                DefaultTampon.loadTamponModele(9, gameTamp, gcTamp, dimTamp);
                break;
            case "mathusalem":
                DefaultTampon.loadTamponModele(10, gameTamp, gcTamp, dimTamp);
                break;
            case "ruche+":
                DefaultTampon.loadTamponModele(11, gameTamp, gcTamp, dimTamp);
                break;
            case "escalier":
                DefaultTampon.loadTamponModele(12, gameTamp, gcTamp, dimTamp);
                break;
            case "pulsar":
                DefaultTampon.loadTamponModele(13, gameTamp, gcTamp, dimTamp);
                break;
            default:
                break;
        }
    }

    @FXML
    void btnPlayPause(ActionEvent event) {
        if(isRun.get())
        {
            isRun.set(false);
            Image imagePlay = new Image(getClass().getResource("/jeudelavie/image/logoPlay.png").toExternalForm());
            ImageView logoPlay = new ImageView(imagePlay);
            logoPlay.setPreserveRatio(true);
            logoPlay.setFitWidth(55);
            logoPlay.setFitHeight(45);
            btnPlayPause.setGraphic(logoPlay);
            View.drawCells(gc, dim.get(), game, isRun.get());
        }
        else
        {
            isRun.set(true);
            Image imagePause = new Image(getClass().getResource("/jeudelavie/image/logoPause.png").toExternalForm());
            ImageView logoPause = new ImageView(imagePause);
            logoPause.setPreserveRatio(true);
            logoPause.setFitWidth(55);
            logoPause.setFitHeight(45);
            btnPlayPause.setGraphic(logoPause);
            doCalculate();
        }
    }

    @FXML
    void btnQuitter(ActionEvent event) {
        myPopUpConfirmation.setTitle("Quitter l'application");
        myPopUpConfirmation.setContentText("Êtes vous sûr de vouloir quitter l'application?");
        Optional<ButtonType> option = myPopUpConfirmation.showAndWait();
        
        if (option.get() == ButtonType.OK){
           Platform.exit();
           System.out.println("Merci de votre visite à bientôt !");
        }
        else{
            myPopUpConfirmation.close();
        }
    }
    
    public void init(int i)
    {
        switch (i) {
            case 1:                                                                                 //initialise la game et le plateau à vide
                try {
                    gc.getChildren().clear();
                    cellSize.set(5);
                    game = new Game(dim.get(), mortSolitude, mortAsphyxie, vieMin, vieMax);
                    View.drawGrid(gc, dim.get(), cellSize);
                    lbCompteur.setText("0");
                    comp.set(0);
                    
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 2:                                                                                 //initialise la gameTamp et le tampon à vide
                try {
                    gcTamp.getChildren().clear();
                    gameTamp = new Game(dimTamp, mortSolitude, mortAsphyxie, vieMin, vieMax);
                    View.drawGrid(gcTamp, dimTamp, rightBox.getPrefWidth());
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 3:                                                                                 //réinitialise la game et le plateau selon la probabilité
                try {
                    gc.getChildren().clear();
                    cellSize.set(5);
                    game = new Game(dim.get(), mortSolitude, mortAsphyxie, vieMin, vieMax, proba);
                    View.drawGrid(gc, dim.get(), cellSize);
                    View.drawCells(gc, dim.get(), game, isRun.get());
                    lbCompteur.setText("0");
                    comp.set(0);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 4:                                                                                 //agrandi la taille de game et du plateau
                try {
                    gc.getChildren().clear();
                    cellSize.set(5);
                    View.drawGrid(gc, dim.get(), cellSize);
                    game.extend(dim.get());
                    View.drawCells(gc, dim.get(), game, isRun.get());
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            default:
                System.out.println("erreur fonction init (i = " + i + ")");
                break;
        }
        
    }
    
    @FXML
    void txtFieldChangeTaille(ActionEvent event){
        myPopUpConfirmation.setTitle("Changement de la taille du plateau de jeu");
        myPopUpConfirmation.setContentText("Êtes vous sûr de vouloir changer la taille du plateau à " + txtFieldChangeTaille.getText() + " x " + txtFieldChangeTaille.getText() + "?");
        
        if (dim.get() < Integer.parseInt(txtFieldChangeTaille.getText())){              //si la valeau est plus grand que la dimension du plateau
            Optional<ButtonType> option = myPopUpConfirmation.showAndWait();
            
            if (option.get() == ButtonType.OK){
                dim.set(Integer.parseInt(txtFieldChangeTaille.getText()));
                init(4);
            }
        }
        else if (dim.get() > Integer.parseInt(txtFieldChangeTaille.getText())){         //si la valeur est plus petite que la dimension du plateau
            Optional<ButtonType> option = myPopUpConfirmation.showAndWait();
            
            if (option.get() == ButtonType.OK){
                dim.set(Integer.parseInt(txtFieldChangeTaille.getText()));
                init(1);
            }
        }
    }

    @FXML
    void btnReset(ActionEvent event) {
        myPopUpConfirmation.setTitle("Réinitialisation du plateau de jeu");
        myPopUpConfirmation.setContentText("Êtes vous sûr de vouloir réinitialiser le plateau?");
        Optional<ButtonType> option = myPopUpConfirmation.showAndWait();
        
        if (option.get() == ButtonType.OK){
           init(1);
        }
        else{
            myPopUpConfirmation.close();
        }
    }

    @FXML
    void txtFieldInitialisation(ActionEvent event) {
        if (comboBoxVieMin.getValue() > comboBoxVieMax.getValue()){
            myPopUpErreur.setTitle("Données rentrées incohérentes");
            myPopUpErreur.setContentText("La vieMin ne peut pas être supérieur à la vieMax, \n" + "veuillez rentrer de nouvelles données.");
            myPopUpErreur.show();
        }
        else {
            myPopUpConfirmation.setTitle("Initialisation du plateau de jeu");
            myPopUpConfirmation.setContentText("Êtes vous sûr de vouloir initialiser le plateau avec ces paramètres :\n"
                    + "- taille : " + txtFieldChangeTaille.getText() + " X " + txtFieldChangeTaille.getText() + "\n"
                    + "- probabilité : " + txtFieldInitialisation.getText() + "\n"
                    + "- mortSolitude : " + comboBoxMortSolitude.getValue() + "\n"
                    + "- mortAsphyxie : " + comboBoxMortAsphyxie.getValue() + "\n"
                    + "- vieMin : " + comboBoxVieMin.getValue() + "\n"
                    + "- vieMax : " + comboBoxVieMax.getValue());
            Optional<ButtonType> option = myPopUpConfirmation.showAndWait();
        
            if (option.get() == ButtonType.OK){
                dim.set(Integer.parseInt(txtFieldChangeTaille.getText()));
                proba = Double.parseDouble(txtFieldInitialisation.getText());
                init(3);
            }
            else{
                myPopUpConfirmation.close();
            }
        }
    }
    
    // Je déclare la tache dont la méthode call ne retourne rien 
    private final Service<Void> calculateService = new Service<Void>(){
        @Override 
        // la méthode createTask chargée de créer la tache
        protected Task<Void> createTask(){
            return new Task<Void>(){
                // la méthode call qui contient le calcul. 
                @Override
                protected Void call() throws Exception {  
                    int i = comp.get();
                    while(isRun.get()) {
                        i++;
                        updateMessage("" + i);
                        
                        game.update();
                        View.drawCells(gc, dim.get(), game, isRun.get());
                        game.resetNewTab();
                        Thread.sleep(800);
                    }
                    return null ; 
                }
            };         
        }
    };  
    
    private void doCalculate() {
        lbCompteur.textProperty().bind(calculateService.messageProperty());
        
        // J'ajoute un écouteur pour traiter la fin de la tache 
        calculateService.stateProperty().addListener( (ObservableValue, oldValue, newValue) -> {
            switch (newValue) {
                case FAILED:
                case CANCELLED:
                    lbCompteur.textProperty().unbind();
                    calculateService.reset(); 
                    comp.set(Integer.parseInt(lbCompteur.getText()));
                    break; 
                case SUCCEEDED:
                    lbCompteur.textProperty().unbind();
                    calculateService.reset(); 
                    comp.set(Integer.parseInt(lbCompteur.getText()));
                    break;                    
            }
        });  

        //Je demande au service de lancer la tache. 
        calculateService.start();
    };
}