package d16_1_2023.Zadatak1;

public class Trener extends Osoba{

    private int godineIskustva;
    private String tip;

    @Override
    public void stampaj() {
        System.out.println(this.imeIPrezime+", "+this.jmbg+", "+this.godinaRodjenja);
        System.out.println(this.godineIskustva+" "+this.tip);
    }

    public Trener(String imeIPrezime, String jmbg, int godinaRodjenja, int godineIskustva, String tip) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.godineIskustva = godineIskustva;
        this.tip = tip;
    }
}
