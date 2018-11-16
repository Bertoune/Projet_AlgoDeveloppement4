import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class genererMot {
	public static void xLettres(int x) throws FileNotFoundException
	{
		
		ArrayList xL = new ArrayList<String>();
		
		File f = new File("Dictionnaire.txt");
		FileReader fr = new FileReader (f);
		BufferedReader br = new BufferedReader (fr);
		
		
		try 
		{
			String line = br.readLine();
		
			while (line!= null)
				{
					if (line.length()== x)
						{
							
							xL.add(line);
							
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
		
		
		
		int i = (int)(Math.random()* 100000); 
		while (i > xL.size()) // le nombre de mots de neufs lettres 
		{
			i=i/2;
 		}
		
		System.out.println(xL.get(i));
	}
}
