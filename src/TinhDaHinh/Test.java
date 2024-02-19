package TinhDaHinh;

public class Test {
    public static void main(String[] args) {
        NhanSu ns1 = new PhoPhong("Nguyen Minh Nhi", "1231", "HCM");
        // Xuat luong pho phong
        double luongPP = ns1.tinhLuong(21);
        System.out.println("Luc ns dang la pho phong");
        System.out.println(luongPP);
        System.out.println(ns1.getTen() + ":" + ns1.getCccd() + ":" + ns1.getQue());
        System.out.println("----------------------------------------------");
        // Thay doi chuc vu
        ns1 = new TruongPhong(ns1.getTen(), ns1.getCccd(), ns1.getQue());
        System.out.println("Lucs ns dang lam truong phong");
        double luongTP = ns1.tinhLuong(21);
        System.out.println(luongTP);
        System.out.println(ns1.getTen() + ":" + ns1.getCccd() + ":" + ns1.getQue());


    }
}
