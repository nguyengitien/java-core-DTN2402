package abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        // tính trừu tượng
        //abstract class
        //trừu tượng không hoàn toàn (100%)

        Circle circle=new Circle(1.0);
        System.out.println("circle.Area() = " + circle.area());
        //không thể khởi tạo
        // Shape shape = new Shape()

        //interface
        //trừu tượng hoàn toàn
        // mặc định : public abstract
        //đa kế thừa
        circle.draw();
        circle.extend();
    }
}
