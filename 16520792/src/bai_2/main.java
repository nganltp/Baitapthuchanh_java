package bai_2;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Nhap chieu dai hinh chu nhat: ");
        int chieuDai = input.nextInt();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        int chieuRong = input.nextInt();
        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
        System.out.println("Chu Vi hinh chu nhat: " + hcn.tinhChuVi());
        System.out.println("Dien Tich hinh chu nhat: " + hcn.tinhDienTich());

        System.out.print("Nhap canh hinh vuong: ");
        int canh = input.nextInt();
        HinhVuong hv = new HinhVuong(canh);
        System.out.println("Chu Vi hinh vuong: " + hv.tinhChuVi());
        System.out.println("Dien Tich hinh vuong: " + hv.tinhDienTich());

        System.out.print("Nhap ban kinh hinh tron: ");
        int banKinh = input.nextInt();
        HinhTron ht = new HinhTron(banKinh);
        System.out.println("Chu Vi hinh tron: " + ht.tinhChuVi());
        System.out.println("Dien Tich hinh tron: " + ht.tinhDienTich());

        System.out.print("Nhap chieu dai canh 1: ");
        int canh1 = input.nextInt();
        System.out.print("Nhap chieu dai canh 2: ");
        int canh2 = input.nextInt();
        System.out.print("Nhap chieu dai canh 3: ");
        int canh3 = input.nextInt();
        TamGiac htg = new TamGiac(canh1, canh2, canh3);
        System.out.println("Chu Vi hinh tam giac: " + htg.tinhChuVi());
        
    }
}
