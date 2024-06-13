public class OverloadingDemo {
    public static void main(String[] args) {

    }

    //sum(int, int)
    public int sum(int a, int b){
        return a+b;
    }
    //sum(int, byte)
    public int sum(int a, byte b){
        return a+b;
    }
}
