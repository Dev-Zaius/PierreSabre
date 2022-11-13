package personnages;

public class Yakusa extends Humain{
	private String clan;
	private int reputation = 0;

	public Yakusa(String nom, String boisson, int argent,String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public void extorquer(Commercant commercant) {
		super.parler(commercant.getNom() + ", si tu tiens à la vie donne moi ta bourse !");
		int montant = commercant.seFaireExtorquer();
		super.gagnerArgent(montant);
		super.parler("J’ai piqué les " + montant + " sous de "+ commercant.getNom() + ", ce qui me fait " + getArgent() +" sous dans ma  poche. Hi ! Hi ! ");
	}

	public String getClan() {
		return clan;
	}
	public int getReputation() {
		return reputation;
	}
	
	public void gagner(int gain) {
		super.parler("Ce ronin pensait vraiment battre " + getNom() + " du clan des " + getClan()+ " ?\n Je l'ai dépouillé de ses " + gain + " sous.");
		super.gagnerArgent(gain);
		reputation++;
	}
	
	public int perdre() {
		int somme = this.getArgent();
		super.perdreArgent(this.getArgent());
		reputation--;
		this.parler("J’ai perdu mon duel et mes " + somme + " sous, snif... J'ai déshonoré le clan des " + this.getClan());
		return somme;
	}
}
