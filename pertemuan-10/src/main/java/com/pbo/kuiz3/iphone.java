package com.pbo.kuiz3;

// Class iPhone (implementasi Phone)
class iPhone implements Phone {
    private int volume = 50;
    private boolean isPowerOn = false;

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("iPhone menyala.");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("iPhone mati.");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn && volume < MAX_VOLUME) {
            volume += 10;
            System.out.println("Volume iPhone: " + volume);
        } else {
            System.out.println("Volume maksimal atau ponsel mati.");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn && volume > MIN_VOLUME) {
            volume -= 10;
            System.out.println("Volume iPhone: " + volume);
        } else {
            System.out.println("Volume minimal atau ponsel mati.");
        }
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
