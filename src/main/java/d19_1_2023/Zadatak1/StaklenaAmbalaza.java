package d19_1_2023.Zadatak1;

public class StaklenaAmbalaza extends Ambalaza{

    private int kaucijaZaFlasu;
    private boolean placaSeKaucija;
    private int osnovnaCena;

    public int getKaucijaZaFlasu() {
        return kaucijaZaFlasu;
    }

    public boolean getZaFlasuSePlacaKaucija() {
        return placaSeKaucija;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setKaucijaZaFlasu(int kaucijaZaFlasu) {
        this.kaucijaZaFlasu = kaucijaZaFlasu;
    }

    public void setZaFlasuSePlacaKaucija(boolean zaFlasuSePlacaKaucija) {
        this.placaSeKaucija = zaFlasuSePlacaKaucija;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public StaklenaAmbalaza(String barkod, String nazivArtikla, int netoTezina, int brutoTezina,
                                     int kaucijaZaFlasu, boolean placaSeKaucija, int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.kaucijaZaFlasu = kaucijaZaFlasu;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

// ---------METODE-----------------------------------------------------------------------------------------


    public double cenaArtikla() {
        if (this.placaSeKaucija) {
            return this.osnovnaCena * 1.2 + this.kaucijaZaFlasu;
        }else {
            return this.osnovnaCena * 1.2;
        }
    }

    public void stampaj() {
        System.out.println("Barkod: "+this.barkod);
        System.out.println("Naziv artikla: "+this.nazivArtikla);
        System.out.println("Neto tezina: "+this.netoTezina);
        System.out.println("Bruto tezina: "+this.brutoTezina);
        System.out.println("Kaucija za flasu: "+this.kaucijaZaFlasu);
        if (placaSeKaucija) {
            System.out.println("Kaucija se placa");
        }
        System.out.println("Cena: "+this.cenaArtikla());
        System.out.println();
    }

}
