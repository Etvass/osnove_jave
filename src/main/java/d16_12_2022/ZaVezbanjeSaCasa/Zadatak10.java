package d16_12_2022.ZaVezbanjeSaCasa;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite duzinu videa (s): ");
        int dv = mojs.nextInt();

        System.out.print("Unesite trenutno vreme videa (s): ");
        int tv = mojs.nextInt();

        int pv = dv/100;

        int po = tv/pv;

        for (int i = 0; i<100; i++) {
            if (i<=po) {
                System.out.print("*");
            }else {
                System.out.print("_");
            }
        }

    }
}
