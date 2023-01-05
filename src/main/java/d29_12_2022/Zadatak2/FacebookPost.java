package d29_12_2022.Zadatak2;

public class FacebookPost {

    private String imeIPrezimeKorisnikaKojiJeObjavio;
    private String imeIPrezimeKorisnikaCijiJeProfil;
    private String tekstObjave;
    private int brojLajkova;
    private int brojDeljenja;





    public String getImeIPrezimeKorisnikaKojiJeObjavio() {
        return this.imeIPrezimeKorisnikaKojiJeObjavio;
    }
    public String getImeIPrezimeKorisnikaCijiJeProfil() {
        return this.imeIPrezimeKorisnikaCijiJeProfil;
    }
    public String getTekstObjave() {
        return this.tekstObjave;
    }
    public int getBrojLajkova() {
        return this.brojLajkova;
    }
    public int getBrojDeljenja() {
        return this.brojDeljenja;
    }


    public void setImeIPrezimeKorisnikaKojiJeObjavio(String ime) {
        this.imeIPrezimeKorisnikaKojiJeObjavio=ime;
    }
    public void setImeIPrezimeKorisnikaCijiJeProfil(String ime) {
        this.imeIPrezimeKorisnikaCijiJeProfil=ime;
    }
    public void setTekstObjave(String tekst) {
        this.tekstObjave=tekst;
    }




    public void like() {
        this.brojLajkova++;
    }
    public void dislike() {
        if (this.brojLajkova==0) {

        }else {
            this.brojLajkova--;
        }
    }
    public void share() {
        this.brojDeljenja++;
    }
    public void print() {
        System.out.println(this.imeIPrezimeKorisnikaKojiJeObjavio+" >>>>> "+
                this.imeIPrezimeKorisnikaCijiJeProfil+"\n"+this.tekstObjave+"\n"+
                "Likes "+this.brojLajkova+" | Shares "+this.brojDeljenja);
    }

}
