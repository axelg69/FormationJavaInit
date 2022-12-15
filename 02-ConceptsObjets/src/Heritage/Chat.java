package Heritage;

public class Chat extends Animal {

	private String race;

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Chat(String nom, int age) {
		super(nom, age);
	}
	
	public Chat(String nom, int age, String race) {
		super(nom,age);
		this.race = race;
		//this: mot clé qui pointe vers l'objet en cours d'utilisation
	}
	public Chat() {
		super();
	}

	@Override
	public void emettreUnSon() {
		System.out.println("Miauller");
	}

}
