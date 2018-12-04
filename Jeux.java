package model.projet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Jeux /*implements Comparator<Joueur>*/{
	protected String regle;
	protected GenererGrille grille;
	List <Joueur> lesJoueurs;
	
	enum TypeJeux{PENDU,MOTUS,SUDOKU,MOT_MELEE};
	public Jeux(int ligne, int colonne,String _regle) {
		
		//this.joueur=new Joueur(_nom);
		this.regle=_regle;
		this.lesJoueurs=new ArrayList<Joueur>();
		this.grille=new GenererGrille(colonne,ligne);
		}
	public boolean ajouterJoueur(Joueur joueur)
	{
		for(Joueur j:lesJoueurs)
			{
				if(j.equals(joueur)==true) 
				{
					System.out.println("pseudo existe déjà");
					return false;
					
				}
				
			}
			lesJoueurs.add(joueur);
			System.out.println("Ajout avec succès");
			return true;
			
		}
	void afficherJoueur()
	{
		
		for(Joueur j:lesJoueurs)
		{
			System.out.println(j.toString());
		}
		
	}
	public boolean poseJeux(Jeux monjeux, Joueur joueur) 
	{
		return true;
	}
	public boolean reprendreJeux(Jeux monJeux, Joueur joueur)
	{
		return true;
	}
	/*public static Comparator<Joueur> joueurComparator=new Comparator<Joueur>(){
			@Override
			public int compare(Joueur j1, Joueur j2) {
				// TODO Auto-generated method stub
				return (int)j1.compareTo(j2);
		} 
		
			};*/
	//code permet de classer les classement des joueur
	
	public List<Joueur> classementJoueur()
	{
		Iterator<Joueur> iter=lesJoueurs.iterator();
		Collections.sort(lesJoueurs);
		Collections.reverse(lesJoueurs);
		return lesJoueurs;
		
	}
}
