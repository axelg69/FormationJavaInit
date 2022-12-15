package Bases;

public class Operateurs {

	public static void main(String[] args) {
		
		//opérateurs arithmétiques: + - * / %(Modulo reste de la division entière)
		int i = 10, j = 25;
		int somme = i + j;
		int soustraction = i - j;
		int multiplication = i *j;
		int modulo = j % i; // 5
		
		System.out.println("Modulo = "+modulo);
		
		//Opérateurs d'incrémentation et de décrémentation
		int r = 10, r2 = 15;
		
		int z = 5;
		z++;
		System.out.println("z = "+z);
		
		System.out.println("Pré incrémentation:"+ ++r); //11
		System.out.println("Post incrémentation:"+ r2++); //15
		
		System.out.println("r2 = "+r2);
		
		System.out.println(++r + r2++); //26
		
		System.out.println(r2++); // 15 --- post incrémentation: utilisation de r2 puis son incrémentation
		System.out.println(++r); // r++ => r = r + 1; -- pré incrémentation: incrémentation de r puis son utilisation
		
		--r;
		r2--;
		
		//Opérateurs combinés:
		r += 5; // r = r + 5
		r -= 2;
		r *= 3;
		r /= 2;
		
		//Opérateurs de comparaison: > >= < <= == (égalité) != (différent)
		boolean b = (r > r2);
		
		//Opérateurs logiques: && (et logique) - || (ou logique) - ^(ou exclusif) - ! (non logique)
		/*
		 * Table logique:
		 * 
		 * A	B	A&&B	A||B	A^B
		 * v	v	 v		 v		 f
		 * v	f	 f		 v		 v
		 * f	f	 f		 f		 f
		 * f    v    f		 v		 v			
		 * 
		 * 
		 */
		
		int x = 10, y = 15;
		System.out.println((x == y) || (x < y)); //true
		System.out.println(!((x == y) || (x < y))); //false
		System.out.println(!(x < y)); //false
		
		

	}

}
