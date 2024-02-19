package TinhDaHinh;

public class PhoPhong extends NhanSu {
    // Contructor
    public PhoPhong(String ten, String cccd, String que) {
        super(ten, cccd, que);
    }

    public PhoPhong(String ten, String cccd) {
        super(ten, cccd);
    }

    public PhoPhong() {
    }

    @Override
    public double tinhLuong(int ngayCong) {
        return ngayCong * 40;
    }
}
