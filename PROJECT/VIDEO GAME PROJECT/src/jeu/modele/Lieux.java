package jeu.modele;

import java.util.ArrayList;
import jeu.Affichants;
import jeu.controller.Controller;
public class Lieux extends Affichants {

	private int id;
	private String nom;
	private String description;
	private ArrayList<Personnages> listePerso = new ArrayList<>();
	private ArrayList<Objets> listeObjet = new ArrayList<>();
	private ArrayList<Lieux> lieuxVoisin = new ArrayList<>();
        private static Controller cont;


	public ArrayList<Personnages> getListePerso() {
		return listePerso;
	}

	public ArrayList<Objets> getListeObjet() {
		return listeObjet;
	}

	public ArrayList<Lieux> getLieuxVoisin() {
		return lieuxVoisin;
	}
        public static void addController(Controller c){
            Lieux.cont = c;
        }

	/**
	 * 
	 * @param id
	 * @param nom
	 * @param desc
	 */
	public Lieux(int id, String nom, String desc) {
		this.id = id;
		this.nom = nom;
		this.description = desc;
	}

	public String getNom() {
		return this.nom;
	}

	public String getDescription() {
		return this.description;
	}
	public int getId() { return this.id;	}


	/**
	 * 
	 * @param perso
	 */
	public void addPerso(Personnages perso) {
		this.listePerso.add( perso );
	}

	/**
	 * 
	 * @param obj
	 */
	public void addObj(Objets obj) {
		this.listeObjet.add( obj );
	}

	/**
	 * 
	 * @param lieu
	 */
	public void addVoisin(Lieux lieu) {
		this.lieuxVoisin.add( lieu );
	}

	/**
	 * 
	 * @param pos
	 */
	public void remPerso(int pos) {
		this.listePerso.remove( pos );
	}

	/**
	 * 
	 * @param pos
	 */
	public void remObjet(int pos) {
		this.listeObjet.remove( pos );
	}

	/**
	 * 
	 * @param pos
	 */
	public void remLieu(int pos) {
		this.lieuxVoisin.remove( pos );
	}

	public void affiche() {
		this.cont.showString(this.getDescription()+"\n");
	}


	/**
	 * 
	 * @param pos
	 */
	public Objets getObjet(int pos) {
		return this.listeObjet.get( pos );
	}

	public  int nbObjet(){
		return listeObjet.size();
	}

	/**
	 * 
	 * @param pos
	 */
	public Personnages getPersonnage(int pos) {
		return this.listePerso.get( pos );
	}

}