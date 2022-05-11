/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeudelavie.model;

import javafx.scene.layout.GridPane;
import jeudelavie.vue.View;

/**
 *
 * @author baptistesaintleger
 */
public final class DefaultTampon {
    
    public static void loadTamponModele(int i, Game gameTamp, GridPane gcTamp, int dimTamp)
    {
        switch(i) {
            case 1:
                try {
                    //modèle bloc
                    gameTamp.tab[4][4] = true;
                    gameTamp.tab[5][4] = true;
                    gameTamp.tab[4][5] = true;
                    gameTamp.tab[5][5] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 2:
                try {
                    //modèle bateau
                    gameTamp.tab[4][4] = true;
                    gameTamp.tab[5][4] = true;
                    gameTamp.tab[4][5] = true;
                    gameTamp.tab[6][5] = true;
                    gameTamp.tab[5][6] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 3:
                try {
                    //modèle pain
                    gameTamp.tab[4][3] = true;
                    gameTamp.tab[5][3] = true;
                    gameTamp.tab[3][4] = true;
                    gameTamp.tab[6][4] = true;
                    gameTamp.tab[3][5] = true;
                    gameTamp.tab[5][5] = true;
                    gameTamp.tab[4][6] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 4:
                try {
                    //modèle mare
                    gameTamp.tab[4][3] = true;
                    gameTamp.tab[5][3] = true;
                    gameTamp.tab[3][4] = true;
                    gameTamp.tab[6][4] = true;
                    gameTamp.tab[3][5] = true;
                    gameTamp.tab[6][5] = true;
                    gameTamp.tab[4][6] = true;
                    gameTamp.tab[5][6] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 5:
                try {
                    //modèle ruche
                    gameTamp.tab[4][3] = true;
                    gameTamp.tab[3][4] = true;
                    gameTamp.tab[5][4] = true;
                    gameTamp.tab[3][5] = true;
                    gameTamp.tab[5][5] = true;
                    gameTamp.tab[4][6] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 6:
                try {
                    //modèle tube
                    gameTamp.tab[5][3] = true;
                    gameTamp.tab[4][4] = true;
                    gameTamp.tab[6][4] = true;
                    gameTamp.tab[3][5] = true;
                    gameTamp.tab[5][5] = true;
                    gameTamp.tab[4][6] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 7:
                try {
                    //modèle clignotant
                    gameTamp.tab[3][4] = true;
                    gameTamp.tab[4][4] = true;
                    gameTamp.tab[5][4] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 8:
                try {
                    //modèle planeur
                    gameTamp.tab[4][3] = true;
                    gameTamp.tab[5][4] = true;
                    gameTamp.tab[3][5] = true;
                    gameTamp.tab[4][5] = true;
                    gameTamp.tab[5][5] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 9:
                try {
                    //modèle LWSS
                    gameTamp.tab[2][3] = true;
                    gameTamp.tab[5][3] = true;
                    gameTamp.tab[6][4] = true;
                    gameTamp.tab[2][5] = true;
                    gameTamp.tab[6][4] = true;
                    gameTamp.tab[3][6] = true;
                    gameTamp.tab[4][6] = true;
                    gameTamp.tab[6][5] = true;
                    gameTamp.tab[5][6] = true;
                    gameTamp.tab[6][6] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                    //modèle LWSS
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 10:
                try {
                    //modèle mathusalem
                    gameTamp.tab[4][3] = true;
                    gameTamp.tab[4][4] = true;
                    gameTamp.tab[5][4] = true;
                    gameTamp.tab[4][5] = true;
                    gameTamp.tab[3][5] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 11:
                try {
                    //modèle ruche+
                    gameTamp.tab[4][3] = true;
                    gameTamp.tab[5][3] = true;
                    gameTamp.tab[3][4] = true;
                    gameTamp.tab[5][4] = true;
                    gameTamp.tab[3][5] = true;
                    gameTamp.tab[5][5] = true;
                    gameTamp.tab[4][6] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 12:
                try {
                    //modèle escalier
                    gameTamp.tab[5][4] = true;
                    gameTamp.tab[6][4] = true;
                    gameTamp.tab[4][5] = true;
                    gameTamp.tab[5][5] = true;
                    gameTamp.tab[3][6] = true;
                    gameTamp.tab[4][6] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            case 13:
                try {
                    //modèle pulsar
                    gameTamp.tab[4][3] = true;
                    gameTamp.tab[4][7] = true;
                    gameTamp.tab[2][3] = true;
                    gameTamp.tab[2][4] = true;
                    gameTamp.tab[2][5] = true;
                    gameTamp.tab[2][6] = true;
                    gameTamp.tab[2][7] = true;
                    gameTamp.tab[6][3] = true;
                    gameTamp.tab[6][4] = true;
                    gameTamp.tab[6][5] = true;
                    gameTamp.tab[6][6] = true;
                    gameTamp.tab[6][7] = true;
                    View.drawCells(gcTamp, dimTamp, gameTamp, false);
                } catch (NumberFormatException e){
                    System.out.println(e.getMessage());
                }   break;
            default:
                System.out.println("erreur fonction loadTamponModele (i = " + i + ")");
            break;
        }
    }
}
