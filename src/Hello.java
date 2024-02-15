public class Hello {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        double kq = (double) a / b; //int to double
        //System.out.println(kq);

        //ep kieu hep
        int c = 128;
        byte d = (byte) c;
        //System.out.println(c);
        //System.out.println(d);
        int e = 15;
        byte f = (byte) e;
        //System.out.println(f);
        int i1 = 2;
        int i2 = 5;
        int i3 = -3;
        double d1 = 2.0;
        double d2 = 5.0;
        double d3 = -0.5;
        System.out.println(i1 + (i2 * i3));
        System.out.println(i1 * (i2 + i3));
        System.out.println(i1 / (i2 + i3));
        System.out.println((double) i1 / i2 + i3);
        System.out.println(3 + 4 + 5 / 3);
        System.out.println((3 + 4 + 5) / 3);
        System.out.println(d1 + (d2 * d3));
        System.out.println(d1 + d2 * d3);
        System.out.println(d1 / d2 - d3);
        System.out.println(d1 / (d2 - d3));

    }
}