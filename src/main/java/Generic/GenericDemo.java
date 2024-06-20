package Generic;

import java.util.List;

public class GenericDemo {
    public static void main(String[] args) {
        //Quy ước
        // T - Type
        // E - Element
        // N - Number
        // K - Key
        // V - Value


        // Generic class / interface
         Dog<Integer> dog1 = new Dog<>("Long",1);
        System.out.println(dog1);
        Dog<Double> dog2 = new Dog<>("Long",1.3);
        System.out.println(dog2);

        // Generic method
        Printer.printAny(1);
        Printer.printAny(1.5);
        Printer.printAny(dog1);

        // bounded type
      //  Dog<String> dog3 = new Dog<>("Tùng","abc");

        // multiple bounds
        int max= Math.max(1,99);
        System.out.println("max = " + max);
    }


}
