package d12_1_2023.Zadatak1;

public class ZeleniKarton {

    private String imeStudenta;
    private String prezimeStudenta;
    private int brIndeksa;
    private String nazivPredmeta;
    private String imeProfesora;
    private String prezimeProfesora;
    private int ocena;

    public String getImeStudenta() {
        return imeStudenta;
    }

    public String getPrezimeStudenta() {
        return prezimeStudenta;
    }

    public int getBrIndeksa() {
        return brIndeksa;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public String getImeProfesora() {
        return imeProfesora;
    }

    public String getPrezimeProfesora() {
        return prezimeProfesora;
    }

    public int getOcena() {
        return ocena;
    }

    public void setImeStudenta(String imeStudenta) {
        this.imeStudenta = imeStudenta;
    }

    public void setPrezimeStudenta(String prezimeStudenta) {
        this.prezimeStudenta = prezimeStudenta;
    }

    public void setBrIndeksa(int brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public void setImeProfesora(String imeProfesora) {
        this.imeProfesora = imeProfesora;
    }

    public void setPrezimeProfesora(String prezimeProfesora) {
        this.prezimeProfesora = prezimeProfesora;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public ZeleniKarton(String imeStudenta, String prezimeStudenta, int brIndeksa,
                        String nazivPredmeta, String imeProfesora, String prezimeProfesora,
                                                                                  int ocena) {
        this.imeStudenta = imeStudenta;
        this.prezimeStudenta = prezimeStudenta;
        this.brIndeksa = brIndeksa;
        this.nazivPredmeta = nazivPredmeta;
        this.imeProfesora = imeProfesora;
        this.prezimeProfesora = prezimeProfesora;
        this.ocena = ocena;
    }

    public ZeleniKarton() {
    }

    public boolean ispitPolozen() {
        if (this.ocena>5) {
            return true;
        }else {
            return false;
        }
    }

    public void stampaj() {
        System.out.println(this.nazivPredmeta+" - "+this.ocena);
        System.out.println("Student: "+this.imeStudenta+" "+this.prezimeStudenta+", "+
                                                                        this.brIndeksa);
        System.out.println("Profesor: "+this.imeProfesora+" "+this.prezimeProfesora);
    }

}
