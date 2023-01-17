package d16_1_2023.Zadatak2;

public class Zadatak2_ZaVezbanje {
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
