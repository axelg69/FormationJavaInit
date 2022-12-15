package TP;

public class Personnel {

	private Employe[] staff = new Employe[MAX_EMPLOYE];
	private final static int MAX_EMPLOYE = 100;
	private int nbEmploye = 0;
	
	public void ajouterEmploye(Employe e) {
		nbEmploye++;
		if(nbEmploye <= MAX_EMPLOYE) {
			staff[nbEmploye - 1] = e;
		}else {
			System.out.println("Pas plus ");
		}
	}
	
	public void afficherSalaire() {
		for(int i = 0; i < nbEmploye; i++) {
			System.out.println(staff[i].getNom()+" gagne "+staff[i].calculerSalaire()+" euros.");
		}
		
	}
	
	public double salaireMoyen() {
		double somme = 0;
		for(int i=0; i< nbEmploye; i++) {
			somme+=staff[i].calculerSalaire();
		}
		
		return somme / nbEmploye;
	}
}
