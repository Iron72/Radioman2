package ru.netology.domain;

public class Radio {

    private int currentChannel;
    private int currentVolume;
    private int quantityChannel = 10;

    public Radio(int quantityChannel) {
        this.quantityChannel=quantityChannel;
    }

    public Radio() {
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }


    public void increaseChannel() {
        if (currentChannel < quantityChannel- 1) {
            currentChannel++;
        } else {
            currentChannel = 0;
        }
    }

    public void decreaseChannel() {
        if (currentChannel > 0) {
            currentChannel--;
        } else {
            currentChannel = quantityChannel - 1;
        }
    }

    public void setCurrentChannel(int currentChannel) {
        if (currentChannel > quantityChannel - 1) {
            return;
        }
        if (currentChannel < 0) {
            return;
        }
        this.currentChannel = currentChannel;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }
}