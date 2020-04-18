package bai_1;
import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class ToaDo {
    private int x,y;
    public int getX(){
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y = y;
    }
    public int Nhap()
    {
        Scanner input= new Scanner(System.in);
        boolean check= false;
        int n=0;
        while(!check) {
            System.out.print(" ");
            try {
                n = input.nextInt();
                check = true;

            } catch (Exception e) {
                System.out.println("Ban phai nhap so! hay nhap lai...");
                input.nextLine();
            }
        }
        return n;

    }
    public double KhoangCach(ToaDo B){
        return sqrt(pow((this.x + B.x),2) + pow((this.y - B.y),2));

    }
    public static void main(String[] args){
        ToaDo A = new ToaDo();
        ToaDo B = new ToaDo();
        System.out.println("Nhap toa do diem A: ");
        A.setX(A.Nhap());
        A.setY(A.Nhap());
        System.out.println("Nhap toa do diem B: ");
        B.setX(B.Nhap());
        B.setY(B.Nhap());
        System.out.println("Toa do diem A la: (" + A.getX() + "; " + A.getY() + ")");
        System.out.println("Toa do diem B la: (" + B.getX() + "; " + B.getY() + ")");
        System.out.println("Khoang cach: " + A.KhoangCach(B));
    }
}
