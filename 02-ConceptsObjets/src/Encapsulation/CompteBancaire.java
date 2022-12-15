package Encapsulation;

import java.util.Objects;

public class CompteBancaire extends Object{
	
	//Attributs - Propriétés: représentant l'état de l'objet
	
	private String numero;
	private double solde;
	
	//Attributs globaux: partagés par l'ensemble des objets
	private static String Banque = "BNP";

	public static String getBanque() {
		return Banque;
	}
	public static void setBanque(String banque) {
		Banque = banque;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		//this: mot clé qui pointe vers l'objet en cours d'utilisation
		if(numero.length() >= 6) {
			this.numero = numero;
		}else {
			System.out.println("Numéro doit contenir au minimum 6 caractères.");
		}
		
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	//Constructeurs
	//Surcharge (overload)
	
	public CompteBancaire(String numero, double solde) {
		super();
		setNumero(numero);
		this.solde = solde;
	}
	public CompteBancaire(String numero) {
		super();
		setNumero(numero); 
	}
	
	//A ne définir qu'en cas de besoin: des librairies externes qui exigent la présence d'un constructeur par defaut
	public CompteBancaire() {
		super();
	}
	
	//Méthodes: représentent le comportement de l'objet
	
	public void depot(double montant) {
		solde += montant;
	}
	
	public void retrait(double montant) {
		if(solde >= montant) {
			solde -= montant;
		}else {
			System.out.println("Solde insuffisant......");
		}
	}
	
	//ToString(): méthode qui permet de personnaliser l'affichage des objets
	//Redéfinition (override): une classe fille peut rédéfinir une méthode définie dans la classe mère
	
	
	@Override
	public String toString() {
		
		return "Numéro: "+numero+" Solde: "+solde;
	}
	@Override
	public int hashCode() {
		return Objects.hash(numero, solde);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CompteBancaire other = (CompteBancaire) obj;
		return Objects.equals(numero, other.numero)
				&& Double.doubleToLongBits(solde) == Double.doubleToLongBits(other.solde);
	}


}
