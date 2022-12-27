package d26_12_2022;

import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {

//        5. Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//        Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se
//        / / / / /
//        Napomena: Metoda nista ne vraca.

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite N: ");
        int n = mojs.nextInt();

        System.out.print("Unesite karakter: ");
        String karaketer = mojs.next();

        karakteri(n,karaketer);

    }

    public static void karakteri(int x, String k) {

        for (int i = 0; i < x; i++) {
            System.out.print(k);
        }

    }

}
