package Personnages.secondaires;
import Personnages.Humain;
import Personnages.principaux.Commercant;
import Personnages.principaux.Samourai;

public class Traitre extends Samourai{

	private int traitriseLevel;
	
	public Traitre(String nom, int argent, String boisson, String seigneur) {
		super(nom, argent, boisson,seigneur);
		this.traitriseLevel=0;
	}
	
	public int getTraitriseLevel() {
		return this.traitriseLevel;
	}
	
	public void extorquer(Commercant c, int n) {
		if(this.traitriseLevel<=3 && c.getArgent()>=n) {
			c.perdreArgent(n);
			this.traitriseLevel+=1;
		}
		else {
			parler("j'ai un level de 3");
		}
	}
	
	
	@Override
	public void direBonjour() {
		super.direBonjour();
		parler("level traitrise :"+this.getTraitriseLevel()+"\n");
	}
	
	//pas sur qu'il y est un parametre
	public void faireLeGentil(Humain h,int n) {
		this.perdreArgent(n);
		h.gagnerArgent(n);
		parler("Ami Ami\n");
		if(this.traitriseLevel>=n/10) {
			this.traitriseLevel-=n/10;
		}
	}
}
