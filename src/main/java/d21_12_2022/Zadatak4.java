package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

//        4. . Napisati program koji ucitava niz A duzine N i broj X.
//        Nakon unosa treba ispisati indekse onih clanova niza koji su jednaki broju X.
//                Primer izvrsenja:
//        Unesite N: 5
//        Unesite broj: 1
//        Unesite broj: 3
//        Unesite broj: 7
//        Unesite broj: 3
//        Unesite broj: 9
//        Unesite X: 3
//
//        Rezultat: Elementi niza A koji su jednaki broju X imaju indekse:
//        1, 3


        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> listaX = new ArrayList<Integer>();

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = mojs.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = mojs.nextInt();

            A.add(broj);
        }

        System.out.print("Unesite X: ");
        int x = mojs.nextInt();

        for (int i = 0; i < n; i++) {
            if (A.get(i)==x) {
                listaX.add(i);
            }
        }
        System.out.println("Elementi niza A koji su jednaki broju X imaju indekse:");
        for (int i = 0; i < listaX.size(); i++) {
            if (i== listaX.size()-1) {
                System.out.print(listaX.get(i));
            }else {
                System.out.print(listaX.get(i)+", ");
            }
        }


    }
}
