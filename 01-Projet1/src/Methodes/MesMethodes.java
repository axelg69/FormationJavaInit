package Methodes;

import java.util.Iterator;

public class MesMethodes {
		
	//Signature d'une méthode:
	
	//VISIBILITE [static] Type_Retour (void) nom_Methode(paramétres){ instructions; }
	/*Une classe peut contenir 2 types de méthodes:
	 * 
	 * Méthode de classe:
	 * Méthode d'instance
	 * 
	 * 
	 */
	
	//Méthode d'instance: est une méthode accéssible via une instance de la classe en question
	//Instancier une classe c'est créer un objet à partir de cette classe
	
	public void afficher(String chaine) {
		System.out.println(chaine);
	}
	
	//Méthode de classe: qu'on appelle a partir de la classe NomClasse.NomMethode
	public static void afficher2(String chaine) {
		System.out.println(chaine);
	}
	
	/**
	 * Méthode qui renvoie la somme de 2 entiers
	 * @param x: est un entier
	 * @param y: est un entier
	 * @return : Somme de x et y
	 */
	public static int somme(int x, int y) {
		return x + y;
	}
	
	//Méthode pour lister le contenu d'un tableau
	public static void AfficherTableau(int[] tableau) {
		for(int element : tableau) {
			System.out.println(element);
		}
	}
	
	//Méthode qui renvoie la somme des éléments d'un tableau d'entiers
	public static int sommeTableau(int[] tab) {
		int somme = 0;
		for(int element : tab) {
			somme += element; //somme = somme + element;
		}
		
		return somme;
	}
	
	
	//Méthode qui renvoie la moyenne des éléments d'un tableau d'entiers
	
	public static double moyenneTableau(int[] tab) {
		double moy = 0;
		
		double somme = 0;
		
		for(int x : tab) {
			somme += x;
		}
		moy = somme / tab.length;
		return moy;
	}
	
	
	//Méthode qui renvoie l'élément le plus petit d'un tableau d'entiers
	
	public static int MinTableau(int[] tab) {
		int min = tab[0];
		
		for(int i=1;i<tab.length;i++) {
			if(tab[i] < min) {
				min = tab[i];
			}
		}
		
		
		return min;
	}
	
	//Surcharge de méthode (overload): pouvoir définir la même méthode (mm signature) dans la même classe
	//et modifier simplement la liste des params, soit en nombre soit en type
	
	public static void imprimer(String chaine) {
		System.out.println(chaine);
	}
	
	public static void imprimer(int x) {
		System.out.println(x);
	}
	
	public static void imprimer(int x, double y) {
		System.out.println(x+" "+y);
	}
	
	//Méthode qui permute 2 entiers
	//Java par defaut utlise le passage de paramètres par valeur
	public static void permuter(int x, int y) {
		Integer tmp = x;
		x = y;
		y = tmp;
		
	}
	
//	public static int[] permuter2(int x, int y) {
//		
//		int[] tab = new int[2];
//		Integer tmp = x;
//		x = y;
//		y = tmp;
//		
//		tab[0] = x;
//		tab[1] = y;
//		
//		return tab;
//		
//	}
	
	public static void ModifierTableau(int[] tab) {
	for (int i = 0; i < tab.length; i++) {
		tab[i] = tab[i] * 10;
	}
	}
	
	public static void ModifierInt (int x) {
		x = x * 5;
	}
	
	public static int ModifierInt2(int y) {
		y = y * 5;
		return y;
	}
	
//	public static int Produit(int x, int y) {
//		return x * y;
//	}
//	
//	public static int Produit(int x, int y, int z) {
//		return x * y * z;
//	}
//	
//	public static int Produit(int x, int y, int z, int e) {
//		return x * y * z * e;
//	}
//	
	//Méthode avec un nombre variable de paramètres
	public static int Produit(int... valeur) {  // int... représente un tableau à taile variable
		int result = 1;
		for(int e : valeur) {
			result = result * e;
		}
		return result;
	}
	
	public static void AfficherChaines(String str, String... chaines) {
		System.out.println(str);
		
		for(String s : chaines) {
			System.out.println(s);
		}
	}

}
