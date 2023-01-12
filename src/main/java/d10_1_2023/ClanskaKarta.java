package d10_1_2023;

public class ClanskaKarta {

    private int popust;
    private String brojKartice;

    public double getPopust() {
        return popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setPopust(int popust) {
        this.popust = popust;
    }

    public ClanskaKarta(int popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public ClanskaKarta(String brojKartice) {
        this.brojKartice = brojKartice;
    }


}
