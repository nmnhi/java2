package CongTy;

public class NhanVien {
    // Khai bao thuoc tinh
    protected String ten;
    protected String que;
    protected int cccd;
    protected double luongCoBan = 850;

    // Contructor


    public NhanVien(String ten, String que, int cccd) {
        this.ten = ten;
        this.que = que;
        this.cccd = cccd;
    }

    // Phuong thuc
    public double tinhLuong() {
        return luongCoBan;
    }

    public static void main(String[] args) {

    }
}
