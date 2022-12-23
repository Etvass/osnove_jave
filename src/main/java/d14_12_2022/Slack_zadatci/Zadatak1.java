package d14_12_2022.Slack_zadatci;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);



        System.out.print("Unesite ukupan broj rezultata: ");
        int ukupno = mojs.nextInt();

        System.out.print("Unesite broj rezultata po strani: ");
        int poStrani = mojs.nextInt();

        System.out.print("Unesite stranu: ");
        int strana = mojs.nextInt();

        int praviBrojStrana = (ukupno/poStrani)-((ukupno/poStrani)/10)+1;

        if (strana>praviBrojStrana) {
            System.out.println("No results for page "+strana);
        }


        double brojStranica = ukupno / poStrani;

        double rezultatiNaStraniPocetak = strana*poStrani-poStrani+1;

        double rezultatiNaStraniKraj = strana*poStrani;

        System.out.println("Prikaz: Showing "+rezultatiNaStraniPocetak+" to "
                                             +rezultatiNaStraniKraj+" of "
                                             +ukupno+" entries");



    }
}
