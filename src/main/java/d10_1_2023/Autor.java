package d10_1_2023;

public class Autor {

    private String ime;
    private String prezime;

    public Autor(String pIme, String pPrezime) {
        this.ime=pIme;
        this.prezime=pPrezime;
    }

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
    public void print() {
        System.out.println(this.ime+" "+this.prezime);
    }
}
