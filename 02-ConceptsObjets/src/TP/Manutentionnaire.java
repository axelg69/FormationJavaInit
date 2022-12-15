package TP;

public class Manutentionnaire extends Employe {

	
	private double heures;
	private static double TAUX_HORAIRE = 65;
	
	public Manutentionnaire(String nom, String prenom, int age, String dateEntree, double heures) {
		super(nom, prenom, age, dateEntree);
		this.heures = heures;
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return heures * TAUX_HORAIRE;
	}

	@Override
	public String titre() {
		// TODO Auto-generated method stub
		return "Le manutentionnaire ";
	}
	
	
	
}
