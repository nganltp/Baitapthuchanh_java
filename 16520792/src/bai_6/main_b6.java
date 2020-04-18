package bai_6;

import java.util.Scanner;

public class main_b6 {
    public static void main(String[] args){
        double S = 10;
        Scanner input= new Scanner(System.in);

        System.out.print("Nhap so luong robot Pedion: ");
        int A = input.nextInt();
        System.out.print("Nhap so luong robot Zattacker: ");
        int B = input.nextInt();
        System.out.print("Nhap so luong robot Carrier: ");
        int C = input.nextInt();

        Pedion[] arr_Pedion = new Pedion[A];
        Zattacker[] arr_Zattacker = new Zattacker[B];
        Carrier[] arr_Carrier = new Carrier[C];

        System.out.println("Cau A: ");
        for(int i =0;i<arr_Pedion.length;i++)
        {
            System.out.println("Pedion " + i + " : M = " + arr_Pedion[i].getM() + ", F = " + arr_Pedion[i].getF() + ", E tieu thu: " + arr_Pedion[i].nangLuongTieuThu(S));
        }
        for(int i =0;i<arr_Zattacker.length;i++)
        {
            System.out.println("Zattacker " + i + " : M = " + arr_Zattacker[i].getM() + ", P = " + arr_Zattacker[i].getP() + ", E tieu thu: " + arr_Zattacker[i].nangLuongTieuThu(S));
        }
        for(int i =0;i<arr_Carrier.length;i++)
        {
            System.out.println("Zattacker " + i + " : M = " + arr_Carrier[i].getM() + ", P = " + arr_Carrier[i].getE() + ", E tieu thu: " + arr_Carrier[i].nangLuongTieuThu(S));
        }
        System.out.println("Cau C: ");
        



    }
}
