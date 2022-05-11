/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;


import javafx.scene.control.Label;
import controller.ControllerEx08;
import javafx.geometry.Pos;

/**
 *
 * @author Valdrin Salihi
 */
public class Damier {
    
    private ControllerEx08 cont;
    
    public void colorDamier(Damier damier){
        
        Label[][] labelDamier;
        Label[][] labelExcept;

        int width = 11;
        int height = 11;

        final int x1 = 3;
        final int y1 = 2;

        final int x2 = 4;
        final int y2 = 2;

        final int x3 = 4;
        final int y3 = 5;
        
        labelDamier = new Label[width][height];
        labelExcept = new Label[width][height];
    
        for(int i = 1 ; i < width ; i++) {
            for(int j = 1 ; j < height ; j++) {
                labelDamier[i][j] = new Label("     ");
                labelDamier[i][j].setStyle("-fx-background-color:red");
                cont.damier.add(labelDamier[i][j], j, i);

                if(i == y1 && j == x1) {
                    labelExcept[i][j] = new Label("  1 ");
                    labelExcept[i][j].setStyle("-fx-background-color:green");
                    cont.damier.add(labelExcept[i][j], j, i);
                    labelExcept[i][j].setAlignment(Pos.CENTER);
                }
                else if(i == y2 && j == x2) {
                    labelExcept[i][j] = new Label("  2 ");
                    labelExcept[i][j].setStyle("-fx-background-color:cyan");
                    cont.damier.add(labelExcept[i][j], j, i);
                    labelExcept[i][j].setAlignment(Pos.CENTER);
                }
                else if(i == y3 && j == x3) {
                    labelExcept[i][j] = new Label("  0 ");
                    labelExcept[i][j].setStyle("-fx-background-color:grey");
                    cont.damier.add(labelExcept[i][j], j, i);
                    labelExcept[i][j].setAlignment(Pos.CENTER);
                }               
            }
        }
    }
}
