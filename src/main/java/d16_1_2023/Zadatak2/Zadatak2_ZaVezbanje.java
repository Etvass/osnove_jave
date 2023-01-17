package d16_1_2023.Zadatak2;

public class Zadatak2_ZaVezbanje {

//    (Za vezbanje)
//            2. Zadatak
//    Kreirati klasu Karton koja ima:
//            • tip kartona (crveni, zuti)
//    • konstuktore za koje mislite da ce vam trebati
//    • gettere i settere za karton
//
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
//    • niz kartona
//    • kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//    • default-ni konstuktor
//    • konstuktor sa parametrima
//    • gettere i settere za broj, kapiten i poziciju
//    • metodu dodaj karton, gde se dodaje karton u niz
//    • metodu koja vraca broj zutih kartona
//    • metodu koja vraca broj crvenih kartona
//    • metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//
//    U glavnom programu kreirati igraca i dodati mu nekoliko kartona.

    public static void main(String[] args) {

        Igrac prviIgrac = new Igrac("Luka","Andrejevic","28956314720",
                1995,8,"napadac",true);

        Karton prviKarton = new Karton("zuti");
        Karton drugiKarton = new Karton("crveni");
        Karton treciKarton = new Karton("zuti");
        Karton cetvrtiKarton = new Karton("crveni");
        Karton petiKarton = new Karton("zuti");
        Karton sestiKarton = new Karton("zuti");
        Karton sedmiKarton = new Karton("crveni");
        Karton osmiKarton = new Karton("zuti");

        prviIgrac.dodajKarton(prviKarton);
        prviIgrac.dodajKarton(drugiKarton);
        prviIgrac.dodajKarton(treciKarton);
        prviIgrac.dodajKarton(cetvrtiKarton);
        prviIgrac.dodajKarton(petiKarton);
        prviIgrac.dodajKarton(sestiKarton);
        prviIgrac.dodajKarton(sedmiKarton);
        prviIgrac.dodajKarton(osmiKarton);

        int brZutih=prviIgrac.brZutihKartona();
        System.out.println("Broj zutih kartona je: "+brZutih);
        System.out.println();
        int brCrvenih=prviIgrac.brCrvenihKartona();
        System.out.println("Broj crvenih kartona je: "+brCrvenih);
        System.out.println();

        prviIgrac.stampaj();

    }
}