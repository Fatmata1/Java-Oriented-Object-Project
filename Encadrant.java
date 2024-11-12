package pack1;

import java.util.*;

public class Encadrant extends Personne {

	private static int nombredEncadrant = 0;
	private List<Stage> stage;


	public Encadrant(String nom,String prenom,Date dateDeNaissance,Adresse adresse) {
		super( nom,prenom,dateDeNaissance,adresse);
		this.stage = new ArrayList<Stage>();
		nombredEncadrant++;
		identifiant=nombredEncadrant;
	}
	public List<Stage> getStage(){
		return stage;
	}
	public int getNombreDePersonne() {
		return nombredEncadrant;
	}
	public void setStage(List<Stage> stage) {
		this.stage=stage;
	}
	public String toString() {
		return "Nom: "+nom+"\nPrenom: "+prenom+"\nDate de naissance: "+dateDeNaissance+"\nAdresse: "+adresse+"\nNumero d'encadrant: "+identifiant+"\n";
	}
}
