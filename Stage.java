package pack1;

public abstract class Stage {
	protected int numeroDeStage;
	private static String titre;
	private static String sujet;
	private static String description;
	public Stage(String titre,String sujet,String description) {
		Stage.titre=titre;
		Stage.sujet=sujet;
		Stage.description=description;
	}
	public static String getTitre() {
		return titre;
	}
	public static void setTitre(String titre) {
		Stage.titre=titre;
	}
	public static String getSujet() {
		return sujet;
	}
	public static void setSujet(String sujet) {
		Stage.sujet=sujet;
	}
	public static String getDescription() {
		return description;
	}
	public static void setDescription(String description) {
		Stage.description=description;
	}
		
	public abstract float getCoefficient();
	
	public String toString() {
		return titre+"\n"+sujet+"\n"+description+" \n numeroDeStage:"+numeroDeStage+" \n";
	}
}
