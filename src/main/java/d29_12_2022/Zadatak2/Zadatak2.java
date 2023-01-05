package d29_12_2022.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//        Kreirati klasu FacebookPost koja ima:
//        Od atributa:
//    • ime i prezime korisnika koji je objavio post
//    • ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//    • tekst objave
//    • broj lajkova
//    • broj deljenja
//    • gettere za sve atribute
//    • settere za sve atribute osim broja lajkova i broja deljenja
//        Od metoda:
//    • like(), koja povecava broj lajkova za 1.
//    • dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji odint x = mojs.nextInt(); nule)
//    • share(), koja povecava broj deljenja za 1
//    • print(), koja stampa objavu u formatu:
//        (ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//        (tekst objave)
//        Likes (broj lajkova) | Shares (broj deljenja)
//
//        U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
//
//
//        Primer stampanja:
//        Milan Jovanovic >>> Pera Peric
//        Ovo je tekst objave
//        Likes 3 | Shares 1

        FacebookPost post1 = new FacebookPost();
        post1.setImeIPrezimeKorisnikaKojiJeObjavio("Luka Andrejevic");
        post1.setImeIPrezimeKorisnikaCijiJeProfil("Petar Petkovic");
        post1.setTekstObjave("Ovo je neki tekst objave, veoma je zanimljiv i informativan!");

        post1.like();
        post1.like();
        post1.like();
        post1.like();
        post1.like();
        post1.like();
        post1.like();
        post1.like();

        post1.dislike();
        post1.dislike();
        post1.dislike();

        post1.share();
        post1.share();
        post1.share();
        post1.share();

        post1.print();





        FacebookPost post2 = new FacebookPost();
        post2.setImeIPrezimeKorisnikaKojiJeObjavio("Luka Andrejevic");
        post2.setImeIPrezimeKorisnikaCijiJeProfil("Milan Jovanovic");
        post2.setTekstObjave("Ovo je tekst objave, izuzetno je poucan i dramatican!");

        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();
        post2.like();

        post2.dislike();
        post2.dislike();

        post2.share();
        post2.share();
        post2.share();
        post2.share();
        post2.share();
        post2.share();
        post2.share();
        post2.share();

        post2.print();

    }
}
