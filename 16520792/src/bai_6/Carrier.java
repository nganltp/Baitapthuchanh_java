package bai_6;

import java.util.Random;

public class Carrier {
    private double M, E;
    public Carrier(){
        Random generator = new Random();
        this.M = 30;
        this.E = 50 * generator.nextDouble() + 50;
    }
    public double getM(){ return this.M;}
    public double getE(){return this.E;}
    public double nangLuongTieuThu(double S){
        return  this.M * S + 4 * this.E * S;
    }
}
