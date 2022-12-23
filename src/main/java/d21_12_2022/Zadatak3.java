package d21_12_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<Integer> veciOdNule = new ArrayList<Integer>();

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = mojs.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Unesite broj: ");
            int broj = mojs.nextInt();

            A.add(broj);

            if (broj>0) {
                veciOdNule.add(broj);
            }
        }
        System.out.println();
        System.out.print("Brojevi veci od nule u nizu A su: ");
        for (int i = 0; i < veciOdNule.size(); i++) {
            if (i==veciOdNule.size()-1) {
                System.out.println(veciOdNule.get(i)+".");
            }else {
                System.out.print(veciOdNule.get(i)+", ");
            }
            
        }

    }
}
