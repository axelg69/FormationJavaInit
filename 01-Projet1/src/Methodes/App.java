package Methodes;

import java.beans.XMLEncoder;

public class App {

	public static void main(String[] args) {
		
		//Méthode: un ensemble d'instructions réutilisables
		/*
		 * 2 types de méthodes:
		 * Procédure: une méthode qui ne renvoie aucun résultat - mot void
		 * Fonction: une méthode qui renvoie un résultat
		 * 
		 */
		
		//Appel de la méthode de classe (static)
		MesMethodes.afficher2("ceci est une chaine");
		
		//Appel de la méthode d'instance:
		MesMethodes m = new MesMethodes(); //m est une instance de la classe MesMethodes
		m.afficher("aute chaine");
		
		String ss = "DDDD";
		ss.toLowerCase();
		
		int resultat = MesMethodes.somme(4, 5);
		System.out.println("Résultat = "+resultat);
		
		int[] tab = {3,2,15,10,1,8,6};
		MesMethodes.AfficherTableau(tab);
		
		int somme = MesMethodes.sommeTableau(tab);
		System.out.println("Somme = "+somme);
		
		double moyenne = MesMethodes.moyenneTableau(tab);
		System.out.println("Moyenne = "+moyenne);
		
		int min = MesMethodes.MinTableau(tab);
		System.out.println("min = "+min);
		
		//Appel de la méthode surchargée
		MesMethodes.imprimer("qdsqsdqs");
		MesMethodes.imprimer(25);
		
		int val1=10, val2=20;
		
		System.out.println("Avant permutation: val1 = "+val1+" - val2 = "+val2);
		
		MesMethodes.permuter(val1, val2);
		
		System.out.println("Après permutation: val1 = "+val1+" - val2 = "+val2);
		
		int[] tableau = {1,2};
		
		MesMethodes.ModifierTableau(tableau);
		
		for(int r : tableau) {
			System.out.println(r);
		}
		
		int valeur = 10;
		MesMethodes.ModifierInt(valeur);
		
		System.out.println("Valeur = "+valeur);
		valeur = MesMethodes.ModifierInt2(valeur);
		
		System.out.println("Valeur = "+valeur);
		
		//Appel de la méthode avec un nombre variable de paramètres:
		MesMethodes.Produit(10,20);
		MesMethodes.Produit(10,20,30);
		MesMethodes.Produit(10,20,30,40);
		MesMethodes.Produit(10,20,30,40,50);
		
		
		

	}

}
