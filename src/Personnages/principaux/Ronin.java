package Personnages.principaux;
import Personnages.Humain;

public class Ronin extends Humain{
	
	private int honneur;
	
	public Ronin(String nom, int argent, String boisson) {
		super(nom,argent,boisson);
		this.honneur=1;
	}
	
	public void donner(int n, Commercant c) {
		if (n<=this.getArgent()){
			c.gagnerArgent(n);
			this.perdreArgent(n);
		}
		else {
			parler("le yakuza a pas assez");
		}
	}
	
	public void provoquer(Yakuza y) {
		if ( (this.honneur)*2>y.getReputation()) {
			parler("le ronin "+this.getNom()+ "a gagner face a "+y.getNom()+"\n");
			int tmp=y.getArgent();
			this.gagnerArgent(tmp);
			y.perdreArgent(tmp);
			this.honneur+=1;
			y.perdreDuel();
		}
		else {
			if(this.honneur==0) {
				parler("ta plus d'honneur");
				this.honneur-=1;
			}
			else {
				this.honneur-=1;
			}
			parler("je rale a cause de ma defaite face a "+y.getNom()+"\n");
			y.gagnerDuel();
		}
	}

}
