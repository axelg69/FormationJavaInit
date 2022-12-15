package TP2;

public class Manager extends Salarie{

	private Salarie[] salaries = new Salarie[5];
	

	public Manager(String nom, String prenom, int age, double salaire) {
		super(nom, prenom, age, salaire);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void Pointer() {
		
		System.out.println("Manager "+getNom()+" présent.");
	}

}
