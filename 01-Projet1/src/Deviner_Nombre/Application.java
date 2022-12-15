package Deviner_Nombre;

import java.util.Scanner;

public class Application {

	/*
	 * Le programme choisira un nombre aléatoire compris entre 1 et 100 Le user à droit à 6
	 * tentatives pour deviner le nombre aléatoire.
	 *  Le programme indique au user si le nombre fournit est inférieur ou supérieur au nombre aléatoire
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int aleatoire = (int) (Math.random() * 100);
		int MAX_TENTATIVES = 6;
		int nbTentative = 0;

		System.out.println("**************DEVINEZ MON NOMBRE*************");
		System.out.println();
		System.out.println("Vous avez droit à 6 tentatives au maximum");
		System.out.println();

		// Récupérer le nombre saisi et faire les contrôles nécessaires

		while (true) {
			System.out.println("Donnez votre nombre:");
			nbTentative++; // nbTentative = nbTentative + 1;
			Scanner sc = new Scanner(System.in);
			int nombre = sc.nextInt();
			
			if(nombre == aleatoire) {
				System.out.println("Trouvé en "+nbTentative+" tentatives. Le nombre aléatoire est: "+aleatoire);
				break;
			}
			
			if(nbTentative == MAX_TENTATIVES) {
				System.out.println("Perdu. Le nombre aléatoire est: "+aleatoire);
				break;
			}
			
			if(nombre < aleatoire) {
				System.out.println("Supérieur");
			}
			
			if(nombre > aleatoire) {
				System.out.println("Inférieur");
			}
			
			System.out.println("Il vous reste "+(MAX_TENTATIVES - nbTentative)+" tentatives.");
			
			
		}
	}

}
