package personnages;

public class Humain {
	protected int argent;
	private String boisson;
	private String nom;
	
	public Humain(String nom,String boisson,int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	public void parler(String texte) {
		System.out.println("( " + this.nom + " ) - " + texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + this.nom + " et j'aime boire du " + this.boisson);
	}
	public void boire() {
		parler("Mmmm, un bon verre de " + this.boisson + " ! GLOUPS !");
	}

	public int getArgent() {
		return argent;
	}

	public String getBoisson() {
		return boisson;
	}

	public String getNom() {
		return nom;
	}

	public void setArgent(int argent) {
		this.argent = argent;
	}

	public void setBoisson(String boisson) {
		this.boisson = boisson;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
