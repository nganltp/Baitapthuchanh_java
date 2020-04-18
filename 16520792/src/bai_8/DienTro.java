package bai_8;

public class DienTro {
    private double R;
    public DienTro(double R){
        this.R = R;
    }
    public double tongNoiTiep(double R1){
        return this.R + R1;
    }
    public double tongSongSong(double R1){
        return 1/(1/this.R + 1/R1);
    }
    public static void main(String[] args){
        DienTro R1 = new DienTro(1);
        DienTro R2 = new DienTro(2);
        DienTro R3 = new DienTro(3);
        System.out.println("Tong tro: " + R1.tongNoiTiep(R2.tongSongSong(R3.R)));
    }
}
