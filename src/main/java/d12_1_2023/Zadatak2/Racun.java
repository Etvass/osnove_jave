package d12_1_2023.Zadatak2;

public class Racun {

    private String brojRacuna;
    private String imeOsobe;
    private String prezimeOsobe;
    private int trenutnoStanje;

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public String getImeOsobe() {
        return imeOsobe;
    }

    public String getPrezimeOsobe() {
        return prezimeOsobe;
    }

    public int getTrenutnoStanje() {
        return trenutnoStanje;
    }

    public void setBrojRacuna(String brojRacuna) {
        this.brojRacuna = brojRacuna;
    }

    public void setImeOsobe(String imeOsobe) {
        this.imeOsobe = imeOsobe;
    }

    public void setPrezimeOsobe(String prezimeOsobe) {
        this.prezimeOsobe = prezimeOsobe;
    }

    public Racun(String brojRacuna, String imeOsobe, String prezimeOsobe, int trenutnoStanje) {
        this.brojRacuna = brojRacuna;
        this.imeOsobe = imeOsobe;
        this.prezimeOsobe = prezimeOsobe;
        this.trenutnoStanje = trenutnoStanje;
    }

    //-----METODE-------------------------------------------------

    public void menjaStanje(int novac) {
        this.trenutnoStanje=this.trenutnoStanje+novac;
        if (this.trenutnoStanje<0) {
            this.trenutnoStanje=0;
        }
    }

    public void stampa() {
        System.out.println(this.imeOsobe+" "+this.prezimeOsobe+" - "+this.brojRacuna);
        System.out.println("Stanje na racunu je "+this.trenutnoStanje+" rsd");
    }

}
