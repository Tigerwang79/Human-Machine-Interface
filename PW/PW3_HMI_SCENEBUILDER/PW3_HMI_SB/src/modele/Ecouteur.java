/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import javafx.event.Event;
import javafx.event.EventHandler;

/**
 *
 * @author Valdrin Salihi
 */
public class Ecouteur implements EventHandler{

    protected final String msg;
    protected final Boolean stop;

    public Ecouteur(String msg, Boolean stop)
    {
        this.msg = msg;
        this.stop = stop;
    }

    @Override
    public void handle(Event event)
    {
        System.out.println(this.msg);
        System.out.println(event.getSource());
        System.out.println(event.getTarget());
        System.out.println();

        if(this.stop)
        event.consume();
    }
}
