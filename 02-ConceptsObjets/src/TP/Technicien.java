package TP;

public class Technicien extends Employe{

	
	private double unites;
	private static int COEFFICIENT = 5;
	
	public Technicien(String nom, String prenom, int age, String dateEntree, double unites) {
		super(nom, prenom, age, dateEntree);
		this.unites = unites;
	}

	@Override
	public double calculerSalaire() {
		
		return unites * COEFFICIENT;
	}

	@Override
	public String titre() {
		// TODO Auto-generated method stub
		return "Le technicien ";
	}
	
	
}
