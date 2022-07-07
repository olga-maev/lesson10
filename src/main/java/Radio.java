import java.io.*;
import java.util.Scanner;

public class Radio {
    private int countRadio = 10;
    private int maxStation = countRadio - 1;
    private int usercountStation;
    private int currentStation = maxStation;
    private int currentVolume;

    public Radio(int countRadio) {
        this.countRadio = countRadio;
        this.maxStation = countRadio - 1;
        this.currentStation = countRadio - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNumberStation(int newcurrentStation) {
        if (newcurrentStation > maxStation) {
            currentStation = 0;
        }
        if (newcurrentStation < 0) {
            currentStation = maxStation;
        }
        if ((newcurrentStation < countRadio) && (newcurrentStation > -1)) {
            currentStation = newcurrentStation;
        }
        ;
    }

    public void increaseVolume(int newcurrentVolume) {

        if ((newcurrentVolume < 11) && (newcurrentVolume > -1)) {
            currentVolume = newcurrentVolume;
        } else return;
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
