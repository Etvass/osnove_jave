package d16_1_2023.Zadatak1;

public class Osoba {

    protected String imeIPrezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba() {
    }

    public Osoba(String imeIPrezime, String jmbg, int godinaRodjenja) {
        this.imeIPrezime = imeIPrezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }

//  ---------METODE----------------------------------------

    public void stampaj() {
        System.out.println(this.imeIPrezime+", "+this.jmbg+", "+this.godinaRodjenja);
    }

}
