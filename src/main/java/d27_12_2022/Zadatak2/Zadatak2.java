package d27_12_2022.Zadatak2;

public class Zadatak2 {
    public static void main(String[] args) {

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
