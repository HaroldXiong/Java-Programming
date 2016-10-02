/**
 * Created by xiong on 10/2/16.
 */
public class P7 {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        for (int i = 0; i < 10; i++)
            queue.pushIntoQueue(i);

        while (!queue.empty())
            System.out.print(queue.deleteQueue() + " ");
    }

}
