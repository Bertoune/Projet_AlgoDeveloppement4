package projectClass;
import java.util.Scanner;
import java.util.*;



public class Pendu extends Jeux {
	
	private String word = "", secretWord = ""; // déclaration d'un mot et d'un mot secret
	private char[] tabChar; // déclaration d'un tableau de char
	public int nbvies; // déclaration d'une variable pour le nombre de vie restante
	public int nbcoup; // déclaration d'une variable pour le nombre de coup joué 
	
	

	public Pendu(String nom, String regle, int score, int nbvies, int nbcoup) {
		super( nom, regle, score);
		// Déclaration d'un constructeur avec les variable hérités et des variable propres au pendu 
		nom="Pendu"; // affectation des variables 
		regle="Vous avez 7 vies pour trouver le mot caché, pour cela vous devez donner une lettre si cette "
				+ "lettre est dans le mot on l'affiche sinon vous perdez une vie .";
		score=0;
		nbvies=7;
		nbcoup=0;
	}
	
	public void afficherLaRegle() {
		System.out.println(regle);// méthode permantant l'affichage de la règle du pendu 
	}
	
	
	
	public int jouerunCoup (int nbvies) { // déclaration d'une méthode permettant de jouer un coup 
	    int resulttest = 0 ; // variable stockant le résultat du test si la lettre et present dans le mot secret
	    
		if (nbvies > 0) { // test sur le nombres de vie restante du joueur
		String mot = "test";
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une lettre");
		String lettre = sc.nextLine();
		System.out.println("Vous avez saisi" + lettre); // lecture puis affichage de la lettre choisie par l'utilisateur 
		
		char c[] = lettre.toCharArray() ; // on transforme le string en char pour pouvoir appeler la fonction suivante 
		
		char lettrefini = c[0]; 
		resulttest = verifiermot (lettrefini); // appel a la fonction permettant la vérification de la lettre 
		if (resulttest == 1) {
			nbcoup++; // si la lettre est dans le mot alors on ajoute un coup au compteurs
		}
		else 
		{
			nbcoup++; // sinon on ajoute un coup on compteur 
			nbvies--;// et on retire une vie 
		}
		
		return nbvies; // on retourne le nombre de vie
		}
		return nbvies;// on retourne le nombre de vies
	  }	
	
public int verifiermot(char c){ // methode permettant de verifier le mot
		
		boolean testlettre = false; // déclaration d'un booleen pour savoir si la lettre est presente dans le mot 
		
		for(int i = 0; i < this.word.length(); i++){ // on fait une boucle qui parcours le mot 
			
			if(this.word.toUpperCase().charAt(i) == c){ // passage de la lettre i en majuscule et comparaison et avec la lettre en entrée
				this.tabChar[i] = c; // alors dans le tableau de char a l'indice i on met la lettre en parametre 
				testlettre = true; // le test passe alors a vrai 
			}
		}
		++this.nbcoup; // on incremente le compteur de coup
		this.secretWord = new String(this.tabChar); // on crée un nouveau tableau de char pour y rangé le mot secret 
		System.out.println("Mot secret = " + this.word); // on affiche l'avancement du mot secret ! 
		return (testlettre == true) ? 1 : -1; // si le booleen est a true on renvoie 1 sinon -1 
	}
	
}
