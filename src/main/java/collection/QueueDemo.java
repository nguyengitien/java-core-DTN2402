package collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // FIFO: first in - first out.
        Queue<Integer> queue=  new LinkedList<>();

        queue.offer(1);

        queue.offer(3);

        queue.offer(5);

        System.out.println(queue);

        int peek=queue.peek();

        System.out.println("peek: "+peek);
        System.out.println(queue);

        int poll= queue.poll();
        System.out.println("poll = " + poll);
        System.out.println(queue);

    }
}
