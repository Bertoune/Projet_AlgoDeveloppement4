
public class Bidule {
	
public String nom;
public int val;

public int instance;
int num = 0;

Bidule() {
	nom=new String();
	num = ++instance;  
	}

Bidule(String _nom, int _val) {
	   nom = _nom;
	   val = _val;
	   num = ++instance;
	 }

@Override
public String toString() {
	return "Bidule [nom=" + nom + ", val=" + val + ", num=" + num + ", instance=" + instance + "]";
}

@Override
public void finalize() {
  System.out.println("fin de " + this);
}

public boolean equals(Object o) {
	   boolean result = false;
	   if(o instanceof Bidule) {
	     Bidule autre = (Bidule)o;
	      result = result && (this.nom.equals(autre.nom));
	   }
	   return result;
	 }
}
