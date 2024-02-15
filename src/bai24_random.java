import java.util.Random;

public class bai24_random {
    public static void main(String[] args) {
        // khoi tao 1 doi tuong ngau nhien
        Random rd = new Random();
        // lay ngau nhien 1 so nguyen
        int soNguyen = rd.nextInt(-50, 51); //chay tu -50 cho den nho hon 51
        int soNguyen1 = rd.nextInt(51); //chay tu 0 cho den nho hon 51
        System.out.println(soNguyen);
        System.out.println(soNguyen1);

        // chay ngau nhien so thuc
        double x = rd.nextDouble(-100, 100); // tuong tu co the de 1 doi so thi se chay tu 0
        System.out.println(x);
    }
}
