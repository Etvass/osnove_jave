package d20_12_2022;

import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        4. Napisati program koji proverava uparenost zagrada.
//        Korisnik unosi matematicku formulu sve dok ne unese znak =.
//        Korisnik unosi svaki karakter jednacine posebno i na kraju programa se
//        ispisuje da li su sve zagrade uparene.
//        Formula koja se koristi u primeru je:
//        Primer izvrsenja:
//        Unos: (
//                Unos: 2
//        Unos: *
//        Unos: (
//                Unos: 1
//        Unos: +
//                Unos: 3
//        Unos: )
//        Unos: )
//        Unos: =
//        Zagrade su uparene
//                (Objasnjenje: Imamo isti broj otvorenih i zatvorenih zagrada)
//
//        Primer izvrsenja 2:
//        Unos: (
//                Unos: 2
//        Unos: *
//        Unos: (
//                Unos: 1
//        Unos: +
//                Unos: 3
//        Unos: )
//        Unos: =
//        Zagrade nisu uparene
//                (Objasnjenje: fali poslednja zagrada iz formule)

        Scanner mojs = new Scanner(System.in);

        String karakter="nebitno";
        int otvzagr = 0;
        int ztvzagr = 0;

        while (!(karakter.equals("="))) {
            System.out.print("Unos: ");
            karakter = mojs.next();

            if (karakter.equals("(")) {
                otvzagr++;
            }else if (karakter.equals(")"))
                ztvzagr++;
        }
        if (otvzagr==ztvzagr) {
            System.out.println("Zagrade su uparene");
        }else {
            System.out.println("Zagrade nisu uparene");
        }

    }
}