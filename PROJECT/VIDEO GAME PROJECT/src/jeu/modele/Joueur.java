package jeu.modele;

import java.util.ArrayList;
import java.util.Scanner;
import jeu.controller.Controller;

public class Joueur {

	private ArrayList<Objets> inventaire = new ArrayList<>();
	private ArrayList<Lieux> lieuxVisit = new ArrayList<>();
	private ArrayList<Lieux> lieuxEnt = new ArrayList<>();
	private Lieux position;
        private Controller cont;
        
        public void addController(Controller c){
            this.cont = c;
        }

	public ArrayList<Objets> getInventaire() {
		return inventaire;
	}

	public ArrayList<Lieux> getLieuxVisit() {
		return lieuxVisit;
	}

	public ArrayList<Lieux> getLieuxEnt() {
		return lieuxEnt;
	}

	public Lieux getPosition() {
		return position;
	}


	//CONSTRUCTEUR
	/**
	 * 
	 * @param pos
	 */
	public Joueur(Lieux pos) {
		this.position = pos;
	}


	//METHODE
	/**
	 * 
	 * @param obj
	 */
	public void addObj(Objets obj) {
		this.inventaire.add( obj );
	}

	/**
	 * 
	 * @param lieu
	 */
	public void addLieuVisit(Lieux lieu) {
		this.lieuxVisit.add( lieu );
	}

	/**
	 * 
	 * @param lieu
	 */
	public void addLieuEnt(Lieux lieu) {
		this.lieuxEnt.add( lieu );
	}

	/**
	 * 
	 * @param lieu
	 */
	public void changePos(Lieux lieu) {
		Scanner sc = new Scanner(System.in);
		this.position = lieu;
		this.position.affiche();
	}

	public void afficheInv() {
            this.cont.clearText();
            this.cont.showString("Mon inventaire :\n");
            if(this.inventaire.size() == 0){
                    this.cont.showString("Vous ne possédez pas d'objet(s)");
            }else {
                    for (int i = 0; i < this.inventaire.size(); i++) {
                            this.cont.showString( "    Nom : " + this.inventaire.get( i ).getNom() );
                            this.cont.showString( "    Description : " + this.inventaire.get( i ).getDescription()+"\n");
                    }
            }
            this.cont.actionJoueur();

	}

	public  int nbLieu(){
		return lieuxEnt.size();
	}
        
        
        public void addObjInv(int i){
            this.cont.showString("-Vous avez pris : "+this.position.getObjet(i).getNom());
            this.inventaire.add(this.position.getObjet(i));
            this.cont.addObjetToTable(this.position.getObjet(i));
            this.position.getObjet(i).take();
        }
}