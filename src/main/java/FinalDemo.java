public class FinalDemo {
    public static void main(String[] args) {
        // final property: dùng cho biến -> biến đó sẽ k thay giá trị được nữa.
        final double pi=3.1415;
        // pi=5; lỗi || final không thể thay đổi gi trị

        //final method: dùng cho phương thức: pthuc ở lớp con không thể ghi đè lên pthuc lớp cha
        Dog dog=new Dog();
        dog.run();

        //final class: lơps đó là cuối cùng -> không thể có lớp khác extends được.

        //constant
        System.out.println("Math.PI = " + Math.PI);
    }
}
