import TruongDaiHoc.SinhVien;

public class bai30_oop {
    public static void main(String[] args) {
        // khoi tao doi tuong thuoc class TruongDaiHoc.SinhVien
        SinhVien sv1 = new SinhVien();
        SinhVien sv2 = new SinhVien();
        sv1.hienThiThongTin();
        sv2.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Teo");
        sv3.hienThiThongTin();
        SinhVien sv4 = new SinhVien("Minh Nhi", 8.0);
        sv4.hienThiThongTin();
        System.out.println(sv4.getHoTen());
        System.out.println(sv4.getDiem());
        sv4.setDiem(9.5);
        sv4.setHoTen("AAAAAAAAA");
        sv4.hienThiThongTin();
    }
}
