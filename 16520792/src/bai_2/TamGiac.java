package bai_2;

public class TamGiac {
    protected int canh1, canh2, canh3;
    public TamGiac(int canh1, int canh2, int canh3) {
        super();
        this.canh1 = canh1;
        this.canh2 = canh2;
        this.canh3 = canh3;
    }
    public int tinhChuVi(){
        return canh1+canh2+canh3;
    }

}
