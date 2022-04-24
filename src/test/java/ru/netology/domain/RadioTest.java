package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio radio = new Radio(
            0,
            0,
            9,
            0,
            100,
            0
    );

    @Test
    void shouldIncreaseVolumeFrom0To1() {
        int expected = 1;
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotIncreaseVolumeFrom100() {
        int expected = 100;
        radio.setCurrentVolume(expected);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeFrom2To1() {
        int expected = 1;
        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotDecreaseVolumeFrom0() {
        int expected = 0;
        radio.decreaseVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        int expected = 4;
        radio.setCurrentVolume(expected);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeOverMax() {
        int expected = 100;
        radio.setCurrentVolume(100);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentVolumeUnderMin() {
        int expected = 0;
        radio.setCurrentVolume(-20);
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseChannel() {
        int expected = 1;
        radio.increaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseChannel() {
        int expected = 1;
        radio.setCurrentChannel(2);
        radio.decreaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFrom9To0Channel() {
        int expected = 0;
        radio.setCurrentChannel(9);
        radio.increaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldTransitFrom0To9Channel() {
        int expected = 9;
        radio.setCurrentChannel(0);
        radio.decreaseChannel();
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentChannel() {
        int expected = 4;
        radio.setCurrentChannel(expected);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentChannelOverMax() {
        int expected = 0;
        radio.setCurrentChannel(20);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNotSetCurrentChannelUnderMin() {
        int expected = 0;
        radio.setCurrentChannel(-20);
        int actual = radio.getCurrentChannel();
        assertEquals(expected, actual);
    }
}