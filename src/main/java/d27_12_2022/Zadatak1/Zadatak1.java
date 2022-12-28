package d27_12_2022.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

//        1. Napisati klasu Proizvod koja ima atribute
//        ◦ naziv proizvoda (String)
//        ◦ cenu proizvoda (double)
//        ◦ težinu proizvoda u gramima. (double)
//                i metode:
//        ◦ stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//        ◦ konvertuj - metoda konvertuje tezinu u
//        kilograme i tone. Metoda kao parametar prima jedinicu u
//        koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost.
//        Jedinica moze biti “kg” ili “t”
//        Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
//        Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012
//
//
//        U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode



        Proizvod secer = new Proizvod();
        secer.naziv = "Kocka";
        secer.cena = 200;
        secer.tezinag = 1000;

        secer.stampaj();
        double tezinaUKg = secer.konvertuj(secer.tezinag, "kg");
        System.out.println("Tezina u kilogramima: "+tezinaUKg+"kg");
        System.out.println();



        Proizvod mobilni = new Proizvod();
        mobilni.naziv = "Samsung";
        mobilni.cena = 40000;
        mobilni.tezinag = 500;

        mobilni.stampaj();
        double tezinaKg = mobilni.konvertuj(mobilni.tezinag, "kg");
        System.out.println("Tezina u kilogramima: "+tezinaKg+"kg");
        System.out.println();



        Proizvod buldozer = new Proizvod();
        buldozer.naziv = "T2400";
        buldozer.cena = 20000000;
        buldozer.tezinag = 40000000;

        buldozer.stampaj();
        double tezinaKilogrami = buldozer.konvertuj(buldozer.tezinag, "t");
        System.out.println("Tezina u tonama: "+tezinaKilogrami+"T");

    }
}
