package pack1;
public class StagePfe extends Stage{
	
	private static int nombreDeStagePfe=0;
	private float coefficient=0.75f;
	
String titre, sujet, description;
	public StagePfe(String titre, String sujet, String description) {
		super(titre, sujet, description);
		nombreDeStagePfe++;
		numeroDeStage=nombreDeStagePfe;
	}
	public int getNombreDeStagePfe() {
		return nombreDeStagePfe;
	}
	public void setNombreDeStagePfe(int nombreDeStagePfe) {
		StagePfe.nombreDeStagePfe=nombreDeStagePfe;
	}
	public float getCoefficient() {
		return coefficient;
	}
	
}
