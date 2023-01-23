package d19_1_2023.Zadatak2_ZaVezbanje;

import com.sun.source.tree.BreakTree;

public class Alpinista extends Planinar{

    private int kolikoPoenaJeAlpinistaOstvario;

    public Alpinista(int jedinstveniIdentifikacioniBroj, String imeIPrezime,
                                         int kolikoPoenaJeAlpinistaOstvario) {
        super(jedinstveniIdentifikacioniBroj, imeIPrezime);
        this.kolikoPoenaJeAlpinistaOstvario = kolikoPoenaJeAlpinistaOstvario;
    }

    public void setKolikoPoenaJeAlpinistaOstvario(int kolikoPoenaJeAlpinistaOstvario) {
        this.kolikoPoenaJeAlpinistaOstvario = kolikoPoenaJeAlpinistaOstvario;
    }

    @Override
    public void stampaj() {
        System.out.println("Alpinista, id: "+this.jedinstveniIdentifikacioniBroj);
        System.out.println("Ime: "+this.imeIPrezime);
        System.out.println("Broj poena: "+this.kolikoPoenaJeAlpinistaOstvario);
        System.out.println();
    }
    @Override
    public int clanarinaPlaninara() {
        return 1500-(this.kolikoPoenaJeAlpinistaOstvario*50);
    }
    @Override
    public boolean uspesanUspon(Planina nekaPlanina) {
        if (nekaPlanina.getVisinaPlanine()<=4000) {
            return true;
        }else {
            return false;
        }
    }

}
