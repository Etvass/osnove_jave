package d19_1_2023.Zadatak1;

public class SuperKartica {

    private int brojKartice;
    private String imeIPrezimeVlasnika;
    private int pospust;

    public SuperKartica() {
    }

    public SuperKartica(int brojKartice, String imeIPrezimeVlasnika, int pospust) {
        this.brojKartice = brojKartice;
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
        this.pospust = pospust;
    }

    public int getBrojKartice() {
        return brojKartice;
    }

    public String getImeIPrezimeVlasnika() {
        return imeIPrezimeVlasnika;
    }

    public int getPospust() {
        return pospust;
    }

    public void setBrojKartice(int brojKartice) {
        this.brojKartice = brojKartice;
    }

    public void setImeIPrezimeVlasnika(String imeIPrezimeVlasnika) {
        this.imeIPrezimeVlasnika = imeIPrezimeVlasnika;
    }

    public void setPospust(int pospust) {
        this.pospust = pospust;
    }

    public void stampaj() {
        System.out.println("Broj kartice: "+this.brojKartice+" "+this.imeIPrezimeVlasnika);
    }

}
