import entity.Dog;

public class ConstructorDemo {
    public static void main(String[] args) {
        // Constructor: ham khoi tao
        // Tên ConStructor cùng voới tên class
        // constructor khong co gia tri tra ve
        Dog dog1 = new Dog("long", 2);
        System.out.println("dog1 = " + dog1);

        Dog dog2 = new Dog("long");
        System.out.println("dog2 = " + dog2);
    }
}
