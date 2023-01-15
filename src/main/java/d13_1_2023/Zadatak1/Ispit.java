package d13_1_2023.Zadatak1;

public class Ispit {

    private String naziv;
    private int ocena;
    private String imeIPrezimeProfesora;

    public Ispit(String naziv, int ocena, String imeIPrezimeProfesora) {
        this.naziv = naziv;
        this.ocena = ocena;
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

    public Ispit(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getOcena() {
        return ocena;
    }

    public String getImeIPrezimeProfesora() {
        return imeIPrezimeProfesora;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public void setImeIPrezimeProfesora(String imeIPrezimeProfesora) {
        this.imeIPrezimeProfesora = imeIPrezimeProfesora;
    }

//  --------METODE----------------------------

    public boolean polozen() {
        return this.ocena>=6&&this.ocena<=10 ? true : false;
    }

    public void stampa() {
        System.out.println(this.naziv+" - "+this.imeIPrezimeProfesora+" - "+this.ocena);
    }

}
