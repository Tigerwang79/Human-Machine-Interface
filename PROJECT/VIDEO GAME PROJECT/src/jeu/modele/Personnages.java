package jeu.modele;

import javax.swing.text.StyledEditorKit;
import java.util.Scanner;
import jeu.Affichants;
import jeu.controller.Controller;

public class Personnages extends Affichants {

	private int id;
	private String nom;
	private String description;
	private Dialogues dialogue;
        private static Controller cont;


	/**
	 * 
	 * @param nom
	 * @param desc
	 * @param dial
	 */
	public Personnages(int id, String nom, String desc, Dialogues dial) {
		this.id = id;
		this.nom = nom;
		this.description = desc;
		this.dialogue = dial;
	}
        
        public static void addController(Controller c){
            Personnages.cont = c;
        }
        
	public String getNom() {
		return nom;
	}

	public String getDescription() {
		return description;
	}

	public Dialogues getDialogue() {
		return dialogue;
	}


	/**
	 * 
	 * @param dial
	 */
	public void changeDialogue(Dialogues dial) {
		this.dialogue = dial;
	}


	public void talk(int id) {
		this.cont.showString(this.nom + " : \n");
		this.dialogue.affiche(id);
        }
        public void talkBis(int i){
		this.dialogue.getReponse(i).afficheLong();

		this.dialogue= this.dialogue.getReponse(i).getDialogSuiv();

	}

	public void affiche() {
		this.cont.showString("Description du personnage : " + this.description);
	}

	public int getId(){
		return  this.id;
	}

}