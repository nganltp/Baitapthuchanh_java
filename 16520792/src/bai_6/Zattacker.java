package bai_6;

import java.util.Random;

public class Zattacker {
    private double M, P;
    public Zattacker(){
        Random generator = new Random();
        this.M = 50;
        this.P = 20 + 10*generator.nextDouble();
    }
    public double getM(){ return this.M;}
    public double getP(){return this.P;}
    public double nangLuongTieuThu(double S){
        return this.M * S + this.P * this.P * S;
    }
}
