package ru.netology.domain;

public class Radio {

    private int currentChannel;
    private int currentVolume;
    private int maxChannel = 9;
    private int minChannel;
    private int maxVolume = 100;
    private int minVolume;

    public Radio(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public Radio() {
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseChannel() {
        if (currentChannel == maxChannel) {
            currentChannel = minChannel;
        } else {
            currentChannel = currentChannel + 1;
        }
    }

    public void decreaseChannel() {
        if (currentChannel == minChannel) {
            currentChannel = maxChannel;
        } else {
            currentChannel = currentChannel - 1;
        }
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > maxChannel) {
            return;
        }
        if (currentChannel < minChannel) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }
}