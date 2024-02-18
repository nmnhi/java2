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
        sv4.setDiem(25);
        sv4.setHoTen("AAAAAAAAA");
        sv4.hienThiThongTin();

        //test phuong thuc co kieu tra ve
        double dtbsv4 = sv1.tinhDTB(10, 8);
        System.out.println("Dien trung sv4: " + dtbsv4);

        // Test phuong thuc toString
        System.out.println(sv4);
        sv4.checkHopLeDiem();

        // overloading
        double test = sv4.tinhDTB(10, 9, 8);
        System.out.println(test);
        double test1 = sv4.tinhDTB(8, 8);
        System.out.println(test1);

        double tongDiem = sv4.TongDiem(10, 8, 5);
        System.out.println(tongDiem);

        double trungBinh = sv4.DiemTrungBinh(10, 5, 8, 9);
        System.out.println(trungBinh);
    }
}

