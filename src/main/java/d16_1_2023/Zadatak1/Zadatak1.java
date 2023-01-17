package d16_1_2023.Zadatak1;

import java.util.Scanner;

public class Zadatak1 {

//    .Zadatak
//    Kreirati klasu Osoba koja ima:
//            • ime i prezime
//    • jmbg
//    • godinu rodjenja
//    • default-ni konstuktor
//    • konstuktor sa parametrima
//    • gettere i settere
//    • metodu stampaj koja stampa u formatu:
//            (ime i prezime), (jmbg), (godina rodjenja)
//
//    Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//            • broj (broj koji igrac nosi)
//    • poziciju koju igra (odbrambeni, napadac, … )
//    • kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    • default-ni konstuktor
//    • konstuktor sa parametrima
//    • gettere i settere za broj, kapiten i poziciju
//    • metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//    Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//            • godine iskustva
//    • tip trenera (kondicioni, za igru, pomocni, personalni)
//    • metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//    U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.

//    (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera,
//    na kraju programa ispisati sve igrace i trenere. Podatke za igrace i
//    trenere unosi korisnik sa tastature.

    public static void main(String[] args) {

        Scanner mojs = new Scanner(System.in);

        System.out.print("Unesite ime i prezime Srpskog trenera (sa crticom - umesto razmaka): ");
        String imeSrpskogTrenera = mojs.next();
        System.out.print("Unesite jmbg Srpskog trenera: ");
        String jmbgSTrenera= mojs.next();
        System.out.println("Unesite sledece podatke istim redosledom (sa crticom - umesto razmaka):" +
                " \ngodinu rodjenja\n" +
                "godine iskustva i tip Srpskog treenra: ");

        Trener srpski = new Trener(imeSrpskogTrenera,jmbgSTrenera,
                mojs.nextInt(),mojs.nextInt(),mojs.next());
        Trener italijanski = new Trener("Fernando Peloni","45698712365",
                1976,30,"za igru");

        Igrac srpskiFudbaler = new Igrac("Nikola Petrovic",
                "61854379285",1995,14,"napadac",false);
        Igrac italijanskiFudbaler = new Igrac("Luidji Djepete",
                "5109873520",1998,22,"napadac",true);

        srpski.stampaj();
        System.out.println();
        italijanski.stampaj();
        System.out.println();
        System.out.println();
        srpskiFudbaler.stampaj();
        System.out.println();
        italijanskiFudbaler.stampaj();

    }
}
