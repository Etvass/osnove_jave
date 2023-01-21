package d19_1_2023.Zadatak1;

public class Tetrapak extends Ambalaza{

    private boolean mozeSeReciklirati;
    private int osnovnaCena;

    public boolean isMozeSeReciklirati() {
        return mozeSeReciklirati;
    }

    public int getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setMozeSeReciklirati(boolean mozeSeReciklirati) {
        this.mozeSeReciklirati = mozeSeReciklirati;
    }

    public void setOsnovnaCena(int osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }

    public Tetrapak(String barkod, String nazivArtikla, int netoTezina, int brutoTezina,
                                             boolean mozeSeReciklirati, int osnovnaCena) {
        super(barkod, nazivArtikla, netoTezina, brutoTezina);
        this.mozeSeReciklirati = mozeSeReciklirati;
        this.osnovnaCena = osnovnaCena;
    }

//  ------------METODE---------------------------------------------------------------------------

    public double cenaArtikla() {
        if (mozeSeReciklirati) {
            return super.tezinaPakovanja() * 1.5 + this.osnovnaCena;
        }else {
            return this.osnovnaCena;
        }
    }

    public void stampaj() {
        System.out.println("Barkod: "+this.barkod);
        System.out.println("Naziv artikla: "+this.nazivArtikla);
        System.out.println("Neto tezina: "+this.netoTezina);
        System.out.println("Bruto tezina: "+this.brutoTezina);
        if (this.mozeSeReciklirati) {
            System.out.println("Moze se reciklirati");
        }
        System.out.println("Cena: "+this.cenaArtikla());
        System.out.println();
    }

}
