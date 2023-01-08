package PrviProjekat;

public class XOTabla {

    private String polje1;
    private String polje2;
    private String polje3;
    private String polje4;
    private String polje5;
    private String polje6;
    private String polje7;
    private String polje8;
    private String polje9;
    private String imeXIgraca;
    private String imeOIgraca;
    private String naPotezu;


    public String getImeXIgraca() {
        return this.imeXIgraca;
    }

    public String getImeOIgraca() {
        return this.imeOIgraca;
    }

    public String getNaPotezu() {
        return this.naPotezu;
    }

    public void setImeXIgraca(String imeIgraca) {
        this.imeXIgraca = imeIgraca;
    }

    public void setImeOIgraca(String imeIgraca) {
        this.imeOIgraca = imeIgraca;
    }


    public void pokreniIgru() {
        this.polje1 = " ";
        this.polje2 = " ";
        this.polje3 = " ";
        this.polje4 = " ";
        this.polje5 = " ";
        this.polje6 = " ";
        this.polje7 = " ";
        this.polje8 = " ";
        this.polje9 = " ";

        this.naPotezu = "X";

    }

    public void stampaj() {
        System.out.println(this.polje1 + "|" + this.polje2 + "|" + this.polje3);
        System.out.println(this.polje4 + "|" + this.polje5 + "|" + this.polje6);
        System.out.println(this.polje7 + "|" + this.polje8 + "|" + this.polje9);
        System.out.println();
        System.out.println("Igrac X: " + this.imeXIgraca);
        System.out.println("Igrac O: " + this.imeOIgraca);
    }

    public boolean poljePrazno(int indeksPolja) {
        if (indeksPolja == 1) {
            if (this.polje1.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (indeksPolja == 2) {
            if (this.polje2.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (indeksPolja == 3) {
            if (this.polje3.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (indeksPolja == 4) {
            if (this.polje4.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (indeksPolja == 5) {
            if (this.polje5.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (indeksPolja == 6) {
            if (this.polje6.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (indeksPolja == 7) {
            if (this.polje7.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (indeksPolja == 8) {
            if (this.polje8.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else if (indeksPolja == 9) {
            if (this.polje9.equals(" ")) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public void zameniIgraca() {
        if (this.naPotezu.equals("X")) {
            this.naPotezu = "O";
        } else {
            this.naPotezu = "X";
        }
    }

    public void odigrajPotez(int indeksPolja) {
        if (indeksPolja == 1) {
            this.polje1 = this.naPotezu;
        } else if (indeksPolja == 2) {
            this.polje2 = this.naPotezu;
        } else if (indeksPolja == 3) {
            this.polje3 = this.naPotezu;
        } else if (indeksPolja == 4) {
            this.polje4 = this.naPotezu;
        } else if (indeksPolja == 5) {
            this.polje5 = this.naPotezu;
        } else if (indeksPolja == 6) {
            this.polje6 = this.naPotezu;
        } else if (indeksPolja == 7) {
            this.polje7 = this.naPotezu;
        } else if (indeksPolja == 8) {
            this.polje8 = this.naPotezu;
        } else if (indeksPolja == 9) {
            this.polje9 = this.naPotezu;
        }
    }

    public boolean popunjenaTabla() {
        if (!this.polje1.equals(" ") && !this.polje2.equals(" ") && !this.polje3.equals(" ") && !this.polje4.equals(" ")
                && !this.polje5.equals(" ") && !this.polje6.equals(" ") && !this.polje7.equals(" ") && !this.polje8.equals(" ")
                && !this.polje9.equals(" ")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pobednikX() {
        if (this.polje1.equals("X") && this.polje2.equals("X") && this.polje3.equals("X")) {
            return true;
        } else if (this.polje4.equals("X") && this.polje5.equals("X") && this.polje6.equals("X")) {
            return true;
        } else if (this.polje7.equals("X") && this.polje8.equals("X") && this.polje9.equals("X")) {
            return true;
        } else if (this.polje1.equals("X") && this.polje4.equals("X") && this.polje7.equals("X")) {
            return true;
        } else if (this.polje2.equals("X") && this.polje5.equals("X") && this.polje8.equals("X")) {
            return true;
        } else if (this.polje3.equals("X") && this.polje6.equals("X") && this.polje9.equals("X")) {
            return true;
        } else if (this.polje1.equals("X") && this.polje5.equals("X") && this.polje9.equals("X")) {
            return true;
        } else if (this.polje3.equals("X") && this.polje5.equals("X") && this.polje7.equals("X")) {
            return true;
        } else {
            return false;
        }

    }

    public boolean pobednik0() {
        if (this.polje1.equals("O") && this.polje2.equals("0") && this.polje3.equals("O")) {
            return true;
        } else if (this.polje4.equals("O") && this.polje5.equals("0") && this.polje6.equals("O")) {
            return true;
        } else if (this.polje7.equals("O") && this.polje8.equals("0") && this.polje9.equals("0")) {
            return true;
        } else if (this.polje1.equals("0") && this.polje4.equals("0") && this.polje7.equals("0")) {
            return true;
        } else if (this.polje2.equals("0") && this.polje5.equals("0") && this.polje8.equals("0")) {
            return true;
        } else if (this.polje3.equals("0") && this.polje6.equals("O") && this.polje9.equals("O")) {
            return true;
        } else if (this.polje1.equals("O") && this.polje5.equals("O") && this.polje9.equals("O")) {
            return true;
        } else if (this.polje3.equals("O") && this.polje5.equals("O") && this.polje7.equals("O")) {
            return true;
        } else {
            return false;
        }

    }
}
