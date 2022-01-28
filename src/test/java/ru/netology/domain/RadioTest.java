package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void selectRadioStation() {
        Radio cond = new Radio();

        cond.setSelectRadioStation(9);
//        cond.currentRadioStation = 9;

        int expected = 9;
        int actual = cond.getSelectRadioStation(); //cond.currentRadioStation;

        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio cond = new Radio();
        cond.setNextRadioStation(9);

        int expected = 0;
        int actual = cond.getNextRadioStation();

        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio cond = new Radio();
        cond.setPrevRadioStation(0);

        int expected = 9;
        int actual = cond.getPrevRadioStation();

        assertEquals(expected, actual);
    }
}