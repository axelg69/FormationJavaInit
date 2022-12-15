package TP2;

public class Dev extends ManagerSalarie{
	
	
	private static int ESSAI_DEV = 2;

	public Dev(String nom, String prenom, int age, double salaire, Manager manager) {
		super(nom, prenom, age, salaire, manager);
	
	}

	@Override
	public void Pointer() {
	System.out.println("Dev "+getNom()+" présent.");
	}
}
