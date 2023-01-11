package d10_1_2023;

public class ClanskaKarta {

    private double popust;
    private String brojKartice;

    public double getPopust() {
        return popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }

    public ClanskaKarta(double popust, String brojKartice) {
        this.popust = popust;
        this.brojKartice = brojKartice;
    }

    public ClanskaKarta(String brojKartice) {
        this.brojKartice = brojKartice;
    }


}
