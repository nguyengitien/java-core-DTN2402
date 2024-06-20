package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();

        set.add(1);
        set.add(1);
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println(set);
    }
}
