package Principal;

import Abstraction.Femme;
import Abstraction.Homme;
import Abstraction.Personne;
import Agregation.Adresse;
import Agregation.Client;
import Encapsulation.CompteBancaire;
import Encapsulation.Rectangle;
import Heritage.Animal;
import Heritage.Chat;
import Heritage.Chien;
import Heritage.Giraffe;
import Heritage.Souris;

public class App {

	public static void main(String[] args) {
		
		//Concepts objets: Encapsulation - Héritage - Polymorphisme - Abstraction - Agrégation (association - composition)
		
		
		
		double hauteur = 10;
		double largeur = 15;
		double surf = Surface(hauteur, largeur);
		
		double hauteur1 = 10;
		double largeur1 = 15;
		double surf1 = Surface(hauteur1, largeur1);
		
		//Encapsulation:
		//1- Rassembler dans une seule et même les params et les fonctions qui concernent le mm sujet
		//2- Pas d'accès publique aux attributs d'une classe. L'accès passe forcément par les accesseurs (Getteurs/Setteurs)
		
		Rectangle rec = new Rectangle();
		rec.SetHauteur(-10); 
		rec.SetLargeur(15);
		rec.surface();
		
		
		//Constructeur: méthode spéciale, publique qui porte le nom de la classe, son rôle est de construire des objets
		//à partir de la classe en question, initialiser tous les attributs de l'objet.
		
		CompteBancaire cpt = new CompteBancaire(); // numero = null   -- solde = 0
		System.out.println("solde = "+cpt.getSolde());
		
		CompteBancaire cpt2 = new CompteBancaire("dqsdq154", 1200);
		cpt2.depot(1500);
		cpt2.retrait(1500);
		
		System.out.println(cpt2);
		
		CompteBancaire.getBanque();
		CompteBancaire.setBanque("LCL");
		
		CompteBancaire cpt3 = new CompteBancaire("dqsdq154", 1200); //48857555
		CompteBancaire cpt4 = new CompteBancaire("dqsdq154", 1200);
		
		System.out.println("Equals: "+(cpt3.equals(cpt4))); //Par defaut Equals compare les adresses
		
		CompteBancaire compte = new CompteBancaire();
		
		System.out.println("******************HERITAGE*************************");
		
		Animal a = new Animal();
		a.setNom("nomAnimal");
		a.setAge(10);
		a.emettreUnSon();
		
		
		Chat c = new Chat();
		c.setNom("chat");
		c.setAge(5);
		c.emettreUnSon();
		
		Animal a2 = new Animal("a2", 90);
		Chat c2 = new Chat("c2", 3);
		
		Chien chien = new Chien();
		chien.setNom("bobby");
		chien.setAge(5);
		chien.emettreUnSon();
		
         Animal a3 = new Animal();
         Animal a4 = new Chat();
         Animal a5 = new Chien();
     
         
         //Un objet de type Animal peut prendre plusieurs formes (Polymorphisme).
         //Le polymorphisme est une conséquence de l'héritage, c'est le fait qu'un objet parent puisse prendre
         //la forme de tous les objets enfants
         
         int[] tab = new int[2];
         tab[0] = 10;
         tab[1] = 20;
         
         
         //Collection polymorphique
         Animal[] animaux = new Animal[3];
         animaux[0] = new Animal();
         animaux[1] = new Chat();
         animaux[2] = new Chien();
         
         Son(new Animal());
         Son(new Chat());
         Son(new Chien());
         Son(new Souris());
         Son(new Giraffe());
         
         Object obj = new Chat();
         
         System.out.println("**************ABSTRACTION***************");
         
         Homme h = new Homme();
         Femme f = new Femme();
         Personne p = new Homme();
         Personne p2 = new Femme();
         
         System.out.println("**************ASSOCIATION***************");
         
         Client client = new Client("nomClient", new Adresse(62,"rue de Bonnel 69003 Lyon"));
        		
		
	}

	private static double Surface(double hauteur, double largeur) {
		return hauteur * largeur;
	}

	//Polymorphisme par sous typage
	private static void Son(Animal a) {
		a.emettreUnSon();
	}
	
	//Polymorphisme AD-HOC: nécessite des contrôles et des CAST
	private static void Son2(Object obj) {
		if(obj instanceof Animal) {
			Animal a = (Animal) obj;
			a.emettreUnSon();
		}
	}
}
