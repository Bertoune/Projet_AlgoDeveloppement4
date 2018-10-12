package projectClass;
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
	
	  public void pointPendu(int nbErreur){
		 int nbpoint=0;
		  int pointMarque;
		  switch (nbErreur){
		  
		      case 0:
		          nbpoint += 100;
		          pointMarque = 100;
		          break;
		
		      case 1:
		    	  nbpoint += 50;
		    	  pointMarque = 50;
		          break;
		
		      case 2:
		    	  nbpoint += 35;
		    	  pointMarque = 35;
		          break;
		
		      case 3:
		    	  nbpoint += 25;
		    	  pointMarque = 25;
		          break;
		
		      case 4:
		    	  nbpoint += 15;
		    	  pointMarque = 15;
		          break;
		
		      case 5:
		    	  nbpoint += 10;
		    	  pointMarque = 10;
		          break;
		
		      case 6:
		    	  nbpoint += 5;
		    	  pointMarque = 5;
		          break;
		
		      default:
		    	  nbpoint += 0;

	      }

	  }

}