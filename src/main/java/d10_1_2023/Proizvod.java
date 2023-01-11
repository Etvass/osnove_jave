package d10_1_2023;

public class Proizvod {

    private String naziv;
    private String kupac;
    private int cenaIzrade;
    private ClanskaKarta pospustClanskaKarta;
    private Kupac imeIprezime;
    private ClanskaKarta brojClanskeKarte;

    public String getNaziv() {
        return naziv;
    }

    public String getKupac() {
        return kupac;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public ClanskaKarta getPospustClanskaKarta() {
        return pospustClanskaKarta;
    }

    public void setPospustClanskaKarta(ClanskaKarta pospustClanskaKarta) {
        this.pospustClanskaKarta = pospustClanskaKarta;
    }

    public Kupac getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(Kupac imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public ClanskaKarta getBrojClanskeKarte() {
        return brojClanskeKarte;
    }

    public void setBrojClanskeKarte(ClanskaKarta brojClanskeKarte) {
        this.brojClanskeKarte = brojClanskeKarte;
    }

    public Proizvod(String naziv, String kupac, int cenaIzrade) {
        this.naziv = naziv;
        this.kupac = kupac;
        this.cenaIzrade = cenaIzrade;
    }

    public Proizvod(String naziv) {
        this.naziv = naziv;
    }

    public double racunanjeCene() {
        return this.cenaIzrade*1.9*(100-this.pospustClanskaKarta.getPopust())/100;
    }
    public void stampaj() {
        double cena = this.racunanjeCene();
        System.out.println(this.naziv+" - "+cena+"\n"+this.imeIprezime.getIme()+" "+
                this.imeIprezime.getPrezime()+" - "+this.brojClanskeKarte.getBrojKartice());
    }
}
