package TP2;

/*
 *    TP2 Concepts Objets:
        Un client souhaite gérer les salariés de son ETS
        * Tous les salariés possèdent un nom, un prénom, un âge compris entre 18 et 65, un salaire minimum de 2000.
        * Tous les salariés doivent signaler leur présence (pointer)
        * Dev: leur période d'essai est 2 mois, et chaque Dev possède un Manager
        * Consultant: leur période d'essai est de 3 mois, et chaque consultant possède un Manager
        * Manager: chaque manager gère 5 salariés.
        * Seul le Manager peut modifier le salaire d'un salarié autre qu'un Manager.
        
        **** Fournir le modèle objet.
 
 */

public abstract class Salarie {
	
	private String nom;
	private String prenom;
	private int age;
	private double salaire;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=18 && age<=65 ) {
			this.age = age;
		}else {
			System.out.println("Age compris entre 18 et 65");
		}
		
	}
	public double getSalaire() {
		return salaire;
	}
	private void setSalaire(double salaire) {
		if(salaire >=2000) {
			this.salaire = salaire;
		}else {
			System.out.println("Salaire min est de 2000");
		}
		
	}
	
	public abstract void Pointer();
	
	public Salarie(String nom, String prenom, int age, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		setAge(age);
		setSalaire(salaire);
	}
	
	
	public void ModifierSalaire(double nouveauSalaire, Salarie s) {
		//Seul un Manager peut modifier le Salaire
		if(this instanceof Manager) {
			
			//this: mot clé qui pointe vers l'objet en cours d'utilisation
			//Un Manager ne peut pas modifier le salaire d'un autre Manager
			if(s instanceof Manager) {
				System.out.println("Un manager ne peut modifier le salaire d'un autre Manager ");
			}else {
				s.setSalaire(nouveauSalaire);
				System.out.println("Salaire mis à jours......");
			}
			
		}else {
			System.out.println("Action interdite");
		}
	}
	

}
