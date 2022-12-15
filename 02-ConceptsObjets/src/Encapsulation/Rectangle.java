package Encapsulation;

import java.util.Scanner;

public class Rectangle {

	private double hauteur;
	
	public double GetHauteur() {
		return hauteur;
	}
	
	public void SetHauteur(double valeur) {
		if (valeur > 0) {
			hauteur = valeur;
		}else {
			System.out.println("Hauteur ne peut pas être négative");
		}
		
	}
	
	private double largeur;
	
	public double GetLargeur() {
		return largeur;
	}
	
	public void SetLargeur(double valeur) {
		largeur = valeur;
	}
	
	public double surface() {
		return hauteur * largeur;
	}
	
	private int age;
	
	public int GetAge() {
		System.out.println("Merci de saisir votre mot de passe:");
		Scanner sc = new Scanner(System.in);
		String password = sc.nextLine();
		if(password.equals("admin")) {
			return age;
		}else {
			System.out.println("Accès interdit");
			return 0;
		}
		
	}
	
	public void SetAge(int valeur) {
		if(valeur >=18 && valeur<=65) {
			age  = valeur;
		}else {
			
		}
	}
	
	//code secret accéssible uniquement en lecture
	private String codeSecret = "qsfqsfqsqs";
	
	public String GetCodeSecret() {
		return codeSecret;
	}
}
