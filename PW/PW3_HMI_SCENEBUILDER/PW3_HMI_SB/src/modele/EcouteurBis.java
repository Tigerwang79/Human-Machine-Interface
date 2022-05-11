/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import javafx.event.Event;
import javafx.scene.Node;
import javafx.scene.control.Label;

/**
 *
 * @author Valdrin Salihi
 */
public class EcouteurBis extends Ecouteur{
    
    private final Node toModify;
    
    public EcouteurBis(String msg, Node toModify, Boolean stop) {
        super(msg, stop);
        this.toModify = toModify;
    }
    
    @Override
    public void handle(Event event)
        {
            System.out.println(super.msg + "\n" +event.getEventType() +"\n"+event.getTarget()+"\n"+ event.getSource()+"\n");
            if(event.getSource() instanceof Label)
                ((Label)toModify).setText(msg);
            
            if(super.stop)
                event.consume();
        } 
}
