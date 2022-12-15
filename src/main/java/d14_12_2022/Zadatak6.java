package d14_12_2022;

import java.util.Scanner;

public class Zadatak6 {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        String p = "#";

//------promenljiva_a----------------------

        System.out.print("Unesite a: ");
        int a = mojs.nextInt();

        if (a<0) {
            p=a+" "+p;
        }else {
            p=p+" "+a;
        }
        System.out.println(p);

//------promenljiva_b----------------------

        System.out.print("Unesite b: ");
        int b = mojs.nextInt();

        if (b<0) {
            p=b+" "+p;
        }else {
            p=p+" "+b;
        }
        System.out.println(p);

//------romenljiva_c----------------------

        System.out.print("Unesite c: ");
        int c = mojs.nextInt();

        if (c<0) {
            p=c+" "+p;
        }else {
            p=p+" "+c;
        }
        System.out.println(p);

//------promenljiva_d----------------------

        System.out.print("Unesite d: ");
        int d = mojs.nextInt();

        if (d<0) {
            p=d+" "+p;
        }else {
            p=p+" "+d;
        }
        System.out.println("String p ima vrednost = "+p);



    }
}
