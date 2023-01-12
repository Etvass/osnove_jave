package d10_1_2023;

public class Zadatak2 {

//    Zadatak (POGLEDAJ SLIKU)
//    Kreirati klasu Proizvod koja ima
//    • Naziv proizvoda
//    • kupca/musteriju
//    • cenu izrade proizvoda
//    • gettere i settere
//    • konstruktore
//    • Metodu za racunanje cene proizvoda, koja racuna cenu proizvoda po formuli:
//    cena izrade * 1.9 * (100 - popust na clansku karticu) / 100
//            • Metodu za stampanje proizvoda u formatu:
//    naziv proizvoda - cena
//    ime i prezime - broj kartice
//
//    Kreirati klasu Kupac koja ima:
//            • ime i prezime
//    • clansku kartu
//    • gettere i settere, clanska karta ne moze da se menja
//    • konstruktore
//    • metodu stampaj koja stampa u formatu
//    ime i prezime - broj kartice
//
//    Kreirati klasu ClanskaKarta koja ima:
//            • popust (u rasponu od 5 do 10 %)
//    • broj kartice (npr: 9329-0239)
//    • gettere i setter
//    • konstuktore

    public static void main(String[] args) {

        Kupac prviKupac = new Kupac("Marko","Pancic");
        Kupac drugiKupac = new Kupac("Nikola","Orascic");

        Proizvod jedanProizvod = new Proizvod("Stolica",2000);
        Proizvod drugiProizvod = new Proizvod("Sto",5000);
        Proizvod treciProizvod = new Proizvod("TanjiriKomplet",3000);
        Proizvod cetvrtiProizvod = new Proizvod("Escajg",3500);

        ClanskaKarta jednaKartica = new ClanskaKarta(10,"315-845");
        ClanskaKarta drugaKartica = new ClanskaKarta(5,"598-093");

        jedanProizvod.setKupacInfo(prviKupac);
        prviKupac.setKarticaInfo(jednaKartica);
        drugiKupac.setKarticaInfo(drugaKartica);
        double izracunataCena=jedanProizvod.racunanjeCene();
        System.out.println("Cena za ovaj proizvod sa vasom karticom bi bila: "+izracunataCena+"Dinara");
        jedanProizvod.stampaj();

        jedanProizvod.setKupacInfo(drugiKupac);
        jedanProizvod.stampaj();

        drugiProizvod.setKupacInfo(drugiKupac);
        double cenaSaPopustom=drugiProizvod.racunanjeCene();
        System.out.println("Cena za ovaj proizvod sa vasom karticom bi bila: "+cenaSaPopustom);
        drugiProizvod.stampaj();

    }
}
