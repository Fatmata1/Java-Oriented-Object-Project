package pack1;


public abstract class Personne {
	protected String nom;
	protected String prenom;
	protected Date dateDeNaissance;
	protected Adresse adresse;
	protected int identifiant;
	
	public Personne(String nom,String prenom,Date dateDeNaissance,Adresse adresse) {
		this.nom=nom;
		this.prenom=prenom;
		this.dateDeNaissance=dateDeNaissance;
		this.adresse=adresse;
	}
	
	
	
	public void setAdresse(Adresse adresse) {
		this.adresse=adresse;
	}
	public Adresse getAdresse() {
		return adresse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public abstract int getNombreDePersonne();
	
	
}
