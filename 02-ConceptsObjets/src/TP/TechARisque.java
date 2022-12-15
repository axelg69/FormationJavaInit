package TP;

public class TechARisque extends Technicien implements IPrime{

	public TechARisque(String nom, String prenom, int age, String dateEntree, double unites) {
		super(nom, prenom, age, dateEntree, unites);
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return super.calculerSalaire() + PRIME;
	}

	
}
