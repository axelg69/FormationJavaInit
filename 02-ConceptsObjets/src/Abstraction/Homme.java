package Abstraction;

public class Homme extends Personne{

	public Homme(String nom, String prenom) {
		super(nom, prenom);
	}
	
	public Homme() {
		
	}

	@Override
	public void identite() {
		System.out.println("Je suis un homme et je m'appele "+getNom());
		
	}

}
