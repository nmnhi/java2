package QuanLiDiem;

public class KhoaToan extends NamHoc2023 {
    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }

    // override

    @Override
    public void tinhDTB() {
        System.out.println("Day la phuong thuc cua khoa Toan");
    }
}
