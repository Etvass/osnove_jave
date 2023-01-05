package d29_12_2022.Zadatak1;

public class Zadatak1 {

//        1. Napisati klasu Proizvod koja ima atribute
//    a. naziv proizvoda (String)
//    b. cenu proizvoda (double)
//    c. težinu proizvoda u gramima. (double)
//    i metode:
//    d. stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//    e. povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu.
//    Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//            f. vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust,
//            a povratnu vrednost je cena proizvoda kada se uračuna popust.
//            Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//    g. racunajPostarinu - funkcije vraća koliko bi bila postarina da se
//    proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara,
//    a cena postarine se računa u zavisnosti od tezine:
//            • za tezinu do 100g, postarina iznosi 200din
//    • za tezinu od 101g do 500g, postarina iznosi 400din
//    • za tezinu preko 500g, postarina iznosi 1000din
//
//    U glavnom programu kreirati minimum 2 proizvoda i
//    za svaki od njih pozvati svaku od definisanih funkcija.

    public static void main(String[] args) {

        Proizvod proizvod1=new Proizvod();
        proizvod1.setnaziv("banane");
        proizvod1.setCena(90);
        proizvod1.setTezinaUGramima(400);


        Proizvod proizvod2=new Proizvod();
        proizvod2.setnaziv("laptop");
        proizvod2.setCena(80000);
        proizvod2.setTezinaUGramima(1400);

        proizvod1.stampaj();

        proizvod1.povecajCenu(40);
        System.out.println("uvecana cena je: " + proizvod1.getCena()+"dinara");

        double cenaSaPopustom= proizvod1.vratiCenuSapopustom(30);
        System.out.println("Cena sa popustom je: "+ cenaSaPopustom+"dinara");

        double postarina= proizvod1.racunajPostarinu();
        System.out.println("Postarina iznosi: " + postarina+"dinara");

        System.out.println();
        System.out.println();
        System.out.println();

        proizvod2.stampaj();
        proizvod2.povecajCenu(14000);
        System.out.println("uvecana cena je: " + proizvod2.getCena()+"dinara");
        double cenaSaPopustom2 = proizvod2.vratiCenuSapopustom(20);
        System.out.println("Cena sa popustom je: "+ cenaSaPopustom2+"dinara");
        double postarina2= proizvod2.racunajPostarinu();
        System.out.println("Postarina iznosi: " + postarina2+"dinara");



    }

}
