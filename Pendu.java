package projectClass;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;



public class Pendu extends Jeux {	
	
	private String word = "", secretWord = ""; // d�claration d'un mot et d'un mot secret
	private char[] tabChar; // d�claration d'un tableau de char
	public int nbvies; // d�claration d'une variable pour le nombre de vie restante
	public int nbcoup; // d�claration d'une variable pour le nombre de coup jou� 
	
	

	public Pendu(String nom, String regle, int score, int nbvies, int nbcoup) {
		super( nom, regle, score);
		// D�claration d'un constructeur avec les variable h�rit�s et des variable propres au pendu 
		nom="Pendu"; // affectation des variables 
		regle="Vous avez 7 vies pour trouver le mot cach�, pour cela vous devez donner une lettre si cette "
				+ "lettre est dans le mot on l'affiche sinon vous perdez une vie .";
		score=0;
		nbvies=7;
		nbcoup=0;
	}
	
	public void afficherLaRegle() {
		System.out.println(regle);// m�thode permantant l'affichage de la r�gle du pendu 
	}
	

	
	public void initmot() {// procedure pour d�finir le mot secret 
		
		int i = (int)(Math.random()*100000); // d�claration d'une variable i permettant de choisir le mot
		while (i > 369086) {
			i = i/2; // si il le random est sup�rieur au nombre de mots dans le dictionnaire on le divise par 2
		}
		
		try {// bloc try / catch pour �viter le plantage du programme 
			LineNumberReader motligne = new LineNumberReader(new FileReader(new File("C:\\Users\\PC\\git\\repository3\\projetjeux\\Dictionnaire.txt")));
			// d�finition d'une variable motligne contenant la lecture du mot a la ligne indiqu� 
			int carac; 
			this.word="";
			this.secretWord=""; // on pr�cise qu'on utilise les variables de classe .
			while((carac = motligne.read()) != -1){ //tant que la la ligne lue est diff�rente de -1
				if(motligne.getLineNumber() == (i+1)) // Si le num ligne de la ligne est �gal a i+1
					break;// on arrete 
				else {// sinon 
					if(motligne.getLineNumber() == i){// si le num�ro de la ligne est �gal a i
						this.word += (char)carac;		// on affecte a la variable mot ce dernier 
				}
			}
		}
			this.word = this.word.trim().toUpperCase(); // on passe une copie du mot en majuscule et on l'affecte a word 
			
			for(int j = 0; j < this.word.length(); j++) //pour j allant de 0 a la taille du mot -1 (< que la tailledu mot)
			{
				this.secretWord += (this.word.charAt(j) != '\'' && this.word.charAt(j) != '-') ? "*" : this.word.charAt(j); // on r�gle le motsecret en fonction du mot 
			}
			motligne.close(); // on ferme le flux du fichier 
			this.nbcoup = 0;// on met le nombre de coup a 0
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Erreur de chargement depuis le fichier de mots !", "ERREUR", JOptionPane.ERROR_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Erreur de chargement depuis le fichier de mots !", "ERREUR", JOptionPane.ERROR_MESSAGE);
		}// en cas d'erreur on affiche un message d'erreur
		
		this.tabChar = this.secretWord.toCharArray(); // on r�gle le tableau de l'utilisateur en fonction du mot secret 
		
	}
	
	
	
	public int jouerunCoup (int nbvies) { // d�claration d'une m�thode permettant de jouer un coup 
	    int resulttest = 0 ; // variable stockant le r�sultat du test si la lettre et present dans le mot secret
	    
		if (nbvies > 0) { // test sur le nombres de vie restante du joueur
		String mot = "test";
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrez une lettre");
		String lettre = sc.nextLine();
		System.out.println("Vous avez saisi" + lettre); // lecture puis affichage de la lettre choisie par l'utilisateur 
		
		char c[] = lettre.toCharArray() ; // on transforme le string en char pour pouvoir appeler la fonction suivante 
		
		char lettrefini = c[0]; 
		resulttest = verifiermot (lettrefini); // appel a la fonction permettant la v�rification de la lettre 
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
		
		boolean testlettre = false; // d�claration d'un booleen pour savoir si la lettre est presente dans le mot 
		
		for(int i = 0; i < this.word.length(); i++){ // on fait une boucle qui parcours le mot 
			
			if(this.word.toUpperCase().charAt(i) == c){ // passage de la lettre i en majuscule et comparaison et avec la lettre en entr�e
				this.tabChar[i] = c; // alors dans le tableau de char a l'indice i on met la lettre en parametre 
				testlettre = true; // le test passe alors a vrai 
			}
		}
		++this.nbcoup; // on incremente le compteur de coup
		this.secretWord = new String(this.tabChar); // on cr�e un nouveau tableau de char pour y rang� le mot secret 
		System.out.println("Mot secret = " + this.word); // on affiche l'avancement du mot secret ! 
		return (testlettre == true) ? 1 : -1; // si le booleen est a true on renvoie 1 sinon -1 
	}
	
}
