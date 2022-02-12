package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void numberRadioChannel() {
        Radio cond = new Radio(5, 0);
        cond.setNumberRadioChannel();
        assertEquals(5, cond.getNumberRadioChannel());
    }

    @Test
    public void numberRadioChannelAboveInterval() {
        Radio cond = new Radio(11, 0);
        cond.setNumberRadioChannel();
        assertEquals(10, cond.getNumberRadioChannel());
    }

    @Test
    public void currentRadioStation() {
        Radio cond = new Radio(5, 0);
        cond.setCurrentRadioStation();
        assertEquals(4, cond.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStationDefaultLimit() {
        Radio cond = new Radio();
        cond.setNextRadioStation();
        assertEquals(9, cond.setNextRadioStation());
    }

    @Test
    public void nextRadioStationLimitSet() {
        Radio cond = new Radio(5, 0);
        cond.setCurrentRadioStation();
        cond.setNextRadioStation();
        assertEquals(0, cond.setNextRadioStation());
    }

    @Test
    public void prevRadioStationDefaultLimit() {
        Radio cond = new Radio();
        cond.setCurrentRadioStation();
        cond.setPrevRadioStation();
        assertEquals(8, cond.setPrevRadioStation());
    }

    @Test
    public void prevRadioStationLimitSet() {
        Radio cond = new Radio(1, 0);
        cond.setCurrentRadioStation();
        cond.setPrevRadioStation();
        assertEquals(0, cond.setPrevRadioStation());
    }

    @Test
    public void currentSoundVolume() {
        Radio cond = new Radio();
        cond.setCurrentSoundVolume();
        assertEquals(100, cond.getCurrentSoundVolume());
    }

    @Test
    public void nextSoundLevelDefaultLimit() {
        Radio cond = new Radio();
        cond.nextSoundVolume();
        assertEquals(100, cond.getCurrentSoundVolume());
    }

    @Test
    public void prevSoundVolumeLimitSet() {
        Radio cond = new Radio(5, 0);
        cond.prevSoundVolume();
        assertEquals(0, cond.getCurrentSoundVolume());
    }
}