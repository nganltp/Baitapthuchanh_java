package bai_4;

import bai_3.PhanSo;

public class HonSo extends PhanSo {
    protected int phanNguyen;
    protected PhanSo phanPhanSo;

    public HonSo(int phanNguyen, PhanSo phanPhanSo) {
        super();
        mau = phanPhanSo.getMau();
        tu = phanPhanSo.getMau() * phanNguyen + phanPhanSo.getTu();
    }

}
