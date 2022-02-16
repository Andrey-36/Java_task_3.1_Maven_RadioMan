package ru.netology.domain;

public class Radio {

    private int numberRadioChannel = 10;
    private int currentRadioStation = 8;
    private int currentSoundVolume = 100;

    public Radio() {
    }

    public Radio(int numberRadioChannel) {
        this.numberRadioChannel = numberRadioChannel;
    }

    public int getNumberRadioChannel() {
        return numberRadioChannel;
    }

    public int setNumberRadioChannel() {
        if (numberRadioChannel < 10) {
            numberRadioChannel = numberRadioChannel;
        }
        if (numberRadioChannel >= 10) {
            numberRadioChannel = 10;
        }
        this.numberRadioChannel = numberRadioChannel;
        return 0;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation() {
        currentRadioStation = numberRadioChannel - 1;

        this.currentRadioStation = currentRadioStation;
    }

    public int setNextRadioStation() {
        int nextRadioStation = currentRadioStation + 1;
        if (nextRadioStation >= numberRadioChannel) {
            nextRadioStation = 0;
        }
        return nextRadioStation;
    }

    public int setPrevRadioStation() {
        int prevRadioStation = currentRadioStation - 1;
        if (prevRadioStation < 0) {
            prevRadioStation = currentRadioStation;
        }
        return prevRadioStation;
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int currentSoundVolume) {
        if (currentSoundVolume > 100) {
            currentSoundVolume = 100;
        }
        if (currentSoundVolume < 0) {
            currentSoundVolume = 0;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void nextSoundVolume() {
        int nextSoundVolume = currentSoundVolume + 1;
        currentSoundVolume = nextSoundVolume;
//        setCurrentSoundVolume();
    }

    public void prevSoundVolume() {
        int prevSoundVolume = currentSoundVolume - 1;
        currentSoundVolume = prevSoundVolume;
//        setCurrentSoundVolume();
    }
}
