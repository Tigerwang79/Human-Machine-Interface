package jeu.modele;

import jeu.modele.Objets;
import java.util.ArrayList;
import jeu.Affichants;
import jeu.controller.Controller;
public class Reponses extends Affichants {

	private int id;
	private String texteCourt;
	private String texteLong;
	private ArrayList<Objets> listeObjets  = new ArrayList<>();
	private Dialogues dialogSuiv;
        private static Controller cont;

        
        public static void addController(Controller c){
            Reponses.cont = c;
        }
        
	public String getTexteCourt() {
		return texteCourt;
	}

	public String getTexteLong() {
		return texteLong;
	}

	public ArrayList<Objets> getListeObjets() {
		return listeObjets;
	}

	public Dialogues getDialogSuiv() {
		return dialogSuiv;
	}

	/**
	 * 
	 * @param id
	 * @param texteCourt
	 * @param texteLong
	 */
	public Reponses(int id, String texteCourt, String texteLong) {
		this.id = id;
		this.texteCourt = texteCourt;
		this.texteLong = texteLong;
	}

	/**
	 * 
	 * @param obj
	 */
	public void addObjet(Objets obj) {

		this.listeObjets.add( obj );
	}

	/**
	 * 
	 * @param dial
	 */
	public void changeDialogue(Dialogues dial) {

		this.dialogSuiv = dial;
	}

	/**
	 * 
	 * @param pos
	 */
	public void remObjet(int pos) {
		this.listeObjets.remove( pos );
	}


	public void afficheLong(){
		if(this.texteLong != ""){
			this.cont.showString("Andrew : \n" + this.texteLong + "\n\n");
		}
	}

	public void affiche() {

	}

	public int getId() {
		return this.id;
	}

}