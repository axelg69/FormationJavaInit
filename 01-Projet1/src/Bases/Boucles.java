package Bases;

public class Boucles {

	public static void main(String[] args) {
		
		/*
		 * Boucles répetitives: For - Foreach
		 * For: on doit connaitre le nombre d'itérations
		 * Foreach: permet de faire un parcours complet d'une collection: tableau, liste......
		 * 
		 * Boucles conditionnelles:
		 * While (tant que la condition est vraie) - Do/While (tant que la condition est vraie)
		 * 
		 * Expressions conditionnelles:
		 * IF/ELSE - Switch - Opérateur ternaire
		 * 
		 * 
		 */
		
		System.out.println("***********IF/ELSE***********");
		int x = 0;
		if (x > 0) {
			System.out.println("x positif");
		}else if(x < 0) {
			System.out.println("x négatif");
		}else {
			System.out.println();
		}
		
		//Switch: une variante du if/else qui permet de remplacer les else if qui s'imbriquent
		int note = 18;
		switch (note) {
		case 0:
			System.out.println("nulle");
			break;
		case 10:
			System.out.println("Juste la moyenne");
		case 20:
			System.out.println("Excellent");
			break;
		default:
			System.out.println("Autre valeur non gérée dans les cases");
			break;
		}
		
		//Opérateur ternaire: (condition) ? valeur si condition vraie: valeur si condition fausse
		int m = 10, n = 20, max = 0;
		if(m > n) {
			max = m;
		}else {
			max = n;
		}
		
		max = (m > n)? m : n;
		
		//Boucle FOR
		
		System.out.println("**************BOUCLE FOR***********");
		
		for(int i=1; i<=5; i++) {
			System.out.println("i = "+i);
			
			//Sortir du FOR si i = 3
			if(i == 3) {
				break;
			}
		}
		System.out.println("===========FOR INVERSEE==========");
		//Boucle FOR inversée
		for(int j=5; j>=1; j--) {
			System.out.println("j = "+j);
		}
		
		//FOREACH: faire un parcours complet d'une collection
		int[] tableau = {10,15,25,40};
		
		//Pour element de type int contenu dans le tableau ---- code à exécuter
		
		System.out.println("*************BOUCLE FOREACH***********");
		
		for(int element : tableau) {
			System.out.println(element);
		}
		System.out.println("=================");
		
		//Lister le contenu du tableau avec un FOR classique
		for(int index=0; index < tableau.length; index++) {
			System.out.println(tableau[index]);
		}
		
		//Boucle While
		System.out.println("****************BOUCLE WHILE***************");
		int value = 1;
		
		//Tant que la condition est vraie, la boucle est exécutée
		while(value < 5) {
			System.out.println("Passage n°: "+value);
			value++;
		}
		
		//Boucle Do/While: s'exécute au moins une fois
		
		//Fait tant que la condition est vraie
		do {
			System.out.println("Passage n°: "+value);
			value++;
		}while(value < 10);

	}

}
