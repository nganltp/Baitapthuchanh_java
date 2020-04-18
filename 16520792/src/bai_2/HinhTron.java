package bai_2;

import static java.lang.Math.PI;
import static java.lang.StrictMath.pow;

public class HinhTron {
    protected int banKinh;
    public HinhTron(int banKinh){
        super();
        this.banKinh = banKinh;
    }
    public double tinhChuVi(){
        return PI*2*banKinh;
    }
    public double tinhDienTich(){
        return PI*pow(banKinh,2);
    }

}
