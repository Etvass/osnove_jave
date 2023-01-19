package d17_1_2023;

public class TimeControl extends Control{

    private boolean premotavanjeUdesno;

    public TimeControl() {
    }

    public TimeControl(boolean premotavanjeUdesno) {
        this.premotavanjeUdesno = premotavanjeUdesno;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer nekiVideoPlejer) {
        double kolikoImaDoKrajaVidea = nekiVideoPlejer.getDuzinaVidea()-nekiVideoPlejer.getTrenutnoVremeVidea();
        double premotavanje = 15;

        if (this.premotavanjeUdesno) {
            if (kolikoImaDoKrajaVidea<15) {
                premotavanje=kolikoImaDoKrajaVidea;
            }else {
                premotavanje=15;
            }
        }else {
            if (nekiVideoPlejer.getTrenutnoVremeVidea()<15) {
                premotavanje=nekiVideoPlejer.getTrenutnoVremeVidea();
            }else {
                premotavanje=15;
            }
        }

        if (premotavanjeUdesno) {
            nekiVideoPlejer.setTrenutnoVremeVidea(nekiVideoPlejer.getTrenutnoVremeVidea()+premotavanje);
        }else {
            nekiVideoPlejer.setTrenutnoVremeVidea(nekiVideoPlejer.getTrenutnoVremeVidea()-premotavanje);
        }

    }

}
