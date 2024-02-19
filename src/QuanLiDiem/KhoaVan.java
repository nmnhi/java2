package QuanLiDiem;

public class KhoaVan extends NamHoc2023 {
    public KhoaVan(String ten, String cccd) {
        super(ten, cccd);
    }

    // Override

    @Override
    public void tinhDTB() {
        System.out.println("Day la phuong thuc cua khoa Van");
    }
}
