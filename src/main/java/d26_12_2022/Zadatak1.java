package d26_12_2022;

public class Zadatak1 {
    public static void main(String[] args) {

//        Napisati metodu stampajVrednostZa10Vecu u kojoj se
//        stampa prosledjena vrednost za 10 veca.
//        Iz main-a pozvati izvrsenje metode za razlicite vrednosti.

        stampajVrednostZa10Vecu(9);
        stampajVrednostZa10Vecu(4);
        stampajVrednostZa10Vecu(3);
        stampajVrednostZa10Vecu(1);
        stampajVrednostZa10Vecu(9);
        stampajVrednostZa10Vecu(7);
        stampajVrednostZa10Vecu(56);

    }

    public static void stampajVrednostZa10Vecu(int x) {
        x=x+10;
        System.out.println("Uvecana vrednost je: "+x);

    }

}
