package Histoire;
import Personnages.Humain;
import Personnages.principaux.*;
public class MonHistoire {

	public static void main(String [] args) {    
		  Humain humain = new Humain("Prof", 10, "Porto");
		  humain.direBonjour();
		  humain.boire();
		  Commercant commercant = new Commercant("Marchand", 35);
		  commercant.direBonjour();
		  Yakuza yakuza = new Yakuza("Yaku␣le␣noir", 42,
		                             "biere", "WarSong");
		  yakuza.direBonjour();
		  yakuza.extorquer(commercant);
		  Ronin ronin = new Ronin("Roro", 61, "sake");
		  ronin.donner(10, commercant );
		  ronin.provoquer(yakuza);
		  ronin.direBonjour();
		}
}

}
