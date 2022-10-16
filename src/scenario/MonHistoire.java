package scenario;

import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakusa;

public class MonHistoire {

	public static void main(String[] args) {
		Humain humain = new Humain("Prof", "Porto", 10);
		
		humain.direBonjour ();
		humain.boire ();
		
		Commercant commercant = new Commercant("Marchand", 35);
		commercant.direBonjour ();
		
		Yakusa yakusa = new Yakusa("Yaku le noir", "biere",
		                    42, "WarSong");
		
		yakusa.direBonjour();
		
		yakusa.extorquer(commercant);
		
		Ronin ronin = new Ronin("Roro", "sake", 61);
		
		ronin.donnerArgent(commercant, 10 );
		ronin.duel(yakusa);
		ronin.direBonjour ();

	}

}
