package QuanLiDiem;

public class TestDiem {
    public static void main(String[] args) {
        // Khoi tao doi tuong
        KhoaToan toan1 = new KhoaToan("Minh Nhi", "12312123");
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("Nhi Nguyen", "12314563");
        anh1.tinhDTB();
    }
}
