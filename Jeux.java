package packageClasse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
public class Jeux /*implements Comparator<Joueur>*/{
	protected String regle;
	protected GenererGrille grille;
	List <Joueur> lesJoueur=new ArrayList<Joueur>();
	
	enum TypeJeux{PENDU,MOTUS,SUDOKU,MOT_MELEE};
	public Jeux(int ligne, int colonne,String _regle) {
		//this.joueur=new Joueur(_nom);
		this.grille=new GenererGrille(colonne,ligne);
		}
	Iterator<Joueur> itJoueur =lesJoueur.iterator();
	public boolean ajouterJoueur(Joueur joueur)
	{
		for(Joueur j:lesJoueur)
			{
				if(j.equals(joueur)==true) 
				{
					System.out.println("pseudo existe déjà");
					return false;
					
				}
				
			}
			lesJoueur.add(joueur);
			System.out.println("Ajout avec succès");
			return true;
			
		}
		
	
				
		void afficherJoueur()
		{
			
			for(Joueur j:lesJoueur)
			{
				System.out.println(j.toString());
			}
			
		}
	
		public List<Joueur> classerLesJoueur()
		{
						return lesJoueur;
			
		}
		public void afficherGrilleJeux()
		{
			grille.afficheGrille();
		}
		public boolean jouer()
		{
			return true;
		}
		public boolean annulerJeux(Grille g)
		{
			return true;
		}
		public boolean poseJeux(Jeux monjeux, Joueur joueur) 
		{
			return true;
		}
		public boolean reprendreJeux(Jeux monJeux, Joueur joueur)
		{
			return true;
		}

		public static Comparator<Joueur> ComparatorPoints= new Comparator<Joueur>() {

			@Override
			public int compare(Joueur o1, Joueur o2) {
				// TODO Auto-generated method stub
				o1.compareTo(o2);
				return 0;
			}};
		void classerJoueur() {
			
			Collections.sort(lesJoueur, ComparatorPoints);
		}
			
		
}