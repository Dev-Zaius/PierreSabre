package personnages;

public class Traitre extends Samourai{
	private int niveauTraitrise;

	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
		this.niveauTraitrise = 0;
	}
	
	public void ranconner(Commercant commercant) {
		int argentCommercant = commercant.getArgent();
		int argentRanconner = (argentCommercant * 2 ) / 10;
		commercant.perdreArgent(argentRanconner);
		gagnerArgent(argentRanconner);
		parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi"
				+ argentRanconner + " sous ou gare à toi !");
		parler("Tout de suite grand" + getNom() + ".");
	}
	
	public void faireLeGentil() {
		
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mon niveau de traîtrise est de " + niveauTraitrise);
	}
}
