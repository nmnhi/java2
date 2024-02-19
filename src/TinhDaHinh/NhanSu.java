package TinhDaHinh;

public abstract class NhanSu {
    // Thuoc tinh
    private String ten;
    private String cccd;
    private String que;

    // Tao contructor

    public NhanSu(String ten, String cccd, String que) {
        this.ten = ten;
        this.cccd = cccd;
        this.que = que;
    }

    public NhanSu(String ten, String cccd) {
        this.ten = ten;
        this.cccd = cccd;
    }

    public NhanSu() {
    }

    // phuong thuc tinh luong
    public abstract double tinhLuong(int ngayCong);

    public String getTen() {
        return ten;
    }

    public String getCccd() {
        return cccd;
    }

    public String getQue() {
        return que;
    }
}
