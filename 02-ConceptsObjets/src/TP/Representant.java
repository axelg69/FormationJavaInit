package TP;

public class Representant extends Commercial{

	
	private static double POURCENT_REPRESENTANT = 0.2;
	private static double BONUS_REPRESENTANT = 800;
	
	public Representant(String nom, String prenom, int age, String dateEntree, double chiffreAffaire) {
		super(nom, prenom, age, dateEntree, chiffreAffaire);
		
	}

	@Override
	public double calculerSalaire() {
		
		return getChiffreAffaire() * POURCENT_REPRESENTANT + BONUS_REPRESENTANT;
	}

	@Override
	public String titre() {
		// TODO Auto-generated method stub
		return "Le représentant ";
	}
	
	
}
