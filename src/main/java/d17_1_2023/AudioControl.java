package d17_1_2023;

public class AudioControl extends Control{

    private boolean povecavaZvuk;

    public AudioControl(boolean povecavaZvuk) {
        this.povecavaZvuk = povecavaZvuk;
    }

    public boolean isPovecavaZvuk() {
        return povecavaZvuk;
    }

    public void setPovecavaZvuk(boolean povecavaZvuk) {
        this.povecavaZvuk = povecavaZvuk;
    }

    public void izvrsiAkciju(VideoPlayer nekiVideoPlejer) {
        if (povecavaZvuk) {
            if (nekiVideoPlejer.getJacinaZvuka()==100) {

            }else {
                nekiVideoPlejer.setJacinaZvuka(nekiVideoPlejer.getJacinaZvuka()+1);
            }
        }else {
            if (nekiVideoPlejer.getJacinaZvuka()==0) {

            }else {
                nekiVideoPlejer.setJacinaZvuka(nekiVideoPlejer.getJacinaZvuka()-1);
            }
        }
    }

}
