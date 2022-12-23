package d16_12_2022.ZaVezbanjeSaCasa;

import java.util.Scanner;

public class drugiputdesetiz {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite duzinu videa (s): ");
        double dv = mojs.nextInt();

        System.out.print("Unesite trenutno vreme videa (s): ");
        double tv = mojs.nextInt();







        double procenatOdgledanogVidea = (tv * 100) / dv;

        for (int i = 0; i<100; i++) {
            if (i<=procenatOdgledanogVidea) {
                System.out.print("*");
            }else {
                System.out.print("_");
            }
        }



    }
}
