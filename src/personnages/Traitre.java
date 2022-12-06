package personnages;
import java.util.Random;

public class Traitre extends Samourai{
	private int niveauTraitrise;
	int i;

	public Traitre(String seigneur, String nom, String boisson, int argent) {
		super(seigneur, nom, boisson, argent);
		this.niveauTraitrise = 0;
	}
	
	public void creerTest() {i = 1;}
	
	public void ranconner(Commercant commercant) {
		if (niveauTraitrise < 3) {
			int argentCommercant = commercant.getArgent();
			int argentRanconner = (argentCommercant * 2 ) / 10;
			commercant.perdreArgent(argentRanconner);
			gagnerArgent(argentRanconner);
			parler("Si tu veux ma protection contre les Yakuzas, il va falloir payer ! Donne-moi "
					+ argentRanconner +  " sous ou gare à toi !");
			parler("Tout de suite grand " + getNom() + ".");
			niveauTraitrise++;
		} else {
			parler("Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !");
		}
	}
	
	
	public void faireLeGentil() {
		if (nbConnaissance < 1) {
			parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Sif.");
		} else {
			int don = argent / 20;
			Random rand = new Random();
			Humain ami = memoire[rand.nextInt(nbConnaissance)];
			String nomAmi = ami.getNom();
			parler("Il faut absolument remonter ma cote de confiance. Je vais me faire ami ami avec "+ nomAmi +".");
			parler("Bonjour l'ami ! Je voudrais vous aider en vous donnant " + don + " sous.");
			ami.gagnerArgent(don);
			perdreArgent(don);
			ami.parler("Merci " + this.getNom() + ". Vous êtes quelqu'un de bien.");
			if (niveauTraitrise > 1)
				niveauTraitrise--;
		}
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("Mais je suis un traître et mon niveau de traîtrise est : " + niveauTraitrise + ". Chut !");
	}
}
