package Personnages.principaux;
import Personnages.Humain;

public class Yakuza extends Humain {
	
	//partie declaration 
	private String clan;
	private int reputation;
	
	//redefinition du constructeur par default  
	public Yakuza(String nom, int argent, String boisson, String clan) {
		super(nom,argent,boisson);
		this.clan=clan;
		this.reputation=0; //demander a jp si je peut le mettre dans la decla
	}
	
	//partie getteur 
	public String getClan() {
		return this.clan;
	}
	public int getReputation() {
		return this.reputation;
	}
	
	//partie methodes
	
	public void extorquer(Commercant c) {
		this.gagnerArgent(c.getArgent());
		c.perdreArgent(c.getArgent());
		this.reputation+=1;
		parler("je viens d'extorquer "+c.getNom()+" \n");
	}
	
	public void gagnerDuel() {
		this.reputation+=1;
		parler("J'ai gagner mon duel");
	}
	
	public void perdreDuel() { // retourne un entier WTF???
		this.perdreArgent(this.getArgent());
		this.reputation-=1;
		parler("j'ai perdu en duel");
	}

	@Override 
	public void direBonjour() {
		super.direBonjour();
		parler("mon clan est le clan :"+this.getClan()+"\n");
	}
	
}
