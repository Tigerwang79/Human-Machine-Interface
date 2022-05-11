
package jeudelavie.vue;

import javafx.beans.property.DoubleProperty;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import jeudelavie.model.Game;


/**
 *
 * @author baptistesaintleger
 */
public class View {
    
    public static void drawGrid(GridPane gc, int dim, Double w) {                           //dessine le grille du tampon vide
        for(int i = 0; i < dim; i++)
        {
            for(int j = 0; j < dim; j++)
            {
                Label b = new Label();
                b.setPrefSize(w/dim, w/dim);
                b.setStyle("-fx-background-color: white; -fx-border-color: black");
                gc.add(b, j, i);
            }
        }
    }
    
    public static void drawGrid(GridPane gc, int dim, DoubleProperty cellSize)              //dessine la grille du plateau vide
    {
        for(int i = 0; i < dim; i++)
        {
            for(int j = 0; j < dim; j++)
            {
                Label b = new Label();
                b.setPrefSize(cellSize.get(), cellSize.get());
                b.setMaxSize(cellSize.get(), cellSize.get());
                b.setMinSize(cellSize.get(), cellSize.get());
                b.setStyle("-fx-background-color: white; -fx-border-color: black");
                gc.add(b, j, i);
            }
        }
    }
    
    public static void drawCell(GridPane gc, int dim, int x, int y, String colorBorder, String color)       //dessine une case de la grille selon une couleur en paramètre
    {
        gc.getChildren().get(x + y * dim).setStyle("-fx-border-color: " + colorBorder + ";-fx-background-color: " + color);
    }
    
    public static void drawCells(GridPane gc, int dim, Game game, boolean isRun)                            //dessine toutes les cases de la grille selon l'état du jeu et si le jeu est en marche
    {
        for(int i = 0; i < dim; i++)
        {
            for(int j = 0; j < dim; j++)
            {
                drawCell(gc, dim, j, i, isRun ? "white" : "black",(game.tab[j+1][i+1] ? "black" : "white"));
            }
        }
    }
}
