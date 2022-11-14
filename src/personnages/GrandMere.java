package personnages;
import java.util.Random;

public class GrandMere extends Humain {

	public GrandMere(String nom, int argent) {
		super(nom, "tisane", argent);
	}
	
	private String humainHasard(){
		return TypeHumain.flair();
	}
	@Override
	protected void memoriser(Humain humain) {
		if (nbConnaissance < 5) {
				memoire[nbConnaissance] = humain;
				nbConnaissance++;
		} else 
			parler("Oh ma tête ! Je ne peux plus retenir le nom d'une personne supplémentaire !");
		
	}
	
	public void ragoter() {
		String type;
		for (int i = 0 ; i < nbConnaissance ; i++) {
			if (memoire[i] instanceof Traitre)
				type = TypeHumain.TRAITRE.toString() + ". Petit chenapan !";
			else
				type = humainHasard();
			parler("Je crois que " + memoire[i].getNom() + " est un " + type);
		}
	}
	
	public enum TypeHumain {
		COMMERCANT("commerçant"),HUMAIN("habitant"),RONIN("ronin"),SAMOURAI("samouraï"),TRAITRE("traitre");
		

		private String nom;
		private TypeHumain(String nom) {
			this.nom = nom;
		}
		public String toString() {
			return this.nom;
		}

		public static String flair() {
			Random rand = new Random();
			TypeHumain[] types = TypeHumain.values();
			return types[rand.nextInt(3)].toString();
		}
	}
}
