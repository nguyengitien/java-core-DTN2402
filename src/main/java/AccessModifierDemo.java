import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // Phạm vi truy cập
        // Đứng ở 3 nơi: trc class, trc phương thức, giá trị.
        // public: Truy cập được ở mọi nơi

        Dog dog1 = new Dog("long", 2);
        System.out.println("dog1.name = " + dog1.name);

        // protected: Trong cùng package hoặc class con
        Dog dog2 = new Dog("long", 2);
       // System.out.println("dog2.age = " + dog1.age);

        // default: cùng package
        Dog dog3 = new Dog("long", 2);
        // System.out.println("dog3.color = " + dog3.color);

        // private: Cùng Class
    }
}
