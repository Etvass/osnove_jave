package d27_12_2022.Zadatak2;

public class SmartAirConditioning {

    public String marka;
    public int izabranaTemp;
    public String hladGrej;

    public void stampanje() {
        System.out.println("Marka:"+this.marka+"\n"+"Temperatura:"+
                this.izabranaTemp+"\n"+"Hladi/greje:"+this.hladGrej);
    }

    public String spoljnaTemp(int spoljnaTemp) {
        if (spoljnaTemp>this.izabranaTemp) {
            return "Spoljna temperatura je veca!";
        }else {
            return "Unutrasnja temperatura je veca!";
        }
    }

}
