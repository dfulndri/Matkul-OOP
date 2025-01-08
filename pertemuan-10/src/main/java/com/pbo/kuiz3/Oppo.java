package com.pbo.kuiz3;

// Class Oppo (implementasi Phone)
class Oppo implements Phone {
    private int volume = 50;
    private boolean isPowerOn = false;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Oppo menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Oppo mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("Volume Oppo: " + volume);
        } else {
            System.out.println("Volume maksimal atau ponsel mati.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("Volume Oppo: " + volume);
        } else {
            System.out.println("Volume minimal atau ponsel mati.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}

