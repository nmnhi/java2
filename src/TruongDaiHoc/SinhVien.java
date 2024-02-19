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

    // phuong thuc co kieu tra ve
    public double tinhDTB(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }

    // phuong thuc 2
    public double tinhDTB(double diemToan, double diemVan, double diemAnh) {
        return (diemToan + diemVan + diemAnh) / 3;
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

    // phuong thuc toString

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }

    // support method va Service method
    // Support method
    // Kiem tra khi nhap ho so sinh vien
    private boolean checkDiem() {
        return this.diem >= 24;
    }

    // Service method
    public void checkHopLeDiem() {
        if (checkDiem()) {
            System.out.println("Diem hop le");
        } else {
            System.out.println("Diem khong hop le");
        }
    }

    // parameter list
    public double TongDiem(double... array) {
        double tong = 0.0;
        for (double x : array) {
            tong += x;
        }
        return tong;
    }

    public double DiemTrungBinh(double... arr) {
        double tb = 0.0;
        double tong = 0.0;
        for (double x : arr) {
            tong += x;
        }
        return tong / (arr.length);
    }
}
