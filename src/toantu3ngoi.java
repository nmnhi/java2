import java.util.Scanner;

public class toantu3ngoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a number");
        int n = sc.nextInt();
        String result = (n % 2 == 0) ? "So chan" : "So le";
        System.out.println(result);
    }
}
