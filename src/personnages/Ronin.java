package personnages;


public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant commercant) {
		parler(commercant.getNom() + " prends ces " + this.argent /10 + " sous");
		commercant.recevoir(this.argent / 10);
	}

	public void provoquer(Yakusa yakuza) {
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (2*this.honneur > yakuza.getReputation()) {
			super.parler("Je t'ai eu petit yakuza : " + yakuza.getNom());
			super.gagnerArgent(yakuza.perdre());
			honneur++;
		}
		else {
			honneur--;
			super.parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse en ont pris un coup.");
			yakuza.gagner(this.argent);
		}
	}
}
