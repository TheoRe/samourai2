package Personnages.secondaires;
import Personnages.Humain;
import Personnages.principaux.Commercant;
import Personnages.principaux.Samourai;
import java.util.Random;

public class GrandMere extends Humain{

	private Humain [] memoire;
	Random rand = new Random();
	private int nbConnaissance;
	
	 public GrandMere(String nom) {
		super(nom, 10, "tisane");
		this.memoire= new Humain[29];
	}
	
	private String humainHasard() {
        int choix = rand.nextInt(7);

        switch (choix) {
            case 0:
                return "Ronin";
            case 1:
                return("Ninja");
            case 2:
                return("Yakusa");
            case 3:
                return("Grand-Mere");
            case 4:
            	return("Commercant");
            case 5:
            	return("Colporteur");
            case 6:
            	return("Traitre");
            case 7:
            	return("Samourai");
            default:
            	return("Choix non attendu");
  
        }
	}
	
	public void ragoter() {
		int i=0;
		while( i != this.nbConnaissance) {
			if(this.memoire[i] instanceof Traitre) {
				parler("je suis sur que "+this.memoire[i].getNom()+" est un traitre\n");
				i++;
			}
			else {
				parler("je crois que "+this.memoire[i].getNom()+" est un "+humainHasard()+"\n");
				i++;
			}
	}
}
	
	
	public void faireConnaissanceAvec(Humain h) {
		if(this.nbConnaissance<=29) {
			this.memoire[this.nbConnaissance]=h;
			this.nbConnaissance+=1;
		}
	}
}
