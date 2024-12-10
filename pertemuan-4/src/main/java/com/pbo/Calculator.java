package com.pbo;
//SESI 4

public class Calculator {
    public double operan1;
    public double operan2;

    public void isiOperan1(double operan1) {
        this.operan1 = operan1;
    }
    public void isiOperan2(double operan2) {
        this.operan2 = operan2;
    }
    public double tambah() {
        return operan1 + operan2;
    }
    public double kurang() {
        return operan1 - operan2;
    }
    public double kali() {
        return operan1 * operan2;
    }
    public double bagi() {
        if (operan2 != 0) {
            return operan1 / operan2;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }
    public double pangkat() {
        return Math.pow(operan1, operan2);
    }
}

// Tanpa kata kunci `public`
class CalculatorMain{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        // Mengisi operan
        calc.isiOperan1(10.0);
        calc.isiOperan2(4.0);
        // Menampilkan hasil perhitungan
        System.out.println("Operasi1 + Operasi2 = " + calc.tambah());
        System.out.println("Operasi1 - Operasi2 = " + calc.kurang());
        System.out.println("Operasi1 * Operasi2 = " + calc.kali());
        System.out.println("Operasi1 / Operasi2 = " + calc.bagi());
        System.out.println("Operasi1 ^ Operasi2 = " + calc.pangkat());
    }
}