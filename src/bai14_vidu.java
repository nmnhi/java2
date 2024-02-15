import java.util.Scanner;

public class bai14_vidu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so nguyen tu 1 toi 99");
        int s = sc.nextInt();
        while (s < 1 || s > 99) {
            System.out.println("Nhap lai");
            s = sc.nextInt();
        }
        System.out.println("Ban da nhap xong");
    }
}
