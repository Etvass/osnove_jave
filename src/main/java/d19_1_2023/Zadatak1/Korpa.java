package d19_1_2023.Zadatak1;

import java.util.ArrayList;

public class Korpa {

    ArrayList<Ambalaza> nekiNizAmbalaza;

    public Korpa() {
        this.nekiNizAmbalaza=new ArrayList<>();
    }

    //  ------METODE------------------------------------------------------------

    public void dodajAmbalazu(Ambalaza nekaAmbalaza) {
        this.nekiNizAmbalaza.add(nekaAmbalaza);
    }

    public void izbaciAmbalazu(String barkodFlase) {
        for (int i = 0; i < this.nekiNizAmbalaza.size(); i++) {
            if (this.nekiNizAmbalaza.get(i).getBarkod().equals(barkodFlase)) {
                this.nekiNizAmbalaza.remove(i);
            }
        }
    }

    private double cenaSvihAmbalazaSaPopustom(int popust) {
        double sumaAmbalaza=0;
        for (int i = 0; i < this.nekiNizAmbalaza.size(); i++) {
            sumaAmbalaza=sumaAmbalaza+(this.nekiNizAmbalaza.get(i).cenaArtikla()-
                          (this.nekiNizAmbalaza.get(i).cenaArtikla()/100*popust));
        }
        return sumaAmbalaza;
    }

    public double ukupnaCenaKorpe(SuperKartica nekaKartica) {
        int popust = nekaKartica.getPospust();
        double sumaAmbalaza=0;
        for (int i = 0; i < this.nekiNizAmbalaza.size(); i++) {
            sumaAmbalaza=sumaAmbalaza+this.nekiNizAmbalaza.get(i).cenaArtikla();
        }
        return sumaAmbalaza - popust;
    }




}
