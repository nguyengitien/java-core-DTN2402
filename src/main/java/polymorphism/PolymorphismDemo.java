package polymorphism;

public class PolymorphismDemo {
    public static void main(String[] args) {
        // tính đa hình

        //Student -> Person
        Student student = new Student("Huy", 24);
        student.run();
        Person person = student;
        person.run();

        boolean isStudent = person instanceof Student;
        System.out.println("isStudent = " + isStudent);

        if(person instanceof Student){
            Student s =(Student) person;
            s.study();
        }
    }
}
