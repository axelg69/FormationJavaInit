package TP2;

public class App {

	public static void main(String[] args) {
		
		Manager man = new Manager("nomManager", "prenomManager", 50, 5000);
		Dev dev = new Dev("nomDev", "prenom", 25, 2000, man);
		
		//dev.setSalaire(3500);
		
		dev.ModifierSalaire(3500, dev);
		
		Manager man2 = new Manager("nomManager2", "prenomManager2", 50, 4000);
		man.ModifierSalaire(6000, man2);
		
		System.out.println("Salaire de Dev: "+dev.getSalaire());
		
		man.ModifierSalaire(3200, dev);
		
		System.out.println("Nouveau salaire de Dev: "+dev.getSalaire());

	}

}
