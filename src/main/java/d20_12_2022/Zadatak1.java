package d20_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        boolean exit = true;

        while (exit) {
            System.out.print("Unesite broj: ");
            int x = mojs.nextInt();

            if (x==0) {
                exit = false;
                System.out.println("Kraj programa jer je uneta nula.");
            }
            else if (x<0) {
                x = x * -1;
                System.out.println("Apsolutna vrednost je "+x);
            }else {
                System.out.println("Apsolutna vrednost je "+x);
            }


        }

    }
}