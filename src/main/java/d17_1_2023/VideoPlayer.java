package d17_1_2023;

public class VideoPlayer {

    private double duzinaVidea;
    private double trenutnoVremeVidea;
    private int jacinaZvuka;
    private double kvalitetVidea;

    public double getDuzinaVidea() {
        return duzinaVidea;
    }

    public double getTrenutnoVremeVidea() {
        return trenutnoVremeVidea;
    }

    public int getJacinaZvuka() {
        return jacinaZvuka;
    }

    public double getKvalitetVidea() {
        return kvalitetVidea;
    }

    public void setDuzinaVidea(double duzinaVidea) {
        this.duzinaVidea = duzinaVidea;
    }

    public void setTrenutnoVremeVidea(double trenutnoVremeVidea) {
        this.trenutnoVremeVidea = trenutnoVremeVidea;
    }

    public void setJacinaZvuka(int jacinaZvuka) {
        this.jacinaZvuka = jacinaZvuka;
    }

    public void setKvalitetVidea(double kvalitetVidea) {
        this.kvalitetVidea = kvalitetVidea;
    }

    public VideoPlayer(double duzinaVidea, double trenutnoVremeVidea, int jacinaZvuka, double kvalitetVidea) {
        this.duzinaVidea = duzinaVidea;
        this.trenutnoVremeVidea = trenutnoVremeVidea;
        this.jacinaZvuka = jacinaZvuka;
        this.kvalitetVidea = kvalitetVidea;
    }
    public void stampaj() {
        System.out.println("Trenutno vreme videa je: "+this.trenutnoVremeVidea);
        System.out.println("Trenutna jacina zvuka je: "+this.jacinaZvuka);
        System.out.println("Rezolucija videa je: "+this.kvalitetVidea);
    }
}
