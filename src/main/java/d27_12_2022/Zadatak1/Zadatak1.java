package d27_12_2022.Zadatak1;

public class Zadatak1 {
    public static void main(String[] args) {

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
