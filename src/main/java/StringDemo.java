public class StringDemo {
    public static void main(String[] args) {
        //Primitive
        String s1="java";
        String s2 = "java";
        //non Primitive
        String s3 = new String("java");
        String s4 = new String("java");

        // so sanh == va equals
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s4);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
