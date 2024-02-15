import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number");
        int n = sc.nextInt();
        int div = n % 2;
        switch (div) {
            case 0:
                System.out.println("Chan");
                break;
            default:
                System.out.println("Le2");
                break;
        }
    }
}
