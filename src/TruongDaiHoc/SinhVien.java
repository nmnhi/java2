package TruongDaiHoc;

public class SinhVien {
    // thuoc tinh
    private String hoTen;
    private double diem;

    // Khoi tao contructors mac dinh
    // Khoi tao cac gia tri mac dinh
    // Ngay khi doi tuong duoc tao ra
    // command + N
    public SinhVien() {
        hoTen = "No name";
        diem = 0.0;
    }

    public SinhVien(String hoTen) {
        this.hoTen = hoTen;
    }

    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
    }

    // phuong thuc (ham)
    // phuong thuc khong co kieu tra ve
    public void hienThiThongTin() {
        System.out.println(hoTen + " : " + diem);
    }

    // get, set

    public String getHoTen() {
        return hoTen;
    }

    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
