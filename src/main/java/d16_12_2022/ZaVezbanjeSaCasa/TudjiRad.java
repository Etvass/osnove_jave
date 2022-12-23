package d16_12_2022.ZaVezbanjeSaCasa;

import java.util.Scanner;

public class TudjiRad {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int duzina;
        int trenutnoVreme;
        int procenat;

        System.out.println("Unesite duzinu videa (s): ");
        duzina = s.nextInt();
        System.out.println("Unesite trenutno vreme videa (s): ");
        trenutnoVreme = s.nextInt();
        procenat = (100 * trenutnoVreme) / duzina;

        for (int i = 1; i <= 100; i++) {
            if (i <= procenat) {
                System.out.print("*");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();
        System.out.print((trenutnoVreme / 60) + ":");
        System.out.print((trenutnoVreme % 60) / 10);
        System.out.print((trenutnoVreme % 60) % 10);
        System.out.print(" / ");
        System.out.print((duzina / 60) + ":");
        System.out.print((duzina % 60) / 10);
        System.out.print((duzina % 60) % 10);

    }
}
