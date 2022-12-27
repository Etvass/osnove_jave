package d26_12_2022;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        String konacno = imeIPrezime("Luka","Andrejevic");
        System.out.println(konacno);

    }

    public static String imeIPrezime (String ime, String prezime) {

        String punoIme = ime +" "+ prezime;
        return punoIme;

    }

}
