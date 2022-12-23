package d16_12_2022.ZaVezbanjeSaCasa;

import java.util.Scanner;

public class SlackZaVezbanje {
    public static void main(String[] args) {

//      Mina ga je radila, nisam ja

       Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite sat: ");
        int sat = mojs.nextInt();

        System.out.print("Unesite minut: ");
        int minut = mojs.nextInt();

        int sat_Minut = sat * 60;


        System.out.println("Aktivirace se u: ");


        int prvoZvonjenje=sat_Minut+minut;
        System.out.println(prvoZvonjenje/60+":"+prvoZvonjenje%60);

          for (int i =0; i<6; i++) {
               prvoZvonjenje=prvoZvonjenje+5;
               System.out.println(prvoZvonjenje/60+":"+prvoZvonjenje%60);
         }

    }


}









