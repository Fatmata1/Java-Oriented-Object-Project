package pack1;

public interface Validable {
	default void validation(StagePfe pe,StagePfa pa)
	{
	if( pe ==null || pa==null)
		System.out.println("l'etudiant n'a pas valider son projet");
	else if( pe !=null & pa!=null )
		System.out.println("l'etudiant a valider son projet");
		
}
}
