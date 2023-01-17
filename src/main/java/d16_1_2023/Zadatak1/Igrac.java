package d16_1_2023.Zadatak1;

public class Igrac extends Osoba{

    private int broj;
    private String pozicija;
    private boolean kapiten;

    public Igrac() {

    }

    public Igrac(String imeIPrezime, String jmbg, int godinaRodjenja, int broj, String pozicija, boolean kapiten) {
        super(imeIPrezime, jmbg, godinaRodjenja);
        this.broj = broj;
        this.pozicija = pozicija;
        this.kapiten = kapiten;
    }

    public int getBroj() {
        return broj;
    }

    public String getPozicija() {
        return pozicija;
    }

    public boolean isKapiten() {
        return kapiten;
    }

    public void setBroj(int broj) {
        this.broj = broj;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public void setKapiten(boolean kapiten) {
        this.kapiten = kapiten;
    }

    @Override
    public void stampaj() {
        System.out.println(this.imeIPrezime+", "+this.jmbg+", "+this.godinaRodjenja);
        if (this.kapiten) {
            System.out.println("Broj igraca je: "+this.broj+", na poziciji "+this.pozicija+" Kapiten");
        }else {
            System.out.println("Broj igraca je: "+this.broj+", na poziciji "+this.pozicija);
        }
    }

}
