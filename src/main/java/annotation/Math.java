package annotation;

public class Math {
    @Deprecated
    public static int maxV1(int a, int b) {
        if (a > b) {
            return a;

        } else {
            return b;
        }
    }

    public static int maxV2(int a, int b) {
        return a > b ? a : b;
    }
}
