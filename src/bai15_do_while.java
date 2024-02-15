public class bai15_do_while {
    public static void main(String[] args) {
        // tinh tong cac so tu 1 den 5
        int a = 1;
        int tong = 0;
        do {
            tong += a;
            a++;
            System.out.println(a);
        } while (tong <= 5);
        System.out.println("Tong " + tong);
    }
}
