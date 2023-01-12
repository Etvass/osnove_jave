package d10_1_2023;

public class Proizvod {

    private String naziv;
    private int cenaIzrade;
    private Kupac kupacInfo;


//  ------SETERI-I-GETERI------------------------------------------------------------

    public String getNaziv() {
        return naziv;
    }

    public int getCenaIzrade() {
        return cenaIzrade;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setCenaIzrade(int cenaIzrade) {
        this.cenaIzrade = cenaIzrade;
    }

    public Kupac getKupacInfo() {
        return kupacInfo;
    }

    public void setKupacInfo(Kupac kupacInfo) {
        this.kupacInfo = kupacInfo;
    }
    //  -----------KONSTRUKTORI-------------------------------------------------------------

    public Proizvod(String naziv, int cenaIzrade) {
        this.naziv = naziv;
        this.cenaIzrade = cenaIzrade;
    }

//  -----------METODE------------------------------------------------------------------------

    public double racunanjeCene() {
        return this.cenaIzrade*1.9*(100-kupacInfo.getKarticaInfo().getPopust())/100;
    }
    public void stampaj() {
        System.out.println(this.naziv+" - "+this.cenaIzrade+" Dinara");
        System.out.println(this.kupacInfo.getIme()+" "+this.kupacInfo.getPrezime()+" - "+
                this.kupacInfo.getKarticaInfo().getBrojKartice());
    }
}
