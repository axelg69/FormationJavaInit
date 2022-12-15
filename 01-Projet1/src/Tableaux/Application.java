package Tableaux;

public class Application {

	public static void main(String[] args) {
		//Tableau: un ensemble de cases qui contiennent des valeurs typées
		
		//Tableau 1 dimension
		int[] tab = new int[3]; // première façon de déclarer un tableau - tableau statique - taille fixe
		tab[0] = 10;
		tab[1] = 20;
		tab[2] = 30;
		
		int[] tab2 = {10,20,30};
		System.out.println("Taille de tab2 = "+tab2.length); //3
		
		//Foreach
		for(int x : tab2) {
			System.out.println(x);
		}
		
		//For
		for(int i=0;i<tab2.length;i++) {
			System.out.println(tab2[i]);
		}
		
		//Tableau 2 dimensions: tableau de tableaux
		int[][] tab2D = new int[2][]; //le nombre de lignes est obligatoire
		tab2D[0] = new int[2];
		tab2D[1] = new int[3];
		
		int[][] tableau = {{10,20},{30,40,50}};
		System.out.println(tableau[1][0]); //30
		
		//Lister le contenu du tableau de tableaux:
		System.out.println("*********FOR*************");
		//Boucler sur les lignes
		for(int ligne=0;ligne<tableau.length;ligne++) {
			
			//Boucler les colonnes
			for(int colonne=0;colonne<tableau[ligne].length;colonne++) {
				System.out.println(tableau[ligne][colonne]);
			}
		}
		
		System.out.println("*********FOREACH*************");
		
		for(int[] tabl : tableau) {
			for(int el : tabl) {
				System.out.println(el);
			}
		}

	}

}
