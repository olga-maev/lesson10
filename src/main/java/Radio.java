public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNumberStation(int newcurrentStation) {
        if (newcurrentStation > 9) {
            currentStation = 0;
        }
        if (newcurrentStation < 0) {
            currentStation = 9;
        }
        if ((newcurrentStation < 10) && (newcurrentStation > -1)) {
            currentStation = newcurrentStation;
        }
        ;
    }

    public void increaseVolume(int newcurrentVolume) {

        if ((newcurrentVolume < 11) && (newcurrentVolume > -1)) {
            currentVolume = newcurrentVolume;
        }
        else return;
    }

    public void nextStation() {
        int currentStation = getCurrentStation();
        currentStation++;
        setNumberStation(currentStation);
    }

    public void nextVolume() {
        int currentVolume = getCurrentVolume();
        currentVolume++;
        increaseVolume(currentVolume);
    }
    public void prevStation() {
        int currentStation = getCurrentStation();
        currentStation--;
        setNumberStation(currentStation);
    }
    public void prevVolume() {
        int currentVolume = getCurrentVolume();
        currentVolume--;
        increaseVolume(currentVolume);
    }
}
