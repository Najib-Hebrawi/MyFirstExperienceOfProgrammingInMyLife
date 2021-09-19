package while_traning;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        // erklær variable
        String ugeDag;
        String out;

        // indlæs

        System.out.println("indtast ugedag (afslut ved at skrive \"slut\"): ");

        ugeDag = input.next();

        // konverter til små bogstaver
        ugeDag = ugeDag.toLowerCase();


        while (!ugeDag.equals("slut")) // IKKE ugeDag != “slut”
        {
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

            // ny indlæsning
            System.out.println("indtast ugedag (afslut ved at skrive \"slut\"): ");
            ugeDag = input.next();

            // konverter til små bogstaver
            ugeDag = ugeDag.toLowerCase();
        }
        // sig Farvel
        System.out.println("Farvel");
        // luk scanner
        input.close();
    }

}
