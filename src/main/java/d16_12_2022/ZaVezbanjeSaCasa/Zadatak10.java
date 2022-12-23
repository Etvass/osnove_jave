package d16_12_2022.ZaVezbanjeSaCasa;

import java.util.Scanner;

public class Zadatak10 {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite duzinu videa (s): ");
        double dv = mojs.nextInt();

        System.out.print("Unesite trenutno vreme videa (s): ");
        double tv = mojs.nextInt();


//  ------racunanje-procenata-za-timeline---------

        double jpv = dv/100; //jedan procenat videa

        double po = tv/jpv; //procenat odgledanog

//  ----------------------------------------------

        for (int i = 0; i<100; i++) {
            if (i<=po) {
                System.out.print("*");
            }else {
                System.out.print("_");
            }
        }

//  --------racunanje-vremena---------------------

            int minuti2 = (int)dv/60;
            int sekunde2 = (int)dv%60;

            int minuti1 = (int)tv/60;
            int sekunde1 = (int)tv%60;

//  ----------------------------------------------

        if (dv>60) {
            System.out.println();
            System.out.println(minuti1+":"+sekunde1+"/"+minuti2+":"+sekunde2);
        }else {
            System.out.println();
            System.out.println(minuti1+":"+sekunde1+"/"+minuti2+":"+(int)dv);
        }



    }
}
