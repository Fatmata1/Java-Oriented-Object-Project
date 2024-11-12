package pack1;

public class Date {
	private static int jour;
	private static int mois;
	private static int annee;
public Date(int jour,int mois,int annee) {
	Date.jour=jour;
	Date.mois=mois;
	Date.annee=annee;
}
public static int getJour() {
	return jour;
}
public static void setJour(int jour) {
	Date.jour = jour;
}
public static int getMois() {
	return mois;
}
public static void setMois(int mois) {
	Date.mois = mois;
}
public static int getAnnee() {
	return annee;
}
public static void setAnnee(int annee) {
	Date.annee = annee;
}
public String toString() {
	return jour+" /"+mois+"/"+annee;
}
}
