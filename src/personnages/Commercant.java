package personnages;
public class Commercant extends Humain {
	
	public Commercant(String nom, int argent) {
		super(nom,"thé", argent);
	}
	
	public int seFaireExtorquer() {
		int somme = super.getArgent();
		this.perdreArgent(this.getArgent());
		return somme;
	}
	
	public void recevoir(int somme) {
		this.recevoir(somme);
		parler(somme + " sous ! Je te remercie généreux donateur!");
	}
}
