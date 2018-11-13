import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader; 


public class unMain {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		String m1="bonjogr";
		m1 = m1.toUpperCase(); // permet de convertir le mot en majuscules, car il compare avec les mots du dictionnaire, qui sont en majuscules.
		String m2="Boogies";
		m2 = m2.toUpperCase();
		if (motDuDictionnaire.appartientMot(m2))
			
			{
				System.out.println("Ok");
			}
		
		comparerMot.mauvaisePlace(m1, comparerMot.bonnePlace(m1, m2));
		
	}
}
