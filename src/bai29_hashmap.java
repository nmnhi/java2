import java.util.HashMap;
import java.util.Scanner;

public class bai29_hashmap {
    public static void main(String[] args) {
        /*
        Viết 1 chương trình sử dụng dict chứa 10 user và pwd
        Chương trình yêu cầu nhập vào username và pwd
        nết username 0 có dict, chương trình báo username không tòn tại
        nếu username đúng mà pwd sai thì báo: pwd sai
        nếu usename và pwd đúng thì báo bạn đã login thành công
        */
        // Tạo một hashmap chứa thông tin username và pwd
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "123456");
        users.put("user2", "123456");
        users.put("user3", "123456");
        users.put("user4", "123436");
        users.put("user5", "123466");
        users.put("user6", "1234656");
        users.put("user7", "123456");
        users.put("user8", "123456");
        users.put("user9", "123456");
        users.put("user10", "123456");
        // Nhap vao username
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap username");
        String userName = sc.nextLine();
        System.out.println("Nhap password");
        String pass = sc.nextLine();

        // Kiem tra
        if (!users.containsKey(userName)) {
            // new khong co key trong hashmap users thi user khong ton tai
            System.out.println("User khong ton tai");
        } else if (!users.get(userName).equals(pass)) {
            // Sai password
            System.out.println("Password sai");
        } else {
            System.out.println("Login thanh cong");
        }
    }
}
