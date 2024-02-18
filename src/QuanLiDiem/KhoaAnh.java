package QuanLiDiem;

public class KhoaAnh extends NamHoc2023 {
    public KhoaAnh(String ten, String cccd) {
        super(ten, cccd);
    }

    // Override

    @Override
    public void tinhDTB() {
        System.out.println("Day la phuong thuc cua khoa Anh");
    }
}
