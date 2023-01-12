package d10_1_2023;

public class Kupac {

    private String ime;
    private String prezime;
    private ClanskaKarta karticaInfo;

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public ClanskaKarta getKarticaInfo() {
        return karticaInfo;
    }

    public void setKarticaInfo(ClanskaKarta karticaInfo) {
        this.karticaInfo = karticaInfo;
    }

    public Kupac(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
    }

    public void stampaj() {
        System.out.println(this.ime+" "+this.prezime+" "+this.karticaInfo.getBrojKartice());
    }

}
