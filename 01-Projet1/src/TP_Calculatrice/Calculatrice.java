package TP_Calculatrice;

import java.util.Scanner;

public class Calculatrice {

	public static void main(String[] args) {
		/*
		 * Demander à l'utilisateur de choisir une opération, de fournir 2 nombres ---- Afficher le résultat
		 * 
		 */
		String choix = "", quitter="non";
		double valeur1 = 0, valeur2 = 0;
		
		do {
			//Affichage d'un menu
			System.out.println("**********CALCULATRICE-CONSOLE**************");
			System.out.println();
			System.out.println("****Opérations possibles:");
			System.out.println();
			System.out.println("1- Addition: tapez a");
			System.out.println("2- Soustraction: tapez s");
			System.out.println("3- Multiplication: tapez m");
			System.out.println("4- Division: tapez d");
			
			System.out.print("Votre choix:"); 
			
			Scanner sc = new Scanner(System.in); //sc.nextLine() pour le choix - sc.nextDouble() pour valeur1 et valeur2
			choix = sc.nextLine();
			
			while(true) {
				if(choix.equals("a") || choix.equals("s")|| choix.equals("m") || choix.equals("d") ) {
					break;
				}else {
					System.out.println("Choix non valide.");
					System.out.println("Autre choix:");
					choix = sc.nextLine();
				}
			}
			
			//Récupérer le choix de l'opération - tant que le choix saisi n'est pas valide, on invite l'utilisateur
			//à choisir une auyre opération
			
			
			
			//Demander à l'utilisateur de fournir la 1ère valeur - si la la valeur fournie n'est pas valide, il doit 
			//saisir une autre
			System.out.print("Première valeur:");
			valeur1 = sc.nextDouble();
			
			
			//Demander à l'utilisateur de fournir la 2ème valeur - si la la valeur fournie n'est pas valide, il doit 
			//saisir une autre
			
			System.out.print("Deuxième valeur:");
			valeur2 = sc.nextDouble(); //Récupére le double mais ne passe pas à la ligne suivante
			
			if(choix.equals("d") && valeur2 == 0) {
				System.out.println("Division par zéro impossible. Fournir une autre valeur");
				valeur2 = sc.nextDouble();
			}
			
			//Afficher le résultat
			
			switch (choix) {
			case "a":
				System.out.println(valeur1 + " + " + valeur2 +" = "+ (valeur1+valeur2) );
				break;
			case "s":
				System.out.println(valeur1 + " - " + valeur2 +" = "+ (valeur1-valeur2) );
				break;
			case "m":
				System.out.println(valeur1 + " x " + valeur2 +" = "+ (valeur1*valeur2) );
				break;
			case "d":
				System.out.println(valeur1 + " / " + valeur2 +" = "+ (valeur1/valeur2) );
				break;
			}
			//Si le contenu récupérer depuis la console est de type numérique, pensez à passer à la ligne suivante
			//s'il s'agit de récupérer une chaine de caractères
			
			sc.nextLine(); 
			System.out.println("Quitter l'application: oui/non");
			
			quitter = sc.nextLine();
		}while(!quitter.equals("oui"));
		
		

	}

}
