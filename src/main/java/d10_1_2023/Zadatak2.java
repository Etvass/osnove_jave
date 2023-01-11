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

        Proizvod stolica = new Proizvod("Stolica","Mirko",3000);
        Proizvod frizider = new Proizvod("Frizider","Petar",3000);

        Kupac prvi = new Kupac("Petar","Petrovic","658-145");
        Kupac drugi = new Kupac("Filip","Maksimovic","456-982");

        ClanskaKarta prva = new ClanskaKarta(30,"657-458");
        ClanskaKarta druga = new ClanskaKarta(10,"589-412");

        prvi.setBrojClanske(prva);
        prvi.stampaj();

        stolica.setImeIprezime(drugi);
        stolica.setBrojClanskeKarte(druga);
        stolica.stampaj();

    }
}
