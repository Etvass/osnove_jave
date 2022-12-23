package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5ZaVezbanje {
    public static void main(String[] args) {

//        5. . (Za vezbanje) Napisati program koji ucitava niz a duzine N. Nakon unosa niza a, formira se niz b tako sto se prva 3 elementa niza a kopiraju u niz b,
//                a ostale elemente niza b ispuniti jedinicama.(niz b je iste duzine kao i niz a)
//
//
//        Unesite N: 6
//        Unesite broj: 1
//        Unesite broj: 5
//        Unesite broj: 2
//        Unesite broj: 7
//        Unesite broj: 8
//        Unesite broj: -1
//
//        Niz a: 1, 5, 2, 7, 8, -1
//        Niz b: 1, 5, 2, 1, 1, 1

        ArrayList<Integer> a = new ArrayList<Integer>();
        ArrayList<Integer> b = new ArrayList<Integer>();

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = mojs.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = mojs.nextInt();
            a.add(broj);

            if (i<3) {
                b.add(broj);
            }else {
                b.add(1);
            }

        }
        System.out.print("Niz a: ");
        for (int i = 0; i < n; i++) {
            if (i==n-1) {
                System.out.print(a.get(i));
            }else {
                System.out.print(a.get(i)+", ");
            }
        }
        System.out.println();
        System.out.print("Niz b: ");
        for (int i = 0; i < n; i++) {
            if (i==n-1) {
                System.out.print(b.get(i));
            }else {
                System.out.print(b.get(i)+", ");
            }
        }

    }
}
