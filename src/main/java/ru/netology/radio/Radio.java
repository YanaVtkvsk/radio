package ru.netology.radio;

public class Radio {
    private int currentStation;
    private int currentVolume;
    private int maxStation;
    private int minStation;


    public Radio() {
        this.maxStation = 9;
        this.minStation = 0;
    }

    public Radio(int stationsAmount) {
        this.maxStation = stationsAmount - 1;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        } else {
            this.currentVolume = currentVolume;
        }
    }

    public void next() {
        if (currentStation < maxStation) {
            currentStation++;
        } else {
            this.currentStation = minStation;
        }
    }

    public void previous() {
        if (currentStation > minStation) {
            currentStation--;
        } else {
            this.currentStation = maxStation;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }
}

