import java.io.File; 
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader; 

public class motDuDictionnaire {

	// on va chercher le chemin du fichier "Dictionnaire.txt" afin d'analyser si le mot saisit par l'utilsateur est bien present
	
	public boolean rechercherMot() throws IOException {
		
	motDuDictionnaire mot= new motDuDictionnaire(); // saisir
		
	File f = new File("C:/flux.txt"); 

	String line = null;

	while ((line = reader.readLine()) != null) 
		{ 
			if (line.contains(mot)) 
				{ 
					return true;
				} 
			else return false;
		} 
	} 
	
}