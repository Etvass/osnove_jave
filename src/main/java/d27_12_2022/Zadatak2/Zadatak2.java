package d27_12_2022.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

//        2. Kreirati klasu SmartAirConditioning koja ima:
//    • atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//    • atribut za izabranu temperaturu
//    • atribut za mod (hladi/greje) - string
//    • metodu za stampu (proizvoljno)
//    • metodu koja vraca informaciju da li je
//    napolju veca temperatura od one na koju je klima postavljena.
//    Metoda kao parametar prima temperaturu koja je napolju.
//
//
//        U glavnom programu kreirati minimum 2 objekta klase SmartAirConditioning i
//        za svaki od njih pozvati metode



        SmartAirConditioning mojaKlima = new SmartAirConditioning();
        mojaKlima.marka = "LG";
        mojaKlima.hladGrej = "grejanje";
        mojaKlima.izabranaTemp = 25;

        mojaKlima.stampanje();
        System.out.println(mojaKlima.spoljnaTemp(-10));



        SmartAirConditioning drugaricinaKlima = new SmartAirConditioning();
        drugaricinaKlima.marka = "Samsung";
        drugaricinaKlima.hladGrej = "Hladi";
        drugaricinaKlima.izabranaTemp = 18;

        System.out.println();
        drugaricinaKlima.stampanje();
        System.out.println(drugaricinaKlima.spoljnaTemp(38));


    }
}
