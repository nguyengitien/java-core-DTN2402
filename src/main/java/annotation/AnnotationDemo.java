package annotation;

public class AnnotationDemo {
    public static void main(String[] args) {
        // Cu phap: @ + ten

        //@override
        AnnotationDemo demo = new AnnotationDemo();
        System.out.println("demo = " + demo);

        //@Deprecated
        @SuppressWarnings("deprecation")
        int max= Math.maxV1(1,0);
        System.out.println("max = " + max);

        //SuppressWarning
        @SuppressWarnings("deprecation")
        int m= Math.maxV1(1,0);
        System.out.println("max = " + max);

    }

    @Override
    public String toString() {
        return "This is Annotation Class";
    }
}
