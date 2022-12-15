package TP2;

public class Consultant extends ManagerSalarie{

	
	private static int ESSAI_CONSULTANT = 3;
	
	public Consultant(String nom, String prenom, int age, double salaire, Manager manager) {
		super(nom, prenom, age, salaire, manager);
		
	}

	@Override
	public void Pointer() {
		System.out.println("Consultant "+getNom()+" présent.");
		
	}
}
