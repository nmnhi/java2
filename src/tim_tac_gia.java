import java.util.Scanner;

public class tim_tac_gia {
    public static void main(String[] args) {
        /*
         * Viet chuong trinh khung tim kiem cho nguoi nhap lua chon
         * 1 Tim theo ten
         * 2 Tim theo tac gia
         * 3 Tim theo nha san xuat
         * 4 Tim theo tieu de
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban bam phim de chon");
        System.out.println("Bam phim 1 de tim theo ten");
        System.out.println("Bam phim 2 de tim theo tac gia");
        System.out.println("Bam phim 3 de tim theo nha san xua");
        System.out.println("Bam phim 4 de tim theo tieu de");
        int s = sc.nextInt();
        switch (s) {
            case 1:
                System.out.println("Tim theo ten");
                break;
            case 2:
                System.out.println("Tim theo tac gia");
                break;
            case 3:
                System.out.println("Tim theo nha san xuat");
                break;
            case 4:
                System.out.println("Tim theo tieu de");
                break;
            default:
                System.out.println("Phim bam khong hop le");
                break;
        }
    }
}
