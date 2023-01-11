package d10_1_2023;

public class Kupac {

    private String ime;
    private String prezime;
    private String clanskaKarta;
    private ClanskaKarta brojClanske;

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getClanskaKarta() {
        return clanskaKarta;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ClanskaKarta getBrojClanske() {
        return brojClanske;
    }

    public void setBrojClanske(ClanskaKarta brojClanske) {
        this.brojClanske = brojClanske;
    }

    public Kupac(String ime, String prezime, String clanskaKarta) {
        this.ime = ime;
        this.prezime = prezime;
        this.clanskaKarta = clanskaKarta;
    }

    public Kupac(String clanskaKarta) {
        this.clanskaKarta = clanskaKarta;
    }
    public void stampaj() {
        System.out.println(this.ime+" "+this.prezime+" "+this.brojClanske.getBrojKartice());
    }



}
