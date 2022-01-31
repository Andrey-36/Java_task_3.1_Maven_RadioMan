package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void selectRadioStation() {
        Radio cond = new Radio();

        cond.setSelectRadioStation(7);
//        cond.currentRadioStation = 9;

        int expected = 7;
        int actual = cond.getSelectRadioStation(); //cond.currentRadioStation;

        assertEquals(expected, actual);
    }

    @Test
    public void selectRadioStationAboveInterval() {
        Radio cond = new Radio();
        cond.setSelectRadioStation(10);

        int expected = 0;
        int actual = cond.getSelectRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void selectRadioStationBelowInterval() {
        Radio cond = new Radio();
        cond.setSelectRadioStation(-1);

        int expected = 0;
        int actual = cond.getSelectRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation9() {
        Radio cond = new Radio();
        cond.setSelectRadioStation(9);
        cond.setNextRadioStation();

        int expected = 0;
        int actual = cond.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationInsideInterval() {
        Radio cond = new Radio();
        cond.setSelectRadioStation(4);
        cond.setNextRadioStation();

        int expected = 5;
        int actual = cond.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationZero() {
        Radio cond = new Radio();
        cond.setSelectRadioStation(0);
        cond.setPrevRadioStation();

        int expected = 9;
        int actual = cond.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio cond = new Radio();
        cond.setSelectRadioStation(8);
        cond.setPrevRadioStation();

        int expected = 7;
        int actual = cond.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationAboveInterval() {
        Radio cond = new Radio();
        cond.setSelectRadioStation(10);
        cond.setPrevRadioStation();

        int expected = 9;
        int actual = cond.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationBelowInterval() {
        Radio cond = new Radio();
        cond.setSelectRadioStation(-1);
        cond.setPrevRadioStation();

        int expected = 9;
        int actual = cond.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void selectSoundVolume() {
        Radio cond = new Radio();
        cond.setSelectSoundVolume(1);

        int expected = 1;
        int actual = cond.getSelectSoundVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void selectSoundVolumeAboveInterval() {
        Radio cond = new Radio();
        cond.setSelectSoundVolume(11);

        int expected = 0;
        int actual = cond.getSelectSoundVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void selectSoundVolumeBelowInterval() {
        Radio cond = new Radio();
        cond.setSelectSoundVolume(-1);

        int expected = 0;
        int actual = cond.getSelectSoundVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void maximumSoundLevel() {
        Radio cond = new Radio();
        cond.setSelectSoundVolume(9);
        cond.setMaximumSoundLevel();

        int expected = 10;
        int actual = cond.getMaximumSoundLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void maximumSoundLevelAboveInterval() {
        Radio cond = new Radio();
        cond.setSelectSoundVolume(10);
        cond.setMaximumSoundLevel();
        int expected = 10;
        int actual = cond.getMaximumSoundLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void maximumSoundLevelZero() {
        Radio cond = new Radio();
        cond.setSelectSoundVolume(0);
        cond.setMaximumSoundLevel();
        int expected = 0;
        int actual = cond.getMaximumSoundLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void minimumSoundLevel() {
        Radio cond = new Radio();
        cond.setSelectSoundVolume(0);
        cond.setMinimumSoundLevel();

        int expected = 0;
        int actual = cond.getMinimumSoundLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void minimumSoundLevelInsideInterval() {
        Radio cond = new Radio();
        cond.setSelectSoundVolume(2);
        cond.setMinimumSoundLevel();
        int expected = 1;
        int actual = cond.getMinimumSoundLevel();

        assertEquals(expected, actual);
    }
}