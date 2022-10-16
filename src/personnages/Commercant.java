package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom,"thé", argent);
	}
	
	public int seFaireExtorquer() {
		int somme = super.getArgent();
		super.setArgent(0);
		return somme;
	}
	
	public void recevoir(int somme) {
		setArgent(somme + getArgent());
	}
}
