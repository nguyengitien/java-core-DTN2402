package encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Tính đóng gói: che giấu dữ liệu
        //1. Private các thuộc tính
        //2. Cung cấp getter//setter
        Cat cat = new Cat("Long", 2);
        cat.setAge(25);
    }
}
