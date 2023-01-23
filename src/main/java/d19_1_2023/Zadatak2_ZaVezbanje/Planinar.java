package d19_1_2023.Zadatak2_ZaVezbanje;

public abstract class Planinar {

    protected int jedinstveniIdentifikacioniBroj;

    protected String imeIPrezime;

    public Planinar(int jedinstveniIdentifikacioniBroj, String imeIPrezime) {
        this.jedinstveniIdentifikacioniBroj = jedinstveniIdentifikacioniBroj;
        this.imeIPrezime = imeIPrezime;
    }

    public int getJedinstveniIdentifikacioniBroj() {
        return jedinstveniIdentifikacioniBroj;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

//  ---------METODE-----------------------

    public abstract void stampaj();

    public abstract int clanarinaPlaninara();

    public abstract boolean uspesanUspon(Planina nekaPlanina);

}
