package d12_1_2023.Zadatak1;

public class Zadatak1 {

//        1. Zadatak
//    Kreirati klasu ZeleniKarton koja ima:
//            • ime i prezime studenta
//    • broj indeksa
//    • naziv predmeta
//    • ime i prezime profesora
//    • ocenu - od 5 do 10
//            • gettere i settere
//    • konstruktore
//    • metodu koja vraca da li je ispit polozen ili ne (ispit je polozen ako je ocena veca od 5)
//    • metodu stampaj koja stampa podatke u formatu:
//            (naziv predmeta) - (ocena)
//    Student: ime i prezime, broj indeksa
//    Profesor: ime i prezime
//
//    U glavnoj klasi:
//            • kreirati niz od 10tak zelenih kartona za ispite i odstampati podatke za sve ispite
//    • (Za vezbanje) Pronaci i ispisati prosecnu ocenu za sve ispite
//        ◦ (Za vezbanje) Pronaci i ispisati prosecnu ocenu samo iz polozenih ispita

    public static void main(String[] args) {

        ZeleniKarton prvi = new ZeleniKarton("Luka","Andrejevic",
                7821,"Kvantna fizika","Milenko",
                "Mackatic",10);
        ZeleniKarton drugi = new ZeleniKarton("Marko","Miljkovic",
                1852,"Agro kultura","Predrag",
                "Petrovic",7);
        ZeleniKarton treci = new ZeleniKarton("Nikola","Kojo",
                4963,"Balet","Borivoje",
                "Prokic",8);
        ZeleniKarton cetvrti = new ZeleniKarton("Milos","Stefanovic",
                4978,"Osnove C programskog jezika","Dusko",
                "Radovic",9);
        ZeleniKarton peti = new ZeleniKarton("Filip","Visnjic",
                6503,"Gramatika Srpskog jezika","Dusan",
                "Savic",5);
        ZeleniKarton sesti = new ZeleniKarton("Mirko","Matejic",
                4852,"Vise biljke","Sinisa",
                "Mrcic",6);
        ZeleniKarton sedmi = new ZeleniKarton("Petar","Stojkovic",
                2389,"Beton","Vuk",
                "Obradovic",9);
        ZeleniKarton osmi = new ZeleniKarton("Luka","Boskovic",
                1856,"Teski metali","Stefan",
                "Lazarevic",7);
        ZeleniKarton deveti = new ZeleniKarton("Momcilo","Surdulovic",
                7531,"Reptili","Milutin",
                "Stosic",8);
        ZeleniKarton deseti = new ZeleniKarton("Milan","Stamenkovic",
                9517,"Srednji vek","Milos",
                "Mitic",6);


        boolean polozen = prvi.ispitPolozen();
        if (polozen) {
            System.out.println("Ispit je polozen!");
        }else {
            System.out.println("Ispit nije polozen!");
        }
        prvi.stampaj();
        System.out.println();

        boolean plz = drugi.ispitPolozen();
        if (plz) {
            System.out.println("Ispit je polozen!");
        }else {
            System.out.println("Ispit nije polozen!");
        }
        drugi.stampaj();
        System.out.println();

        boolean plzl = peti.ispitPolozen();
        if (plzl) {
            System.out.println("Ispit je polozen!");
        }else {
            System.out.println("Ispit nije polozen!");
        }
        peti.stampaj();

    }

}
