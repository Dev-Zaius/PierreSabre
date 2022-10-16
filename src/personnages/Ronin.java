package personnages;


public class Ronin extends Humain {
	private int honneur = 1;
	
	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		// TODO Auto-generated constructor stub
	}
	
	public void donnerArgent(Commercant commercant,int somme) {
		commercant.recevoir(somme);
	}

	public void duel(Yakusa yakuza) {
		if (2*this.honneur > yakuza.getReputation()) {
			super.setArgent(yakuza.perdre() + super.getArgent());
			honneur++;
			super.parler("J'ai battu ce minable Yakuza : " + yakuza.getNom());
		}
		else {
			honneur--;
			super.parler("Je ne devais pas perdre !!!");
			yakuza.gagner();
		}
	}
}
