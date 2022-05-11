/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeudelavie.model;

import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

/**
 * Une classe ressort pour espacer dans les Box
 * @author Valdrin Salihi & Baptiste Saint-Léger
 */
public class Ressort extends Region{
    
    public Ressort(){
        this.setMaxWidth(Double.MAX_VALUE);
        HBox.setHgrow(this,Priority.ALWAYS); 
        this.setMaxHeight(Double.MAX_VALUE);
        VBox.setVgrow(this, Priority.ALWAYS);
    }
    
}
