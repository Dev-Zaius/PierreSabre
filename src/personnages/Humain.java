package personnages;

public class Humain {
	protected int argent;
	private String boisson;
	private String nom;
	protected Humain[] memoire;
	protected int nbConnaissance = 0 ;
	
	
	public Humain(String nom,String boisson,int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
		this.memoire = new Humain[30];
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
	
	public void faireConnaissanceAvec(Humain humain) {
		direBonjour();
		humain.direBonjour();
		memoriser(humain);
		humain.memoriser(this);
	}
	
	public void listerConnaissance() {
		String phrase = "";
		String ponctuation ="";
		for (int i = 0 ; i < nbConnaissance ; i++) {
			if (i != nbConnaissance-1)
				ponctuation = ", ";
			else
				ponctuation = "";
			phrase = phrase + memoire[i].getNom() + ponctuation;
		}
		parler(" Je connais beaucoup de monde don : " + phrase);
	}
	
	protected void memoriser(Humain humain) {
		if (nbConnaissance < 30) {
				memoire[nbConnaissance] = humain;
				nbConnaissance++;
		}
		else { // partie qui va oublier le plus ancien
			for (int i = 0 ; i < nbConnaissance-1 ; i++) {
				memoire[i] = memoire[i+1];
			}
			memoire[29] = humain;
		}
	}
}
