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


    public int getNextRadioStation() {
        return selectRadioStation;
    }

    public void setNextRadioStation() {
        if (selectRadioStation < 9) {
            selectRadioStation = selectRadioStation + 1;
        }
        if (selectRadioStation >= 9) {
            selectRadioStation = 0;
        }
        this.selectRadioStation = selectRadioStation;
    }

    public int getPrevRadioStation() {
        return selectRadioStation;
    }

    public void setPrevRadioStation() {
        if (selectRadioStation > 0) {
            selectRadioStation = selectRadioStation - 1;
        }
        if (selectRadioStation <= 0) {
            selectRadioStation = 9;
        }

        this.selectRadioStation = selectRadioStation;
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

    public int getMaximumSoundLevel() {
        return selectSoundVolume;
    }

    public void setMaximumSoundLevel() {
        if (selectSoundVolume >= 10) {
            selectSoundVolume = 10;
        }
        if (selectSoundVolume <= 0) {
            selectSoundVolume = 0;
            return;
        }
        if (selectSoundVolume < 10) {
            selectSoundVolume = selectSoundVolume + 1;
        }
        this.selectSoundVolume = selectSoundVolume;
    }

    public int getMinimumSoundLevel() {
        return selectSoundVolume;
    }

    public void setMinimumSoundLevel() {
        if (selectSoundVolume <= 0) {
            selectSoundVolume = 0;
        }
        if (selectSoundVolume > 0) {
            selectSoundVolume = selectSoundVolume - 1;
        }
        this.selectSoundVolume = selectSoundVolume;
    }
}