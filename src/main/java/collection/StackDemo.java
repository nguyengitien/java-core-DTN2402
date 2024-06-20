package collection;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //LIFO: Last In - First Out
        Stack<Integer> stack = new Stack<>();

        stack.push(3);

        stack.push(5);

        stack.push(7);
        System.out.println(stack);

        //nhìn phần  tử ở đỉnh là bao nhiêu, chớ k lấy ra
        int peek= stack.peek();
        System.out.println(peek);
        System.out.println(stack);

        //lấy ra phần tử ở đỉnh
        int pop=stack.pop();
        System.out.println(pop);
        System.out.println(stack);


    }
}
