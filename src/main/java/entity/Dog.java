package entity;

public class Dog {
    public String name;
    private int age;

    String color;
    private int id;
    public  Dog(String name){
        System.out.println("khoi tao 1 tham so");
        this.name = name;
    }
    public Dog(String name, int age){
        System.out.println("khoi tao 2 tham so: ");
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "entity.Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
