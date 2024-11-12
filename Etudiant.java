package pack1;

public class Etudiant extends Personne implements Validable{

	private static int nombredeEtudiant = 0;
	private String anneeScolaire, nomFiliere,anneEtude;
	private Stage[] stage;

	
	public Etudiant(String nom,String prenom,Date dateDeNaissance,Adresse adresse,String anneeScolaire,String nomFiliere,String anneEtude){
		super(nom,prenom,dateDeNaissance,adresse);
		this.anneeScolaire=anneeScolaire;
		this.nomFiliere=nomFiliere;
		this.anneEtude=anneEtude;
		nombredeEtudiant++;
		identifiant=nombredeEtudiant;
	}
	
	public int getNombreDePersonne() {
		return nombredeEtudiant;
	}

	public String getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

	public String getNomFiliere() {
		return nomFiliere;
	}

	public void setNomFiliere(String nomFiliere) {
		this.nomFiliere = nomFiliere;
	}

	public String getAnneEtude() {
		return anneEtude;
	}

	public void setAnneEtude(String anneEtude) {
		this.anneEtude = anneEtude;
	}

	public Stage[] getStage() {
		return stage;
	}

	public void setStage( Stage[] stage) {
		this.stage=stage;
	}

	
	public String toString() {
		return "Nom: "+nom+"\nprenom: "+prenom+"\ndate de naissance: "+dateDeNaissance+"\nadresse: "+adresse+"\nannee scolaire: "+anneeScolaire +" \nnom de Filiere: "+nomFiliere+"\n anne d'etude: "+anneEtude+" \nidentifiant: "+identifiant+"\n ";
	}

}
