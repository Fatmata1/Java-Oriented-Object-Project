package pack1;

public class Adresse {
private static String ligne1;
private static String ligne2;
private static String ville;
private static String codePostal;
private static String pays;

public Adresse(String ligne1,String ligne2,String ville,String codePostal,String pays) {
	Adresse.ligne1=ligne1;
	Adresse.ligne2=ligne2;
	Adresse.ville=ville;
	Adresse.codePostal=codePostal;
	Adresse.pays=pays;
}
public static String getLigne1() {
	return ligne1;
}
public static String getLigne2() {
	return ligne2;
}
public static String getVille() {
	return ville;
}
public static String getCodePostal() {
	return codePostal;
}
public static String getPays() {
	return pays;
}
public static void setLigne1(String ligne1) {
	Adresse.ligne1=ligne1;
}
public static void setLigne2(String ligne2) {
	Adresse.ligne2=ligne2;
}
public static void setVille(String ville) {
	Adresse.ville=ville;
}
public static void setCodePostal(String codePostal) {
	Adresse.codePostal=codePostal;
}
public static void setPays(String pays) {
	Adresse.pays=pays;
}
public String toString() {
	return "\nligne1: "+ligne1+"\nligne2: "+ligne2+"\nville: "+ville+"\ncode postal: "+codePostal+"\npays: "+pays;
}
}
