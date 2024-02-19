package TinhDaHinh;

public class TruongPhong extends NhanSu {
    // Contructor

    public TruongPhong(String ten, String cccd, String que) {
        super(ten, cccd, que);
    }

    public TruongPhong(String ten, String cccd) {
        super(ten, cccd);
    }

    public TruongPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return ngayCong * 50;
    }
}
