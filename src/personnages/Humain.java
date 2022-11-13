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
		System.out.println("( " + this.nom + " ) " + texte);
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
	
	public void acheter(String bien, int prix) {
		if (this.argent >= prix)
			parler("J'ai" + this.argent + " en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
		else
			parler("J'ai" + this.argent + " en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous");

	}
	public void perdreArgent(int somme) {
		this.argent = somme - getArgent();
	}
	
	public void gagnerArgent(int somme) {
		this.argent = somme + getArgent();
	}
}
