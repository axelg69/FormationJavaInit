package TP;

public class ManutARisque extends Manutentionnaire implements IPrime{

	public ManutARisque(String nom, String prenom, int age, String dateEntree, double heures) {
		super(nom, prenom, age, dateEntree, heures);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculerSalaire() {
		// TODO Auto-generated method stub
		return super.calculerSalaire() + PRIME;
	}

	
}
