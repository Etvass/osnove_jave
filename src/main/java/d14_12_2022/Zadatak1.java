package d14_12_2022;

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite vase ime: ");
        String ime = mojs.next();
        System.out.print("Unesite vase prezime: ");
        String prezime = mojs.next();
        System.out.print("Unesite vasu godinu rodjenja: ");
        int gRodjenja = mojs.nextInt();


        System.out.println(ime + " " + prezime + " - " + gRodjenja + " god");

    }
}
