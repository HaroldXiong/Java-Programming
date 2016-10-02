/**
 * Created by xiong on 10/2/16.
 */
public class P4 {
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push("Tom");
        stack.push("George");
        stack.push("Peter");
        System.out.println(stack.getSize());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
