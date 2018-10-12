import java.util.Scanner;

public class Joueur {
	public String unPseudo;
	public int nbpoints;
	
	public Joueur(String UnPseudo)
	{
		this.unPseudo=UnPseudo;
		this.nbpoints=0;
	}
	
	
	public Joueur creeJoueur(String pseudo)
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir un mot :");
			String pseudoJoueur = sc.nextLine();
			Joueur j1= new Joueur(pseudoJoueur);
			return j1;
			
		}

}
