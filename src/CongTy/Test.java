package CongTy;

public class Test {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("NV1", "Bac Ninh", 124123);
        double lNv1 = nv1.tinhLuong();
        System.out.println(lNv1);

        // Tao doi tuong la nhan vien hanh chinh
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("HC1", "Long An", 53454);
        double lhc1 = hc1.tinhLuong();
        System.out.println(lhc1);

        // Tao doi tuong nhan vien di ca
        NhanVienDiCA ca1 = new NhanVienDiCA("CA1", "HCM", 12314);
        double lca1 = ca1.tinhLuong();
        System.out.println(lca1);
    }
}
