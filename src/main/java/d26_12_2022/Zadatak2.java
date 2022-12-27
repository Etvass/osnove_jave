package d26_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

//        2. Napisati metodu koja vrsi spajanje punog imena i vraca tu vrednost.
//        Metoda od parametara prima ime i prezime (2 parametra) i
//        vraca jedan string tako sto spoji ime i prezime. METODA NISTA NE STAMPA.
//        Primer poziva: Ako se metoda pozvoe za ime=”Milan” i
//        prezime=”Jovanovic”, metoda vraca “Milan Jovanovic”

        String konacno = imeIPrezime("Luka","Andrejevic");
        System.out.println(konacno);

    }

    public static String imeIPrezime (String ime, String prezime) {

        String punoIme = ime +" "+ prezime;
        return punoIme;

    }

}
