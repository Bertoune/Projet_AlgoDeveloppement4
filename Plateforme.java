package packageClasse;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Plateforme {
	private List<Jeux> lesJeux;
	private List<Joueur> lesJoueurs;
	private Map<Joueur,Integer>classementJoueur;
	public Plateforme() {
	}
	protected boolean ajouterJoueur(Joueur j)
	{
		return false;
	}
	public void afficherClassement()
	{
		
	}
	public boolean jouer()
	{
		return true;
	}
	
}
