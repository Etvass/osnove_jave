package d12_1_2023.Zadatak2;

public class Transakcija {

    private String id;
    private Racun racunSaKogSePrenoseSredstva;
    private Racun racunNaKojSePrenoseSredstva;


    public String getId() {
        return id;
    }

    public Racun getRacunSaKogSePrenoseSredstva() {
        return racunSaKogSePrenoseSredstva;
    }

    public Racun getRacunNaKojSePrenoseSredstva() {
        return racunNaKojSePrenoseSredstva;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setRacunSaKogSePrenoseSredstva(Racun racunSaKogSePrenoseSredstva) {
        this.racunSaKogSePrenoseSredstva = racunSaKogSePrenoseSredstva;
    }

    public void setRacunNaKojSePrenoseSredstva(Racun racunNaKojSePrenoseSredstva) {
        this.racunNaKojSePrenoseSredstva = racunNaKojSePrenoseSredstva;
    }

    public Transakcija(String id, Racun racunSaKogSePrenoseSredstva, Racun racunNaKojSePrenoseSredstva) {
        this.id = id;
        this.racunSaKogSePrenoseSredstva = racunSaKogSePrenoseSredstva;
        this.racunNaKojSePrenoseSredstva = racunNaKojSePrenoseSredstva;
    }

    public Transakcija() {
    }

//  ----------METODE----------------------------------------------------------------------

    private int provizija(int novac) {
        return novac<4500 ? 45 : novac/100;
    }

    public void izvrsiTransakciju(int novac) {
        if (this.racunSaKogSePrenoseSredstva.getTrenutnoStanje()>novac) {
            this.racunSaKogSePrenoseSredstva.menjaStanje(-(novac+this.provizija(novac)));
            this.racunNaKojSePrenoseSredstva.menjaStanje(novac);
        }else {
            System.out.println("Greska! Nemate dovoljno sredstava na racunu.");
        }

    }

    public void stampa() {
        System.out.println(this.id);
        System.out.println("Racun sa: "+this.racunSaKogSePrenoseSredstva.getImeOsobe()+
                         " "+this.racunSaKogSePrenoseSredstva.getPrezimeOsobe()+" - "+
                                     this.racunSaKogSePrenoseSredstva.getBrojRacuna());
        System.out.println("Racun na: "+this.racunNaKojSePrenoseSredstva.getImeOsobe()+
                " "+this.racunNaKojSePrenoseSredstva.getPrezimeOsobe()+" - "+
                this.racunNaKojSePrenoseSredstva.getBrojRacuna());
    }

}
