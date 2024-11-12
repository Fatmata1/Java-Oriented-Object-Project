package pack1;
public class StagePfa extends Stage{
	private float coefficient=0.25f;
	private static int nombreDeStagePfa=0;
	
	
	public StagePfa(String titre, String sujet, String description) {
		super(titre, sujet,description);
		numeroDeStage=nombreDeStagePfa++;
		numeroDeStage=nombreDeStagePfa;
	}
	public int getNombreDeStagePfa() {
		return nombreDeStagePfa;
	}
	public void setNombreDeStagePfa(int nombreDeStagePfa) {
		StagePfa.nombreDeStagePfa=nombreDeStagePfa;
	}
	
	public float getCoefficient() {
		return coefficient;
	}
}
