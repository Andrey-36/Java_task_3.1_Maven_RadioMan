package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Radio {

    private int numberRadioChannel = 10;
    private int maxRadioStation = 9;
    private int currentRadioStation = 9;
    private int currentSoundVolume = 40;


    public int getNumberRadioChannel() {
        return numberRadioChannel;
    }

    public void setNumberRadioChannel() {
        if (numberRadioChannel < 10) {
            numberRadioChannel = numberRadioChannel;
        }
        if (numberRadioChannel >= 10) {
            numberRadioChannel = 10;
        }

        this.numberRadioChannel = numberRadioChannel;
    }

    public int maxRadioStation() {
        return maxRadioStation;
    }

    public void setMaxRadioStation() {
        this.maxRadioStation = numberRadioChannel - 1;

    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation() {
        if (currentRadioStation < 0) {
            currentRadioStation = maxRadioStation;
        }
        if (currentRadioStation > maxRadioStation) {
            currentRadioStation = 0;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void nextRadioStation() {
        currentRadioStation = currentRadioStation + 1;
        setCurrentRadioStation();
    }

    public void prevRadioStation() {
        currentRadioStation = currentRadioStation - 1;
        setCurrentRadioStation();
    }

    public int getCurrentSoundVolume() {
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume() {
        if (currentSoundVolume <= 0) {
            currentSoundVolume = 0;
        }
        if (currentSoundVolume >= 100) {
            currentSoundVolume = 100;
        }
        this.currentSoundVolume = currentSoundVolume;
    }

    public void nextSoundLevel() {
        currentSoundVolume = currentSoundVolume + 1;
        setCurrentSoundVolume();
    }

    public void prevSoundLevel() {
        currentSoundVolume = currentSoundVolume - 1;
        setCurrentSoundVolume();
    }
}