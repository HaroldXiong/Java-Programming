/**
 * Created by xiong on 10/2/16.
 */
public class MyQueue {
    private Object[] elements;
    private int size;
    public static final int DEFAULT_CAPACITY = 16;

    public MyQueue() {
        this(DEFAULT_CAPACITY);
    }

    public MyQueue(int capacity) {
        elements = new Object[capacity];
    }

    public Object pushIntoQueue(int value) {
        if (size >= elements.length) {
            Object[] temp = new Object[elements.length * 2];
            System.arraycopy(elements, 0, temp, 0, elements.length);
            elements = temp;
        }
        return elements[size++] = value;
    }

    public Object deleteQueue() {
        Object temp = elements[0];
        for (int i = 1; i < size; i++)
            elements[i - 1] = elements[i];
        size--;
        return temp;
    }

    public boolean empty() {
        return size == 0;
    }

}
