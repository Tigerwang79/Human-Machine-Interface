package jeu;

import java.io.IOException;
import java.net.URL;
import jeu.modele.Dialogues;
import jeu.modele.Jeu;
import jeu.modele.Reponses;
import jeu.modele.Personnages;
import jeu.modele.Lieux;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import jeu.controller.Controller;

public class Main extends Application{
    @Override
    public void start(Stage primaryStage) throws IOException { 
        
        FXMLLoader loader = new FXMLLoader();
        URL xmlUrl = getClass().getResource("/jeu/view/viewOriginel.fxml");
        loader.setLocation(xmlUrl);
        
        Jeu game = new Jeu();
                
        Controller cont = new Controller();
        cont.addGame(game);
        game.addController(cont);
        Lieux.addController(cont);
        Dialogues.addController(cont);
        Reponses.addController(cont);
        Personnages.addController(cont);
        game.addController(cont);
        
        
        
        loader.setController(cont);
        
        
        Parent root = loader.load();
        
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("Les aventures d'Andrew Benett");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        //game.addController(cont);
        //cont.startGame();
        
    }
        

    public static void main(String...args){
        launch(args);
        
        /*
        Jeu game = new Jeu();
        game.menu();
        */
    }
}
