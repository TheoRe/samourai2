package Personnages.principaux;
import Personnages.Humain;
public class commercant extends Humain {
	
	public commercant(String nom, int argent) {
		super(nom,argent,"thé");
	}
	
	public int seFaireExtorquer() {
		this.perdreArgent(getArgent());
		parler(" le monde est méchant\n");
		return this.getArgent();
	}
	public void recevoir(int argent) {
		parler("merci pour ton seub");
		this.gagnerArgent(argent);
	}

}
