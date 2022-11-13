package scenario;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakusa;

public class MonHistoire {

	public static void main(String[] args) {
		

	System.out.println("\n-------------------1-Tous humains !---------------------\n");
	Humain prof = new Humain("Prof","kombucha",54);
	prof.direBonjour();
	prof.acheter("une boisson", 12);
	prof.boire();
	prof.acheter("un jeu", 2);
	prof.acheter("un kimono", 50);
	System.out.println("\n-------------------2-Commerçants, Ronins, et Yakusas !--\n");
	Commercant marco = new Commercant("Marco",20);
	marco.direBonjour();
	marco.seFaireExtorquer();
	marco.recevoir(15);
	marco.boire();
	System.out.println("");
	Yakusa yaku = new Yakusa("Yaku Le Noir","whisky",4,"Warsong");
	yaku.direBonjour();
	yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
	yaku.extorquer(marco);
	System.out.println("");
	Ronin roro = new Ronin("Roro","shochu",60);
	roro.direBonjour();
	roro.donner(marco);

	}

}
