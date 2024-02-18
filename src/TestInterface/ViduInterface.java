package TestInterface;

public interface ViduInterface {
    // Tap cac thuoc tinh (chi duoc phep là hằng số)
    static final double phuCap = 15; //15$

    // Các phương thức phải là trừu tượng
    public abstract void thongTin(String ten, String cccd, int namSinh);

    public abstract double tinhLuong(double luongNgay, int soNgayCong);

}
