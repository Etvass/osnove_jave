package d16_12_2022;

import java.util.Scanner;

public class Zadatak4_ZaVezbanje {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite dimenzije table: ");
        int x = mojs.nextInt();

        int brojpolja = x*x;

        for (int i = 1; i <= brojpolja; i++) {
            if (i%x==0) {
                System.out.println("_|");
            }else {
                System.out.print("_|");
            }
        }

    }
}
