package Personnages.principaux;
import Personnages.Humain;
import Personnages.secondaires.*;
import Personnages.principaux.*;
public class Test {

	public static void main(String[] args) {

	Humain H1 = new Humain("Laurent",40,"coca");
	
	Commercant C1 = new Commercant("Malic",24);
	C1.direBonjour();
	
	H1.direBonjour();
	H1.boire();
	
	Yakuza Y1 = new Yakuza("Yaku␣le␣noir", 42,"biere", "WarSong");
	Y1.direBonjour();
	Y1.extorquer(C1);
	
	Ronin R1 = new Ronin("Roro", 61, "sake");
	R1.donner(10, C1 ); // commercant C1 a 10 argent
	R1.provoquer(Y1);
	R1.direBonjour();
	
	Traitre T1 = new Traitre("TOM", 200, "pastis", "Iliass");
	T1.extorquer(C1, 4); //un commercant ne doit pas pouvoir etre en neg
	System.out.println(C1.getArgent());
	T1.direBonjour();
	T1.faireLeGentil(H1, 5);
	System.out.println(H1.getArgent());
	System.out.println(T1.getArgent());
	
	
	Samourai S1 = new Samourai("yang", 30, "soya sauce", "Julien");
	S1.boire("coca bien frais");
	S1.direBonjour();
	
	
	GrandMere GMK= new GrandMere("GMK");
	GMK.direBonjour();
	GMK.faireConnaissanceAvec(H1);
	GMK.faireConnaissanceAvec(T1);
	GMK.faireConnaissanceAvec(S1);
	GMK.faireConnaissanceAvec(C1);
	GMK.faireConnaissanceAvec(Y1);
	GMK.ragoter();




	
	}	 
}
