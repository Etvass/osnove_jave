package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak4 {
    public static void main(String[] args) {

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
