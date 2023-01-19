package d17_1_2023;

public class QualityOptimizerControl extends Control{

    private double brzinaInterneta;

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public void izvrsiAkciju(VideoPlayer nekiVideoPlejer) {
        double kvalitetVidea=this.brzinaInterneta*10.1;
        if (kvalitetVidea<=144) {
            nekiVideoPlejer.setKvalitetVidea(144);
        } else if (kvalitetVidea<=240) {
            nekiVideoPlejer.setKvalitetVidea(240);
        } else if (kvalitetVidea<=360) {
            nekiVideoPlejer.setKvalitetVidea(360);
        } else if (kvalitetVidea<=480) {
            nekiVideoPlejer.setKvalitetVidea(480);
        } else if (kvalitetVidea<=720) {
            nekiVideoPlejer.setKvalitetVidea(720);
        } else if (kvalitetVidea<=1080) {
            nekiVideoPlejer.setKvalitetVidea(1080);
        }else {
            nekiVideoPlejer.setKvalitetVidea(1080);
        }
    }

}
