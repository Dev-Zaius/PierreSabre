package personnages;
public class Commercant extends Humain {
	private Yakusa testeur;
	
	public void bla() {
		testeur.pourTester();
	}
	
	public Commercant(String nom, int argent) {
		super(nom,"thé", argent);
	}
	
	public int seFaireExtorquer() {
		int somme = getArgent();
		this.perdreArgent(getArgent());
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return somme;
	}
	
	public void recevoir(int somme) {
		gagnerArgent(somme);
		parler(somme + " sous ! Je te remercie généreux donateur!");
	}
}
