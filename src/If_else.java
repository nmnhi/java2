import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        /* Viet chuong trinh nhap vao 1 nam va kiem tra do la nam nhuan hay khong
         * Goi y nam nhuan la nam chia het cho 4, va khong chia het cho 100 hoac chia het cho 400
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a year");
        int year = sc.nextInt();
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("This is year " + year + " Nhuan");
        } else {
            System.out.println("This is not Nhuan");
        }
    }
}
