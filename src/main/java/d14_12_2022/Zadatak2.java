package d14_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        System.out.println("------POCETAK-------");

        System.out.print("Unesite a: ");
        int a = mojs.nextInt();
        System.out.print("Unesite b: ");
        int b = mojs.nextInt();

        if ( b == 1 ) {
            a = a + 10;
        }
        else if ( b == 2 ) {
            a = a - 20;
        }

        System.out.println("Nova vrednost za a je: " + a);

        System.out.println("------KRAJ-----------");
    }
}
