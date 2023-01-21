package d19_1_2023.Zadatak1;

public abstract class Ambalaza {

    protected String barkod;
    protected String nazivArtikla;
    protected int netoTezina;
    protected int brutoTezina;

    public Ambalaza() {
    }

    public Ambalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina) {
        this.barkod = barkod;
        this.nazivArtikla = nazivArtikla;
        this.netoTezina = netoTezina;
        this.brutoTezina = brutoTezina;
    }

    public String getBarkod() {
        return barkod;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public int getNetoTezina() {
        return netoTezina;
    }

    public int getBrutoTezina() {
        return brutoTezina;
    }

    public void setBarkod(String barkod) {
        this.barkod = barkod;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public void setNetoTezina(int netoTezina) {
        this.netoTezina = netoTezina;
    }

    public void setBrutoTezina(int brutoTezina) {
        this.brutoTezina = brutoTezina;
    }
// -------METODE-------------------------------------------------------------------

    public int tezinaPakovanja() {
        return this.brutoTezina-this.netoTezina;
    }

    public abstract double cenaArtikla();

    public abstract void stampaj();

}
