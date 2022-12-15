package Bases;

import java.util.Scanner;

public class DataTypes {

	//Main: le point d'entrée de l'application - c'est la méthode qui sera exécutée au démarrage de l'application
	
	public static void main(String[] args) {
		
		//Variable: zone mémoire contenant une valeur typée
		/*
		 * Types primitifs (types simples - types valeurs):entiers , réels, char, boolean
		 * 
		 * entiers: byte ( 1 octet), short (2 octets), int (4 octets), long (8 octets)
		 * réels: float (4 octets), double( 8 octets)
		 * char: 2 octets
		 * boolean: 1 octet
		 * 
		 * Types complèxes (types réferences): String, tableaux, Enum, objet(classes)
		 * 
		 * 
		 * Conventions de nommage:
		 * classes - méthodes - variables: camelCase - maMethode
		 * 
		 */
		//Le nom d'une variable commence, soit par une lettre, _ ou un symbôle monétaire
		
		
		int myInt = 10;
		byte myBye = 5;
		//le compilateur utilise par defaut le type double pour les réels - pour stocker une valeur dans un float
		//on doit le faire de manière explicite en ajoutant la lettre f au nombre decimal
		float myFloat = 10.5f; 
		double myDouble = 15.5;
		boolean myBool = true;
		char myChar = 'c';
		String chaine = "ceci est une chaine";
		
		System.out.println("myInt = "+myInt); // + permet de faire une concaténation -
		System.out.println("6"+6+3); //663
		System.out.println(6+3+"1"); //91
		
		//Transtypage: conversion de type
		
		//Conversion implicite: concerne le passage d'un type inférieur à un type supérieur
		
		byte myByte2 = 25;
		int myInt2 = myByte2;
		
		//Conversion explicite: concerne le passage d'un type supérieur à un type inférieur 
		//CAST: (int), (bool), (char).......
		//Risque de perte de données
		
		int myInt3 = 15;
		byte myByte3 = (byte) myInt3;
		
		long myLong = 25;
		int myInt4 = (int) myLong;
		
		//Conversion types incompatibles
		String str = "25";
		int myInt5 = Integer.parseInt(str);
		byte myByte5 = Byte.parseByte(str);
		
		String str2 = "true";
		boolean myBool2 = Boolean.parseBoolean(str2);
		
		System.out.println("Quel est votre âge?:");
		
		//Pour récupérer le contenu de la console, en utilise la classe Scanner
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		System.out.println("Votre âge = "+age);
		
		
		
		/*Pour chaque type simple, Java propose un Wrapper (une classe qui enveloppe le type simple)
		 * qui propose des méthodes de conversion
		 * int ---- Integer
		 * char ---- Charactere
		 * byte --- Byte
		 * double ---- Double
		 * float ---- Float
		 * 
		 */
		
		//Constante: une variable dont on ne pas modifier la valeur
		final double X = 10.5;
		//x = 20.5; // -- erreur de compilation
		
		//Nombre aléatoire
		int aleatoire = (int)(Math.random() * 100); //génère un nombre aléatoire compris entre 1 et 100
		
		

	}

}
