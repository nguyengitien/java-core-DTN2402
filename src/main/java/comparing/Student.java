package comparing;

public class Student implements Comparable<Student> {
    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public int compareTo(Student that){
        // ORDER BY id ASC: TANG DAN
    //  return Integer.compare(this.id, that.id);

        // ORDER BY id DESC: GIAM DAN
       // return Integer.compare(that.id, this.id);

        // ORDER BY name DESC
        //return that.name.compareTo(that.name);

        // ORDER BY id ASC, name DESC
        int c= Integer.compare(this.id, that.id);
        return c==0? that.name.compareTo(that.name) :c;
    }
}
