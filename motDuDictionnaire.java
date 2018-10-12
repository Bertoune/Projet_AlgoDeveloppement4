import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader; 

public class motDuDictionnaire {

	// on va chercher le chemin du fichier "Dictionnaire.txt" afin d'analyser si le mot saisit par l'utilsateur est bien present
	
	public static boolean appartientMot(String unMot) throws FileNotFoundException {
		
		File f = new File("Dictionnaire.txt");
		FileReader fr = new FileReader (f);
		// BufferedReader permet de lire ligne par ligne un fichier
		// c'est utile car ici 1 mot = 1 ligne
		
		BufferedReader br = new BufferedReader (fr);
		
		
		try 
		{
		String line = br.readLine();
		
		while (line!= null)
		{
			//Tant que le fichier n'est pas parcouru
		
			// c'est a dire tant qu'il y a des mots
			
			if (line.equals(unMot))
				{
					
					line= null;
					return true;
				}
			
			line=br.readLine();
			
				
		}
		
	
		
		br.close();
		fr.close();
	}
		 catch (IOException exception)
		    {
		        System.out.println ("Erreur lors de la lecture : " + exception.getMessage());
		    }
		return false;
	}
	
	/*** public static void main(String []args) throws FileNotFoundException
	{
		String mot="TAMERE";
		if (appartientMot(mot))
		{
			System.out.println("Trouve");
		}
		else System.out.println("Nope");
	}
	**/
}
