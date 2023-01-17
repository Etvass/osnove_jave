package d16_1_2023.Zadatak2;

import java.util.ArrayList;

public class Igrac extends Osoba{

    private int broj;
    private String pozicija;
    private ArrayList<Karton>nizKartona;
    private boolean kapiten;

    public Igrac() {

    }

    public Igrac(String ime, String prezime, String jmbg, int godRodjenja, int broj, String pozicija, boolean kapiten) {
        super(ime, prezime, jmbg, godRodjenja);
        this.nizKartona=new ArrayList<>();
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
//  --------METODE----------------------------------

    public void dodajKarton(Karton nekiKarton) {
        this.nizKartona.add(nekiKarton);
    }
    public int brZutihKartona() {
        int brojZutihKartona=0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getBoja().equals("zuti")) {
                brojZutihKartona++;
            }
        }
        return brojZutihKartona;
    }
    public int brCrvenihKartona() {
        int brojCrvenihKartona=0;
        for (int i = 0; i < this.nizKartona.size(); i++) {
            if (this.nizKartona.get(i).getBoja().equals("crveni")) {
                brojCrvenihKartona++;
            }
        }
        return brojCrvenihKartona;
    }

    public void stampaj() {
        System.out.println(this.ime+", "+this.prezime+", "+this.jmbg+", "+
                this.godRodjenja);
        if (this.kapiten) {
            System.out.println(this.broj+", "+this.pozicija+" Kapiten");
        }else {
            System.out.println(this.broj+", "+this.pozicija);
        }

    }

}
