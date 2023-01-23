package d19_1_2023.Zadatak2_ZaVezbanje;

public class RekreativniPlaninar extends Planinar{

    private int tezinaOpreme;
    private String nazivOkruga;
    private int maksimalniUsponKojiMozeDaSavladaBezOpreme;

    public RekreativniPlaninar(int jedinstveniIdentifikacioniBroj, String imeIPrezime,
        int tezinaOpreme, String nazivOkruga, int maksimalniUsponKojiMozeDaSavladaBezOpreme) {
        super(jedinstveniIdentifikacioniBroj, imeIPrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalniUsponKojiMozeDaSavladaBezOpreme = maksimalniUsponKojiMozeDaSavladaBezOpreme;
    }

    @Override
    public void stampaj() {
        System.out.println("Rekreativac, id: "+this.jedinstveniIdentifikacioniBroj);
        System.out.println("Ime: "+this.imeIPrezime);
        System.out.println("Okrug: "+this.nazivOkruga);
        System.out.println();
    }

    @Override
    public int clanarinaPlaninara() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina nekaPlanina) {
        int kolikoMozeDaSePopne = maksimalniUsponKojiMozeDaSavladaBezOpreme-(this.tezinaOpreme*50);
        if (kolikoMozeDaSePopne>=nekaPlanina.getVisinaPlanine()) {
            return true;
        }else {
            return false;
        }
    }

}
