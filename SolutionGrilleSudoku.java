
public class SolutionGrilleSudoku {

	int grille [][];
	int taille;
	
	public boolean estDansLaLigne (int val, int ligne)
	{
		for(int colonne=0; colonne < taille; colonne++)
		{
			if (grille [colonne][ligne] == val)
			{
				return false;
			}
		}
		return true;
	}
	
	public boolean estDansLaColonne (int val, int colonne)
	{
		for(int ligne=0; ligne <taille; ligne ++)
		{
			if (grille[colonne][ligne] == val)
			{
				return false;
			}
		}
		return true;
	}
	
	/*** A FAIRE ***/
	
	public boolean estDansLeCarre (int val, int ligne, int colonne)
	{
		return false;
	}

}
