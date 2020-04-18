package bai_4;

import bai_3.PhanSo;

public class main_bai4 {
    public static void main(String[] args) {
        PhanSo phanSo1=new PhanSo(1,3);
        PhanSo phanSo2=new PhanSo(4,8);
        HonSo honSo1 = new HonSo(5,phanSo1);
        HonSo honSo2 = new HonSo(0,phanSo2);

        honSo1.congPhanSo(honSo2);
        honSo1.truPhanSo(honSo2);
        honSo1.nhanPhanSo(honSo2);
        honSo1.chiaPhanSo(honSo2);
    }
}
