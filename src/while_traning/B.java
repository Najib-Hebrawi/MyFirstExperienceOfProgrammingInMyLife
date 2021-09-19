package while_traning;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {

        /*
        Vi bruger en while(true) og foretager et “break” ud
        af løkken når brugeren indtaster slutbetingelsen.
         Denne konstruktion bruges typisk af mere erfarne programmører


         */

        Scanner input = new Scanner(System.in);

        // erklær variable
        String ugeDag;
        String out;

        while (true) {

            System.out.println("indtast ugedag (afslut ved at skrive \"slut\"): ");
            ugeDag = input.next();

            // konverter til små bogstaver
            ugeDag = ugeDag.toLowerCase();

            // test om slutbetingelse er opfyldt
            if (ugeDag.equals("slut")) {
                // sig farvel
                System.out.println("Farvel");
                // afbryd løkke
                break;
            }

            switch (ugeDag) {
                case "mandag":
                case "tirsdag":
                case "onsdag":
                case "torsdag":
                case "fredag":
                    out = "Det er arbejdsdag";
                    break;
                case "lørdag":
                case "søndag":
                    out = "Det er weekend";
                    break;
                default: out = "Kender ikke denne dag";
            }
            // udskriv resultat
            System.out.println(out);
        }
        // luk scanner
        input.close();
    }
}


