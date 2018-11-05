package projectClass;
import java.util.Scanner;
import java.util.*;



public class Pendu extends Jeux {
	
	public int nbvies;
	

	public Pendu(String nom, String regle, int score, int nbvies) {
		super( nom, regle, score);
		// TODO Auto-generated constructor stub
		nom="Pendu";
		regle="Vous avez 7 vies pour trouver le mot caché, pour cela vous devez donner une lettre si cette "
				+ "lettre est dans le mot on l'affiche sinon vous perdez une vie .";
		score=0;
		nbvies=7;
		
	}
	
	public void afficherLaRegle() {
		System.out.println(regle);
	}
	
	public int jouerunCoup (int nbvies) {
		
		if (nbvies > 0) {
		String mot = "test";
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une lettre");
		String lettre = sc.nextLine();
		System.out.println("Vous avez saisi" + lettre);
		
		return nbvies;
		}
		return nbvies;
	  }	

}
