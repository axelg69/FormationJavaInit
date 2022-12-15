package Enumeration;

import java.util.Scanner;

public class App {
	
	public enum Erreurs{
		CRITIQUE,
		MAJEURE,
		MINEURE
	}
	
	

	public static void main(String[] args) {
		
		//Enum: un ensemble de valeurs constantes
		
		Erreurs err = Erreurs.MAJEURE;
		System.out.println(err);
		
		Erreurs[] tab = Erreurs.values();
		
		for(Erreurs er : tab) {
			System.out.println(er);
		}
		
		System.out.println(err.ordinal());
		
		System.out.println("Code de votre erreur (0-2)?");
		Scanner sc  = new Scanner(System.in);
		int code = sc.nextInt();
		
		System.out.println("Votre erreur est: "+Erreurs.values()[code]); 

		User u = new User();
		u.nom = "marc";
		u.profil = Profils.MANAGER;
		u.autorisations.add(Autorisation.LECTURE);
		u.autorisations.add(Autorisation.MODIFICATION);
		u.autorisations.add(Autorisation.SUPPRRESSION);
		
		if(u.autorisations.contains(Autorisation.SUPPRRESSION)) {
			System.out.println("Suppression OK");
		}else {
			System.out.println("Action interdite");
		}
		
		
		
	}

}
