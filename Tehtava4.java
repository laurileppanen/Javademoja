package NeljannetDemot;
import java.util.Scanner;
import java.util.ArrayList;

// Luo luokka Huonekalu, jolla on attribuutteina väri, pituus ja leveys.
// Huonekaluluokalla tulee olla havainnointi- ja asetusmetodit, sekä toString metodi.
// Luokalla on aliluokka Sohva, jolla on uudet attribuutit hinta ja muoto.
// Ohjelman tulee kysyä käyttäjältä Sohvaluokan parametreja ja tallentaa ne Sohva-olioon.
// Lopuksi tulosta uusi Sohva-olio.



public class Tehtava4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.out.print("Anna väri: ");
			Scanner lukija = new Scanner(System.in);
	        String vari = lukija.nextLine();
	        
	        System.out.print("Anna pituus: ");
			Scanner lukija1 = new Scanner(System.in);
	        double pituus = Double.valueOf(lukija1.nextLine());
	        
	        System.out.print("Anna leveys: ");
			Scanner lukija2 = new Scanner(System.in);
	        double leveys = Double.valueOf(lukija2.nextLine());
	        
	        System.out.print("Anna hinta: ");
			Scanner lukija3 = new Scanner(System.in);
	        double hinta = Double.valueOf(lukija3.nextLine());
	        
	        System.out.print("Anna muoto: ");
			Scanner lukija4 = new Scanner(System.in);
	        String muoto = lukija4.nextLine();
		

		    Sohva uusi = new Sohva(vari, pituus, leveys, hinta, muoto);
		    System.out.println(uusi);
	}

}

class Huonekalu {
	String vari;
	double pituus;
	double leveys;
	
	public Huonekalu(String vari, double pituus, double leveys) {
		this.vari = vari;
		this.pituus = pituus;
		this.leveys = leveys;
	}
	
	public String getVari() {
		return vari;
	}
	
	public double getPituus() {
		return pituus;
	}
	
	public double getLeveys() {
		return leveys;
	}
	
	public void setVari(String vari) {
		this.vari = vari;
	}
	
	public void setPituus(double pituus) {
		this.pituus = pituus;
	}
	
	public void setVari(double leveys) {
		this.leveys = leveys;
	}
}


class Sohva extends Huonekalu {
	double hinta;
	String muoto;
	
	public Sohva(String vari, double pituus, double leveys, double hinta, String muoto) {
		super(vari, pituus, leveys);
		this.hinta = hinta;
		this.muoto = muoto;
	}
	
	public double getHinta() {
		return hinta;
	}
	
	public String getMuoto() {
		return muoto;
	}
	
	public void setHinta(double hinta) {
		this.hinta = hinta;
	}
	
	public void setMuoto(String muoto) {
		this.muoto = muoto;
	}
	
	@Override
    public String toString() {
        return "Väri: " + this.vari + ", Pituus: " + this.pituus + "m, " + "Leveys: " + this.leveys + "m, " + "Hinta: " + this.hinta + "e, " + "Muoto: " + this.muoto  ;
    }
}





