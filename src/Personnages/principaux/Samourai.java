package Personnages.principaux;
import Personnages.principaux.Ronin;

public class Samourai extends Ronin{
	
	private String seigneur;

	public Samourai(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson);
		this.seigneur=seigneur;
	}
	
	public String getSeigneur() {
		return this.seigneur;
	}
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("je sert le seigneur "+this.getSeigneur()+"\n");
	}
	
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de "+boisson+" ! GLOUPS ! \n");
	}
}
