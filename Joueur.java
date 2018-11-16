package packageClasse;
import java.util.Comparator;
import java.util.Scanner;

public class Joueur implements Comparable<Joueur>/*,Comparator<Joueur>*/{
	public String unPseudo;
	public int nbpoints;
	public Joueur(String _unPseudo)
	{
		this.unPseudo=_unPseudo;
		this.nbpoints=0;
	}
	/*public boolean equals(Object other)
	{
		return (other instanceof Joueur)&&((Joueur)other)
				.unPseudo.equals(this.unPseudo);
		
	}*/
	/*public Joueur()
	{
		Scanner sc= new Scanner(System.in);
		String unPseudo =sc.nextLine();
		this.unPseudo=unPseudo;
		this.nbpoints=0;
	}*/
	
	
	/*public Joueur creeJoueur(String pseudo)
		{	
			Scanner sc = new Scanner(System.in);
			System.out.println("Veuillez saisir un mot :");
			String pseudoJoueur = sc.nextLine();
			Joueur j1= new Joueur(pseudoJoueur);
			return j1;
			
		}*/
	
	
	  public void calculePoint(int nbErreur){
		 //int nbpoints=0;
		
		  switch (nbErreur){
		  
		      case 0:
		          nbpoints += 100;
		          //pointMarque = 100;
		          break;
		
		      case 1:
		    	  nbpoints+= 50;
		    	  //pointMarque = 50;
		          break;
		
		      case 2:
		    	  nbpoints += 35;
		    	  //pointMarque = 35;
		          break;
		
		      case 3:
		    	  nbpoints += 25;
		    	  //pointMarque = 25;
		          break;
		
		      case 4:
		    	  nbpoints += 15;
		    	  //pointMarque = 15;
		          break;
		
		      case 5:
		    	  nbpoints += 10;
		    	  //pointMarque = 10;
		          break;
		
		      case 6:
		    	  nbpoints += 5;
		    	  //pointMarque = 5;
		          break;
		
		      default:
		    	  nbpoints += 0;

	      }
		  
	  }

	  public String toString()
	  {
		return unPseudo +":"+ nbpoints ;
		  
	  }
	 @Override
	public int compareTo(Joueur other) {
		// TODO Auto-generated method stub
		 int retoure =0;
		 if(nbpoints==0)retoure=-1;
		 	else retoure= nbpoints-other.nbpoints;
		 return retoure;
		
	}
	 
	 public int ajoutPoint(int nbErreur)
	 {
		 
		 return this.nbpoints;
	 }
	public boolean  equals(Joueur other)
	{
		if(this.unPseudo.equals(other.unPseudo))return true;
		else
		return false;
		
	}
	public static Comparator<Joueur>comparatorPoints=new Comparator<Joueur>() {

		@Override
		public int compare(Joueur joueur1, Joueur joueur2) {
			// TODO Auto-generated method stub
			return (int)(joueur1.nbpoints-joueur2.nbpoints);
		}};

	/*	@Override
		public int compare(Joueur o1, Joueur o2) {
			// TODO Auto-generated method stub
			return 0;
				}*/
		
}
	