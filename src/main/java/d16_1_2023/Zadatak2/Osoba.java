package d16_1_2023.Zadatak2;

public class Osoba {

    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected int godRodjenja;

    public Osoba() {

    }

    public Osoba(String ime, String prezime, String jmbg, int godRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.godRodjenja = godRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public void setGodRodjenja(int godRodjenja) {
        this.godRodjenja = godRodjenja;
    }

    public void stampaj() {
        System.out.println(this.ime+", "+this.prezime+", "+this.jmbg+", "+
                this.godRodjenja);
    }
}
