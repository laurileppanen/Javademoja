package EkatDemot;
import java.util.*;
import java.text.ParseException;


public class tehtava2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paivakirja salainen = new paivakirja("12345tervemoi");
		salainen.avaa();

	}

}

class paivakirja {
    private final String salasana;
    private boolean onkoKirjauduttu;
    private Scanner lukija;
 
    public paivakirja(String salasana) {
        this.salasana = salasana;
        this.onkoKirjauduttu = false;
        this.lukija = new Scanner(System.in);
    }
 
 
    public void avaa() {
        while (true) {
            if (!onkoKirjauduttu) {
                System.out.println("Anna salasana: ");
                String kirjautuminen = lukija.nextLine();
                if (kirjautuminen.equals(salasana)) {
                    this.onkoKirjauduttu = true;
                    tulostaNakyma();
                } else {
                    System.out.println("Salasana on v��rin");
                }
 
            } 
        }
 
 
    }
 
    private void tulostaNakyma() {
        while (true) {
 
            System.out.println("Valitse numerolla mit� haluat");
            System.out.println("1) Tee uusi merkint�");
            System.out.println("2) Lue p�iv�kirjaa alusta");
            System.out.println("3) Etsi merkinn�t p�iv�m��r�lt�");
            System.out.println("4) Kirjaudu ulos");
            try {
                int valinta = Integer.parseInt(lukija.nextLine());
                
            } catch (NumberFormatException e) {
                System.err.println("Sy�t� numero!");
            }
        }
 
 
    }
    
}



