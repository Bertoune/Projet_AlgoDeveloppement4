package packageClasse;

public class GenererGrille {
	int ligne;
	int colonne;
	Object[][] grille;
	public GenererGrille(int c,int l)
	{
		this.colonne=c;
		this.ligne=l;
		grille=new Object[l][l];
	}
	public GenererGrille()
	{
		colonne=9;
		ligne =9;
		grille=new Object[9][9];
	}
	public boolean initialiserGrille()
	{
		for(int i=0;i<ligne;i++)
			for(int j=0;j<colonne;j++)
				grille[i][j]=null;
		return true;
	}
	public void afficheGrille()
	{
		for(int i=0;i<ligne;i++) {
			for(int j=0; j<colonne;j++) {
				System.out.println("grille["+ i +"]"+ "["+ j+"] :"+ grille[i][j]);
			}
			System.out.println("\n");
		}

	}
}
