package polymorphism;

public class Student extends Person{

    public Student(String name, int age) {
        super(name, age);
    }

    public void run(){
        System.out.println("Student is running...");
    }

    public void study(){
        System.out.println("Study is running...");
    }

}
