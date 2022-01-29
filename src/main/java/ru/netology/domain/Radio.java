package ru.netology.domain;

public class Radio {

    private int selectRadioStation;

    public int getSelectRadioStation() {
        return selectRadioStation;
    }

    public void setSelectRadioStation(int selectRadioStation) {
        if (selectRadioStation < 0) {
            return;
        }
        if (selectRadioStation > 9) {
            return;
        }
        this.selectRadioStation = selectRadioStation;
    }

    private int nextRadioStation;

    public int getNextRadioStation() {
        return nextRadioStation;
    }

    public int setNextRadioStation(int currentRadioStation) {
        if (currentRadioStation < 9) {
            nextRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation >= 9) {
            nextRadioStation = 0;
        }
        this.nextRadioStation = nextRadioStation;
        return nextRadioStation;
    }

    private int prevRadioStation;

    public int getPrevRadioStation() {
        return prevRadioStation;
    }

    public int setPrevRadioStation(int currentRadioStation) {
        if (currentRadioStation <= 9) {
            prevRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation <= 0) {
            prevRadioStation = 9;
        }
        this.prevRadioStation = prevRadioStation;
        return prevRadioStation;
    }

    private int selectSoundVolume;

    public int getSelectSoundVolume() {
        return selectSoundVolume;
    }

    public void setSelectSoundVolume(int selectSoundVolume) {
        if (selectSoundVolume < 0) {
            return;
        }
        if (selectSoundVolume > 10) {
            return;
        }
        this.selectSoundVolume = selectSoundVolume;
    }

    private int maximumSoundLevel;

    public int getMaximumSoundLevel() {
        return maximumSoundLevel;
    }

    public void setMaximumSoundLevel(int currentSoundLevel) {
        if (currentSoundLevel >= 10) {
            maximumSoundLevel = currentSoundLevel;
        }
        if (currentSoundLevel < 10) {
            currentSoundLevel = currentSoundLevel + 1;
        }
        this.maximumSoundLevel = currentSoundLevel;
    }

    private int minimumSoundLevel;

    public int getMinimumSoundLevel() {
        return minimumSoundLevel;
    }

    public void setMinimumSoundLevel(int currentSoundLevel) {
        if (currentSoundLevel == 0) {
            minimumSoundLevel = currentSoundLevel;
        }
        if (currentSoundLevel > 0) {
            currentSoundLevel = currentSoundLevel - 1;
        }
        this.minimumSoundLevel = currentSoundLevel;
    }
}



