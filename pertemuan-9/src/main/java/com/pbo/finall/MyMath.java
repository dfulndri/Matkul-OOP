package com.pbo.finall;

public final class MyMath {
    public final double PI = 3.14;
    public final double luasLingkaran (double radius){
        return PI*radius*radius;
    }
    public final double kelilingLingkaran(double radius){
        return 2*PI*radius;
    }
    public final double sin(double derajat){
        return Math.sin(Math.toRadians(derajat));
    }
    public final double cos (double derajat){
        return Math.cos(Math.toRadians(derajat));
    }
    public final double tan (double derajat){
        return Math.tan(Math.toRadians(derajat));
    }
    public final double pangkat (double x, double y){
        return Math.pow(x,y);
    } 
}