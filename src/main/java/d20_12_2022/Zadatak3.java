package d20_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

//        3. Napisati program koji od korisnika ucitava brojeve sve dok
//        ne unesu bar dve dvojke ili tri jedinice.
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:0
//        Unesite broj:2
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto dve dvojke)
//
//        Primer izvrsenja 1:
//        Unesite broj:1
//        Unesite broj:2
//        Unesite broj:1
//        Unesite broj:3
//        Unesite broj:1
//        Kraj programa.
//        (Objasnjenje: Kraj jer je uneto tri jedinice)

        Scanner mojs = new Scanner(System.in);

        int jedinice=0,dvojke=0;

        while (jedinice!=3 && dvojke!=2) {
            System.out.print("Unesite broj:");
            int broj = mojs.nextInt();

            if (broj==1) {
                jedinice++;
            } else if (broj==2) {
                dvojke++;
            }

        }
        System.out.println("Kraj programa.");

    }
}