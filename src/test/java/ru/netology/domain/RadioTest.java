package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio cond1 = new Radio();

    @Test
    public void numberRadioChannel() {
        Radio cond = new Radio(5, 9, 5, 40);
        cond.setNumberRadioChannel();
        assertEquals(5, cond.getNumberRadioChannel());
    }

    @Test
    public void numberRadioChannelAboveInterval() {
        cond1.setNumberRadioChannel();
        assertEquals(10, cond1.getNumberRadioChannel());
    }

    @Test
    public void maxRadioStation() {
        Radio cond = new Radio(10, 11, 5, 40);
        cond.setMaxRadioStation();
        assertEquals(9, cond.maxRadioStation());
    }

    @Test
    public void currentRadioStation() {
        Radio cond = new Radio(10, 9, 8, 40);
        cond.setCurrentRadioStation();
        assertEquals(8, cond.getCurrentRadioStation());
    }

    @Test
    public void nextRadioStation() {
        Radio cond = new Radio(10, 9, 9, 40);
        cond.nextRadioStation();
        assertEquals(0, cond.getCurrentRadioStation());
    }

    @Test
    public void prevRadioStation() {
        Radio cond = new Radio(10, 9, 0, 40);
        cond.prevRadioStation();
        assertEquals(9, cond.getCurrentRadioStation());
    }

    @Test
    public void currentSoundVolume() {
        Radio cond = new Radio(10, 9, 5, 40);
        cond.setCurrentSoundVolume();
        assertEquals(40, cond.getCurrentSoundVolume());
    }

    @Test
    public void nextSoundLevel() {
        Radio cond = new Radio(10, 9, 5, 100);
        cond.nextSoundLevel();
        assertEquals(100, cond.getCurrentSoundVolume());
    }

    @Test
    public void prevSoundLevel() {
        Radio cond = new Radio(10, 9, 5, 0);
        cond.prevSoundLevel();
        assertEquals(0, cond.getCurrentSoundVolume());
    }
}