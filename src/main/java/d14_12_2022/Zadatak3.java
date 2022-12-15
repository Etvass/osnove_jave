package d14_12_2022;

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        System.out.println("-----------POCETAK------------");

        System.out.print("Unesite X za T1: ");
        int xT1 = mojs.nextInt();
        System.out.print("Unesite Y za T1: ");
        int yT1 = mojs.nextInt();
        System.out.print("Unesite X za T2: ");
        int xT2 = mojs.nextInt();
        System.out.print("Unesite Y za T2: ");
        int yT2 = mojs.nextInt();
        System.out.print("Unesite X za M: ");
        int xM = mojs.nextInt();
        System.out.print("Unesite Y za M: ");
        int yM = mojs.nextInt();

//        Ovde su napisane cetiri moguce situacije.
//  1.___________________________________________________________________
        if (xT1<xT2 && yT1>yT2) {
            if (xM<xT2 && yM>yT2 && xM>xT1 && yM<yT1) {
                System.out.println("Kliknuto je unutar forme!");
            }else {
                System.out.println("Nije kliknuto unutar forme.");
            }
//  2.____________________________________________________________________
        }else if (xT1<xT2 && yT1<yT2) {
                if (xM>xT1 && yM>yT1 && xM<xT2 && yM<yT2) {
                    System.out.println("Kliknuto je unutar forme!");
                }else {
                    System.out.println("Nije kliknuto unutar forme.");
                }
//  3._____________________________________________________________________
        }else if (xT1>xT2 && yT1>yT2) {
                if (xM>xT2 && yM>yT2 && xM<xT1 && yM<yT1) {
                    System.out.println("Kliknuto je unutar forme!");
                }else {
                    System.out.println("Nije kliknuto unutar forme.");
                }
//  4.______________________________________________________________________
        }else if (xT1>xT2 && yT1<yT2) {
                if (xM<xT1 && yM>yT1 && xM>xT2 && yM<yT2) {
                    System.out.println("Kliknuto je unutar forme!");
                }else {
                    System.out.println("Nije kliknuto unutar forme.");
                }
        }
//  _________________________________________________________________________
        System.out.println("-----------KRAJ------------");
    }
}
