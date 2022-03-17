package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldIncreaseVolumeFrom0To1() {
        Radio radio = new Radio();
        int expected = 1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeFrom10() {
        Radio radio = new Radio();
        int expected = 10;
        radio.setCurrentVolume(expected);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeFrom2To1() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeFrom0() {
        Radio radio = new Radio();
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentVolume(expected);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeOverMax() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(20);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeUnderMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentVolume(-20);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseChannel() {
        Radio radio = new Radio();
        int expected = 1;
        radio.increaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseChannel() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setCurrentChannel(2);
        radio.decreaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFrom9To0Channel() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentChannel(9);
        radio.increaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFrom0To9Channel() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setCurrentChannel(0);
        radio.decreaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentChannel() {
        Radio radio = new Radio();
        int expected = 4;
        radio.setCurrentChannel(expected);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentChannelOverMax() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentChannel(20);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentChannelUnderMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setCurrentChannel(-20);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }
}