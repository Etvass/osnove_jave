package d19_1_2023.Zadatak2_ZaVezbanje;

import java.util.ArrayList;

public class PlaninarskiDom {

    private String nazivDoma;
    private int godinaKadaJeOsnovan;
    private ArrayList<Planinar> planinari;

    public PlaninarskiDom() {
        this.planinari=new ArrayList<>();
    }

    public PlaninarskiDom(String nazivDoma, int godinaKadaJeOsnovan) {
        this.planinari=new ArrayList<>();
        this.nazivDoma = nazivDoma;
        this.godinaKadaJeOsnovan = godinaKadaJeOsnovan;
    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public int getGodinaKadaJeOsnovan() {
        return godinaKadaJeOsnovan;
    }

    public ArrayList<Planinar> getPlaninari() {
        return planinari;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

//  ---------------METODE-----------------------------------------------------------------

    public void uclaniPlaninara(Planinar noviKolacic) {
        planinari.add(noviKolacic);
    }

    public int planinariKojiCeSeUspesnoPopetiNaPlaninu(Planina nekaPlanina) {
        int brojPlaninaraKojiSuUspeli=0;
        for (int i = 0; i < planinari.size(); i++) {
            if (planinari.get(i).uspesanUspon(nekaPlanina)) {
                brojPlaninaraKojiSuUspeli++;
            }
        }
        return brojPlaninaraKojiSuUspeli;
    }

    public void izbacivanjePlaninaraIzPlaninarskogDoma(Planinar planinarZaIzbacivanje) {
        for (int i = 0; i < planinari.size(); i++) {
            if (planinari.get(i).jedinstveniIdentifikacioniBroj==
                planinarZaIzbacivanje.jedinstveniIdentifikacioniBroj) {

                planinari.remove(i);

            }
        }
    }

    public void stampaj() {
        System.out.println("Planinarski dom "+this.nazivDoma+" Osnovan "+this.godinaKadaJeOsnovan+" godine");
        System.out.println();
        for (int i = 0; i < planinari.size(); i++) {
            planinari.get(i).stampaj();
        }
    }

    public int mesecniPrihodOdSvihPlaninara() {
        int ukupniPrihod = 0;
        for (int i = 0; i < planinari.size(); i++) {
            ukupniPrihod += planinari.get(i).clanarinaPlaninara();
        }
        return ukupniPrihod;
    }

}
