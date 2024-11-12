package pack1;
import java.util.*;



public class Test {
public static void main(String []args) {

	List<Personne> personnes = new ArrayList <Personne>();
	List<Stage> stages = new ArrayList <Stage>();
	

	Date.setJour(1);
	Date.setMois(8);
	Date.setAnnee(1998);
	
	Date date1= new Date(Date.getJour(),Date.getMois(),Date.getAnnee());

	
	Adresse.setLigne1("ligne1");
	Adresse.setLigne2("ligne2");
	Adresse.setVille("ville");
	Adresse.setCodePostal("code");
	Adresse.setPays("pays");
	
	Adresse a1=new Adresse(Adresse.getLigne1(),Adresse.getLigne2(),Adresse.getVille(),Adresse.getCodePostal(),Adresse.getPays());
	
	Etudiant etd1=new Etudiant ("Nom1","Prenom1",date1,a1,"2019/2020","TC3A","3eme annee");
	System.out.println("etd1:");
	System.out.println(etd1.toString());
	
	personnes.add(etd1);
	
	Date.setJour(9);
	Date.setMois(7);
	Date.setAnnee(2000);
	
	Date date2= new Date(Date.getJour(),Date.getMois(),Date.getAnnee());
	
	
	Adresse.setLigne1("ligne1");
	Adresse.setLigne2("ligne2");
	Adresse.setVille("ville");
	Adresse.setCodePostal("code");
	Adresse.setPays("pays");
	
	Adresse a2=new Adresse(Adresse.getLigne1(),Adresse.getLigne2(),Adresse.getVille(),Adresse.getCodePostal(),Adresse.getPays());
	
	Etudiant etd2=new Etudiant ("Nom2","Prenom2",date2,a2,"2019/2020","TC3A","3eme annee");
	System.out.println("etd2:");
	System.out.println(etd2.toString());
	personnes.add(etd2);
	
	Date.setJour(6);
	Date.setMois(11);
	Date.setAnnee(1999);
	
	Date date3= new Date(Date.getJour(),Date.getMois(),Date.getAnnee());
	
	
	Adresse.setLigne1("ligne1");
	Adresse.setLigne2("ligne2");
	Adresse.setVille("ville");
	Adresse.setCodePostal("code");
	Adresse.setPays("pays");
	
	Adresse a3=new Adresse(Adresse.getLigne1(),Adresse.getLigne2(),Adresse.getVille(),Adresse.getCodePostal(),Adresse.getPays());
	
	Etudiant etd3=new Etudiant ("Nom3","Prenom3",date3,a3,"2019/2020","TC3A","3eme annee");
	System.out.println("etd3:");
	System.out.println(etd3.toString());
	personnes.add(etd3);
	
	Date.setJour(2);
	Date.setMois(8);
	Date.setAnnee(1960);
	
	Date date4= new Date(Date.getJour(),Date.getMois(),Date.getAnnee());
	
	
	Adresse.setLigne1("ligne1");
	Adresse.setLigne2("ligne2");
	Adresse.setVille("ville");
	Adresse.setCodePostal("code");
	Adresse.setPays("pays");
	
	Adresse a4=new Adresse(Adresse.getLigne1(),Adresse.getLigne2(),Adresse.getVille(),Adresse.getCodePostal(),Adresse.getPays());
	
	Etudiant etd4=new Etudiant ("Nom4","Prenom4",date4,a4,"2019/2020","TC3A","3eme annee");
	System.out.println("etd4:");
	System.out.println(etd4.toString());
	personnes.add(etd4);
	
	Date.setJour(4);
	Date.setMois(5);
	Date.setAnnee(1920);
	
	Date de1= new Date(Date.getJour(),Date.getMois(),Date.getAnnee());
	StagePfa.setTitre("titre1");
	StagePfa.setSujet("sujet1");
	StagePfa.setDescription("description1");
		
	Adresse.setLigne1("ligne11");
	Adresse.setLigne2("ligne22");
	Adresse.setVille("ville1");
	Adresse.setCodePostal("code23");
	Adresse.setPays("pays52");
	
	Adresse ae1=new Adresse(Adresse.getLigne1(),Adresse.getLigne2(),Adresse.getVille(),Adresse.getCodePostal(),Adresse.getPays());
	
	Encadrant ec1 =new Encadrant("NomEncadrant1","PrenomEncadrant1",de1,ae1);
	System.out.println("encadrant1:");
	System.out.println(ec1.toString());
	personnes.add(ec1);
	
	Date.setJour(4);
	Date.setMois(5);
	Date.setAnnee(1910);
	
	Date de2= new Date(Date.getJour(),Date.getMois(),Date.getAnnee());
	StagePfe.setTitre("titre2");
	StagePfe.setSujet("sujet2");
	StagePfe.setDescription("description2");
		
	Adresse.setLigne1("ligne11");
	Adresse.setLigne2("ligne22");
	Adresse.setVille("ville1");
	Adresse.setCodePostal("code23");
	Adresse.setPays("pays52");
	
	Adresse ae2=new Adresse(Adresse.getLigne1(),Adresse.getLigne2(),Adresse.getVille(),Adresse.getCodePostal(),Adresse.getPays());
	
	Encadrant ec2 =new Encadrant("NomEncadrant2","PrenomEncadrant2",de2,ae2);
	System.out.println("encadrant2:");
	System.out.println(ec2.toString());
	personnes.add(ec2);
	
	//Stage pfa pfe des etudiamts:
	
	
	Stage[] stagesEtd = new Stage[4];
	
	for(int i=0;i<stagesEtd.length;i++) {
		
	stagesEtd[i]=new StagePfa("titreA"+(i+1),"sujetA"+(i+1), "descriptionA"+(i+1));
	System.out.println("stage Pfa de l'etd "+(i+1));
	stages.add(stagesEtd[i]);
	System.out.println(stages.get(i));
	
		stagesEtd[i]=new StagePfe("titreE"+(i+1),"sujetE"+(i+1), "descriptionE"+(i+1));
		System.out.println("stage Pfe de l'etd "+(i+1));
		stages.add(stagesEtd[i]);
		System.out.println(stages.get(i));

	}


System.out.println("\nliste des personnes: \n ");
for(Personne item :personnes)
	
	System.out.println(item);


System.out.println("nombre d'encadrants: "+ec2.getNombreDePersonne());
System.out.println("nombre d'etudiants: "+etd4.getNombreDePersonne());

StagePfa pfa1 = new StagePfa("tA1","sA1", "da1");
StagePfe pfe1 = new StagePfe("titreE2","sujetE2", "descriptionE2");

System.out.println("Coefficient du stage pfa: "+pfa1.getCoefficient()+"\n");
System.out.println("Coefficient du stage pfe: "+pfe1.getCoefficient()+"\n");



etd1.validation(pfe1, pfa1);
}
}

