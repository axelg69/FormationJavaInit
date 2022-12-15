package TP2;

public abstract class ManagerSalarie extends Salarie{

	private Manager manager;

	public Manager getManager() {
		return manager;
	}

	public void setManager(Manager manager) {
		this.manager = manager;
	}
	

	public ManagerSalarie(String nom, String prenom, int age, double salaire, Manager manager) {
		super(nom, prenom, age, salaire);
		this.manager = manager;
	}

	
}
