package personnages;


public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}
	
	public void donner(Commercant commercant) {
		parler(commercant.getNom() + " prends ces " + this.argent /10 + " sous");
		commercant.gagnerArgent(this.argent / 10);
	}

	public void provoquer(Yakusa yakuza) {
		if (2*this.honneur > yakuza.getReputation()) {
			super.gagnerArgent(yakuza.perdre());
			honneur++;
			super.parler("J'ai battu ce minable Yakuza : " + yakuza.getNom());
		}
		else {
			honneur--;
			super.parler("Je ne devais pas perdre !!!");
			yakuza.gagner(this.argent);
		}
	}
}
