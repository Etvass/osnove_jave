package d10_1_2023;

public class Zadatak1 {
    public static void main(String[] args) {

        Autor prvi = new Autor("Petko","Cvetkovic");
        Autor drugi = new Autor("Mile", "Trajkovic");
        Autor treci = new Autor("Marko","Ristic");

        Knjiga jedan = new Knjiga("458932","Lepa kuca",1211,"Faraon treci");
        Knjiga dva = new Knjiga("485632","Crven cvete",1856,"Marinka Ljubicic");
        Knjiga tri = new Knjiga("854796","Veliko kao balon",1955,"Miljko Petrovic");
        Knjiga cetvrti = new Knjiga("123548","Kosa",1854,"Mirko Petrovic");
        Knjiga peti = new Knjiga("128459","Tepih",1999,"Filip Markovic");
        Knjiga sesta = new Knjiga("325874","Zavesa",1865,"Tomislav Andrejevic");

        jedan.setPodatciAutora(drugi);
        jedan.print();

    }
}
