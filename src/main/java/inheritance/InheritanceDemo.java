package inheritance;

public class InheritanceDemo {
    public static void main(String[] args) {
        // Tính kế thừa
        // Mục đích tái sử dụng code
        // từ khóa: extends
        Duck duck= new Duck("Long",2);
        duck.eat();

        //@override
        duck.eat();

        //super
        duck.eat();
        System.out.println("duck = " + duck);
    }
}
