package d29_12_2022.Zadatak1;

public class Proizvod {

        private String naziv;
        private double cena;
        private double tezinaUGramima;




        public void setnaziv(String nazivP) {
                this.naziv = nazivP;
        }

        public void setCena(double cenaP) {
                this.cena = cenaP;
        }
        public double getCena(){
                return this.cena;
        }

        public void setTezinaUGramima(double tezinaP) {
                this.tezinaUGramima = tezinaP;
        }




        public void povecajCenu(double x) {
                this.cena = this.cena + x;
        }

        public double vratiCenuSapopustom(double popust) {
                double cenaSPopustom = cena - (cena * popust / 100);
                return cenaSPopustom;
        }
        public double racunajPostarinu() {
                double postarina;
                if (this.tezinaUGramima < 100) {
                        postarina = 200;
                } else if (this.tezinaUGramima >= 101 && this.tezinaUGramima < 500) {
                        postarina = 400;
                } else {
                        postarina = 1000;
                }

                return postarina;
        }

        public void stampaj() {
                System.out.println("Naziv proizvoda je: " + this.naziv + "," +
                        " cena prozvoda je: " + this.cena + " dinara," +
                        " tezina proizvoda je: " + this.tezinaUGramima+"g");

        }



}
