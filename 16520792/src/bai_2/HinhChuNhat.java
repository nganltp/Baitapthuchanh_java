package bai_2;

public class HinhChuNhat {
    protected int chieuDai, chieuRong;
    public HinhChuNhat(int chieuDai, int chieuRong) {
        super();
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhChuNhat() {

    }

    public int tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    public int tinhDienTich() {
        return chieuDai * chieuRong;
    }
}
