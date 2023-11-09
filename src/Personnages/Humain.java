package Personnages;

public class Humain {
	
	private String nom;
	private int argent; 
	private String boisson;
	
	public Humain(String n, int a, String b) {
		this.nom=n;
		this.argent=a;
		this.boisson=b;
	}
	

	public String getNom() {
		return this.nom;
	}
	public String getBoisson() {
		return this.boisson;
	}
	
	
	public void parler(String texte) {
		System.out.println("("+this.nom+") - "+texte);
	}

	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+ this.nom+"et j'aime boire du "+this.boisson+"\n");
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+this.boisson+" ! GLOUPS ! \n");
	}
	public int getArgent() {
		return this.argent;
	}

	public void gagnerArgent(int n) {
		this.argent+=n;
	}

	public void perdreArgent(int n) {
		this.argent-=n;
	}
}

