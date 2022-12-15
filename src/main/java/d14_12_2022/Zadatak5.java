package d14_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite a: ");
        double a = mojs.nextDouble();
        System.out.print("Unesite b: ");
        double b = mojs.nextDouble();
        System.out.print("Unesite operator: ");
        String operator = mojs.next();
        double r;

        if (operator.equals("+")) {
            r=a+b;
            System.out.println("Rezultat: "+r);
        }else if (operator.equals("-")) {
            r=a-b;
            System.out.println("Rezultat: "+r);
        }else if (operator.equals("*")) {
            r=a*b;
            System.out.println("Rezultat: "+r);
        }else if (operator.equals("/")) {
            r=a/b;
            System.out.println("Rezultat: "+r);
        }


    }
}
