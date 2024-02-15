public class bai20_try_catch {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        System.out.println("Doan code phia sau");
        try {
            int c = a / b;
            System.out.println("c=" + c);
        } catch (
                Exception ex
        ) {
            System.out.println("Error");
            ex.printStackTrace();
        } finally {
            System.out.println("Ket thuc chuong tring");
        }
    }
}