package comparing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Long",1));
        students.add(new Student("Tien",4));
        students.add(new Student("Hieu",3));
        students.add(new Student("Hoang",5));

        Collections.sort(students);
        for(Student student: students){
            System.out.println(student);
        }
    }
}
