package d13_1_2023.Zadatak1;

import java.util.ArrayList;

public class Student {

    private String brIndeksa;
    private String imeIPrezime;
    private String tipStrudija;
    private ArrayList<Ispit> ispiti;

//  -------KONSTRUKTORI--------------------
    public Student(String brIndeksa, String imeIPrezime, String tipStrudija) {
        this.brIndeksa = brIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.tipStrudija = tipStrudija;
        this.ispiti=new ArrayList<>();
    }

    public Student(String brIndeksa, String imeIPrezime) {
        this.brIndeksa = brIndeksa;
        this.imeIPrezime = imeIPrezime;
        this.ispiti=new ArrayList<>();
    }

//  ----------GETERI-I-SETERI---------------------------------

    public String getBrIndeksa() {
        return brIndeksa;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public String getTipStrudija() {
        return tipStrudija;
    }

    public ArrayList<Ispit> getIspiti() {
        return ispiti;
    }

    public void setBrIndeksa(String brIndeksa) {
        this.brIndeksa = brIndeksa;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public void setTipStrudija(String tipStrudija) {
        this.tipStrudija = tipStrudija;
    }

//  -----------METODE---------------------

    public void dodajIspitUNiz(Ispit ispitce) {
        this.ispiti.add(ispitce);
    }

    public double prosek() {
        double sumaOcena=0;
        int brojPolozenih=0;
        for (int i = 0; i < this.ispiti.size(); i++) {
           if (this.ispiti.get(i).polozen()) {
               brojPolozenih++;
               sumaOcena = sumaOcena + this.ispiti.get(i).getOcena();
           }
        }
        return sumaOcena/brojPolozenih;
    }

    public void stampa() {
        System.out.println(this.brIndeksa+" - "+this.imeIPrezime+" - "+this.tipStrudija);
        System.out.println("Predmeti:");
        for (int i = 0; i < this.ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getNaziv()+" - "
                    +this.ispiti.get(i).getImeIPrezimeProfesora()+" - "
                    +this.ispiti.get(i).getOcena());

        }
        System.out.println("Prosecna ocena: "+this.prosek());
    }

}
