package d10_1_2023;

import p27_12_2022.Auto;

public class Knjiga {

    private String isbn;
    private String naziv;
    private int godinaIzdanja;
    private String autor;
    private Autor podatciAutora;

    public Knjiga(String isbn, String naziv, int godinaIzdanja, String autor) {
        this.isbn = isbn;
        this.naziv = naziv;
        this.godinaIzdanja = godinaIzdanja;
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getGodinaIzdanja() {
        return godinaIzdanja;
    }

    public String getAutor() {
        return autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setGodinaIzdanja(int godinaIzdanja) {
        this.godinaIzdanja = godinaIzdanja;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Autor getPodatciAutora() {
        return podatciAutora;
    }

    public void setPodatciAutora(Autor podatciAutora) {
        this.podatciAutora = podatciAutora;
    }

    public void print() {
        System.out.println(this.isbn+"\n"+this.naziv+" "+this.godinaIzdanja);
        System.out.println("Autor: "+this.podatciAutora.getIme()+" "+this.podatciAutora.getPrezime());
    }

}
