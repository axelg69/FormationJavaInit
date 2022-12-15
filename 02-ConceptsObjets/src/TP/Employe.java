package TP;

public abstract class Employe {

	private String nom;
	private String prenom;
	private int age;
	private String dateEntree;

	
	public abstract double calculerSalaire();
	
	public String getNom() {
		return titre()+prenom+" "+nom;
	}

	public String titre() {
		return "L'employé ";
	}
	
	public Employe(String nom, String prenom, int age, String dateEntree) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.dateEntree = dateEntree;
	}
	
	
}
