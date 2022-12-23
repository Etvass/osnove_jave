package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

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
