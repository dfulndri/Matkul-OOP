package com.pbo.kuiz3;

// Class Samsung (implementasi Phone)
class Samsung implements Phone {
    private int volume = 50;
    private boolean isPowerOn = false;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Samsung menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Samsung mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("Volume Samsung: " + volume);
        } else {
            System.out.println("Volume maksimal atau ponsel mati.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("Volume Samsung: " + volume);
        } else {
            System.out.println("Volume minimal atau ponsel mati.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
