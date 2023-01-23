package d19_1_2023.Zadatak2_ZaVezbanje;

public class Planina {

    private String imePlanine;
    private String nazivDrzaveUKojojSeNalazi;
    private int visinaPlanine;

    public Planina() {
    }

    public Planina(String imePlanine, String nazivDrzaveUKojojSeNalazi, int visinaPlanine) {
        this.imePlanine = imePlanine;
        this.nazivDrzaveUKojojSeNalazi = nazivDrzaveUKojojSeNalazi;
        this.visinaPlanine = visinaPlanine;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public String getNazivDrzaveUKojojSeNalazi() {
        return nazivDrzaveUKojojSeNalazi;
    }

    public double getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setImePlanine(String imePlanine) {
        this.imePlanine = imePlanine;
    }

    public void setNazivDrzaveUKojojSeNalazi(String nazivDrzaveUKojojSeNalazi) {
        this.nazivDrzaveUKojojSeNalazi = nazivDrzaveUKojojSeNalazi;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }

}
