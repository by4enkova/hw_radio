package ru.netology.radioman;

public class Radio {
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume +1;
        }
    }
}
