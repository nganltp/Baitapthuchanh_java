package bai_6;

import java.util.Random;

public class Pedion {
    private double M, F;
    public Pedion(){
        Random generator = new Random();
        this.M = 20;
        this.F = 1 + generator.nextDouble()*5;
    }
    public double getM(){ return this.M;}
    public double getF(){return this.F;}
    public double nangLuongTieuThu(double S){
        return (this.M*S + (this.F + 1) *S) / 2;
    }
}
