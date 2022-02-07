package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void selectRadioStation() {
        Radio cond = new Radio();

        cond.setSelectRadioStation(7); //        cond.currentRadioStation = 9;

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
        cond.setNextRadioStation(9);

        int expected = 0;
        int actual = cond.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationAboveInterval() {
        Radio cond = new Radio();
        cond.setNextRadioStation(10);

        int expected = 0;
        int actual = cond.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationInsideInterval() {
        Radio cond = new Radio();
        cond.setNextRadioStation(8);

        int expected = 9;
        int actual = cond.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationZero() {
        Radio cond = new Radio();
        cond.setPrevRadioStation(0);

        int expected = 9;
        int actual = cond.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio cond = new Radio();
        cond.setPrevRadioStation(1);

        int expected = 0;
        int actual = cond.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationAboveInterval() {
        Radio cond = new Radio();
        cond.setPrevRadioStation(10);

        int expected = 9;
        int actual = cond.getPrevRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationBelowInterval() {
        Radio cond = new Radio();
        cond.setPrevRadioStation(-1);

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
        cond.setMaximumSoundLevel(9);

        int expected = 10;
        int actual = cond.getMaximumSoundLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void maximumSoundLevelAboveInterval() {
        Radio cond = new Radio();
        cond.setMaximumSoundLevel(10);
        int expected = 10;
        int actual = cond.getMaximumSoundLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void maximumSoundLevelZero() {
        Radio cond = new Radio();
        cond.setMaximumSoundLevel(0);
        int expected = 0;
        int actual = cond.getMaximumSoundLevel();
        assertEquals(expected, actual);
    }

    @Test
    public void minimumSoundLevel() {
        Radio cond = new Radio();
        cond.setMinimumSoundLevel(0);

        int expected = 0;
        int actual = cond.getMinimumSoundLevel();

        assertEquals(expected, actual);
    }

    @Test
    public void minimumSoundLevelInsideInterval() {
        Radio cond = new Radio();
        cond.setMinimumSoundLevel(2);
        int expected = 1;
        int actual = cond.getMinimumSoundLevel();

        assertEquals(expected, actual);
    }
}