package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        2. .Zadatak
//        Napisati program koji ucitava N brojeva i smesta ih u niz.
//        Zatim, iz niza, broji koliko je parnih brojeva uneto. brojeve unosi korisnik.
//                Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 4
//        Unesite broj: 7
//        Unesite broj: 8
//        U nizu ima 2 parna broja.

        ArrayList<Integer> brojevi = new ArrayList<Integer>();

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int duzNiza = mojs.nextInt();
        int parni=0;

        for (int i = 0; i < duzNiza; i++) {
            System.out.print("Unesite broj: ");
            int broj = mojs.nextInt();

            brojevi.add(broj);

            if (broj%2==0) {
                parni++;
            }
        }

        if (parni<5) {
            System.out.println("U nizu ima "+parni+" parna broja.");
        }else {
            System.out.println("U nizu ima "+parni+" parnih brojeva.");
        }


    }
}
