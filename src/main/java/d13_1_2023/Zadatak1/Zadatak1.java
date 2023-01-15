package d13_1_2023.Zadatak1;

public class Zadatak1 {

//    Napisati klasu Student koja ima
//    • broj indeksa
//    • ime i prezime
//    • tip studija (osnovne, master, doktorske)
//    • niz ispita
//    • konstuktore koje mislite da ce vam trebati
//    • gettere i settere za indeks, ime i prezime, tip studija
//    • getter za niz predmeta
//    • metodu dodaj ispit u niz ispita
//    • metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//    • metodu stampaj koja stampa u formatu:
//            (broj indeksa) - (ime i prezime) - (tip studija)
//    Predmeti:
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//            (naziv predmeta) - (profesor) - (ocena)
//    Prosecna ocena: (prosecna ocena)
//
//
//    Napisati klasu Ispit koja ima
//    • naziv predmeta
//    • ocenu (u rasponu od 5 do 10)
//    • Ime i prezime profesora koji predaje predmet
//    • konstuktore koje mislite da ce vam trebati
//    • gettere i settere za sve atribute
//    • metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//    • metodu koja stampa ispit u formatu:
//            (naziv predmeta) - (profesor) - (ocena)

    public static void main(String[] args) {

        Student studnet1 = new Student("8465",
                "Mirko Petrovic","Osnovne Akademske");
        Ispit prvi = new Ispit("Beton",7,"Mirko Ljubicic");
        Ispit drugi = new Ispit("Elektrotehnika",8,"Stefan Sindjelic");
        Ispit treci = new Ispit("Racunarstvo",10,"Predrag Aleksov");
        Ispit cetvrti = new Ispit("Vise biljke",5,"Milos Obrenovic");
        Ispit peti = new Ispit("Struktura atoma",5,"Lazar Ristovski");

        studnet1.dodajIspitUNiz(prvi);
        studnet1.dodajIspitUNiz(drugi);
        studnet1.dodajIspitUNiz(treci);
        studnet1.dodajIspitUNiz(cetvrti);
        studnet1.dodajIspitUNiz(peti);

        studnet1.stampa();

    }
}
