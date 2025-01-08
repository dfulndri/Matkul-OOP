package com.pbo.kuiz3;

// Main Class
public class Main {
    public static void main(String[] args) {
        // Xiaomi
        Phone xiaomi = new Xiaomi();
        PhoneUser userXiaomi = new PhoneUser(xiaomi);

        System.out.println("=== Xiaomi ===");
        userXiaomi.turnOnThePhone();
        userXiaomi.makePhoneLouder();
        userXiaomi.makePhoneSilent();
        userXiaomi.turnOffThePhone();

        // Samsung
        Phone samsung = new Samsung();
        PhoneUser userSamsung = new PhoneUser(samsung);

        System.out.println("\n=== Samsung ===");
        userSamsung.turnOnThePhone();
        userSamsung.makePhoneLouder();
        userSamsung.makePhoneSilent();
        userSamsung.turnOffThePhone();

        // iPhone
        Phone iphone = new iPhone();
        PhoneUser useriPhone = new PhoneUser(iphone);

        System.out.println("\n=== iPhone ===");
        useriPhone.turnOnThePhone();
        useriPhone.makePhoneLouder();
        useriPhone.makePhoneSilent();
        useriPhone.turnOffThePhone();

        // Oppo
        Phone oppo = new Oppo();
        PhoneUser userOppo = new PhoneUser(oppo);

        System.out.println("\n=== Oppo ===");
        userOppo.turnOnThePhone();
        userOppo.makePhoneLouder();
        userOppo.makePhoneSilent();
        userOppo.turnOffThePhone();
    }
}

