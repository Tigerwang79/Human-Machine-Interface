package jeu.modele;

import jeu.modele.Reponses;
import jeu.modele.Lieux;
import jeu.modele.Objets;
import java.util.ArrayList;
import java.util.Scanner;
import jeu.Affichants;
import jeu.controller.Controller;

public class Dialogues extends Affichants {

	private int id;
	private String texte;
	private ArrayList<Reponses> listReponses = new ArrayList<>();
	private boolean isEnd;
	private boolean isEndOfGame;
	private  ArrayList<Objets> debloqueObjet = new ArrayList<>();
	private ArrayList<Lieux> debloqueLieu = new ArrayList<>();
        private static Controller cont;

	/**
	 * 
	 * @param id
	 * @param texte
	 * @param isEnd
	 */
	public Dialogues(int id, String texte, boolean isEnd, boolean isEndOfGame) {
			this.id = id;
			this.texte = texte;
			this.isEnd = isEnd;
			this.isEndOfGame = isEndOfGame;
	}
        public static void addController(Controller c){
            Dialogues.cont = c;
        }

	public int getNbReponse(){
		return  this.listReponses.size();
	}

	public  Reponses getReponse(int i){
		return listReponses.get(i);
	}

	public void addReponse(Reponses rep) {

		this.listReponses.add( rep );
	}

	public void addObjet(Objets obj){
		debloqueObjet.add(obj);
	}

	public  void remLieu(){ debloqueLieu.remove(0);	}

	public void addLieu(Lieux l){ debloqueLieu.add(l);}

	public int nbLieu(){ return  debloqueLieu.size(); }

	public Lieux getLieu(int i){ return debloqueLieu.get(i);}

	/**
	 * 
	 * @param pos
	 */
	public void remReponse(int pos) {
		this.listReponses.remove( pos );
	}
        
	public void affiche(int id) {
		boolean b = Boolean.TRUE;
                
		this.cont.showString(this.texte +"\n");
		if(!this.isEnd) {
			for (int i = 0; i < this.listReponses.size(); i++) {
				if (this.listReponses.get(i).getListeObjets().size() == 0) {
					this.cont.addButtonChoixParler(this.listReponses.get(i).getTexteCourt(),i,id);
				} else {
					for (int j = 0; j < this.listReponses.get(i).getListeObjets().size(); j++) {
						b = b && this.listReponses.get(i).getListeObjets().get(j).getIsTaken();
					}
					if (b) {
						this.cont.addButtonChoixParler(this.listReponses.get(i).getTexteCourt(),i,id);
					}
				}
			}
		}
	}
        
        public void affiche(){
            this.cont.showString(this.texte +"\n");
        }

	public void unlockItems(){
		if(debloqueObjet.size() > 0){
			for (int i =0; i<debloqueObjet.size(); i++){
				debloqueObjet.get(i).CanBeFound();
			}
		}
	}

	public int getId() {

		return this.id;
	}

	public boolean getIsEnd(){
		return this.isEnd;
	}
	public boolean getIsEndOfGame(){
		return this.isEndOfGame;
	}


}