public class DataTypeCastingDemo {
    public static void main(String[] args) {
        //widening
        //byte(1) -> short(2) -> int(4) -> long(8) -> float(4) -> double(8)
        byte a = 10;
        int b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        //Narrowing
        // double -> float -> long -> int -> short -> byte
        long m = 10;
        int n = (int) m;
        System.out.println("m = " + m);
        System.out.println("n = " + n);


        // Chú ý
        int x = 1;
        int y = 2;
        System.out.println((float) x / y);
        System.out.println(x / (float) y);
        System.out.println((float) x / (float) y);
        System.out.println((float) (x / y));

        //byte: -128 -> 127
    }
}
