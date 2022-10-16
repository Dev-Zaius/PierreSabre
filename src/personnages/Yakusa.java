package personnages;

public class Yakusa extends Humain{
	private String clan;
	private int reputation = 0;
	public Yakusa(String nom, String boisson, int argent,String clan) {
		super(nom, boisson, argent);
		// TODO Auto-generated constructor stub
		this.clan = clan;
	}

	public void extorquer(Commercant commercant) {
		super.argent = commercant.seFaireExtorquer();
		super.parler("Je viens d'extorquer ce malheureux : " + commercant.getNom());
	}

	public String getClan() {
		return clan;
	}
	public int getReputation() {
		return reputation;
	}
	
	public void gagner() {
		super.parler("Victoire !");
		reputation++;
	}
	
	public int perdre() {
		int somme = super.getArgent();
		super.setArgent(0);
		reputation--;
		return somme;
	}
}
