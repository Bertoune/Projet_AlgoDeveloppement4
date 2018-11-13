import java.io.FileNotFoundException;

public class comparerMot {
	public static boolean egalité(String m1p, String m2p) {
		

		if (m1p.equals(m2p)) 
		{
			return true;
		}
		else return false;
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "comparerMot []";
	}




	public static String bonnePlace(String m1p, String m2p)
	{
		
		char m1[];
		m1 = m1p.toCharArray();
		
		char m2[];
		m2 = m2p.toCharArray();
		
		char m3[]= new char[7];
		char m4[]= m2;
		
		
		if (egalité(m1p,m2p)==false)
		{
			for(int i=0; i< m1.length; i++)
			{
				if (m1[i] == m2[i])
				{
					m3[i] = m2[i] ;
					m4[i] = '@' ;
				}
			}
		}
		for (int x=0; x<m3.length; x++)
		{
			System.out.println(m3[x]);
			// a affiche en rouge car les lettres sont bien placés
		}
		
		return m4.toString();
	}





	public static void mauvaisePlace(String m1p, String m4p)
	{
		char m1[];
		m1 = m1p.toCharArray();
		
		char m4[];
		m4 = m4p.toCharArray();
				
		
	
		int i=0;
		
		while (i!=6)
		{
			for(int j=0; j<m1.length; j++)
			{
				if (m1[i] == m4[j] && i!=j)
				{
					System.out.println(m4[j]);
				}
				
				if(j == m4.length - 1)
				{
					i++;
				}
			}		
			
		}
		
		
	}
	
	public static void verifieMots(String m1p, String m2p) throws FileNotFoundException // m1p est un mot de 7lettres generes aleatoirement
	{ //m2p est le mot que l'utilisateur saisit.
		
		
		char m1[];
		m1 = m1p.toCharArray();
		
		char m2[];
		m2 = m2p.toCharArray();
		
		char m3[]= new char[6];
	
				bonnePlace(m1p, m2p);
				mauvaisePlace(m1p, m2p);
		}
		
	
}
