package demo;

public class stack2 {

    private int[] queue;
    private int front;
    private int rear;
    private int size;

    // Constructor name must match class name
    stack2(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    void enqueue(int value) {
        if (size == queue.length) {
            System.out.println("Queue Overflow");
            return;
        }
        rear++;
        queue[rear] = value;
        size++;
    }

    int dequeue() {
        if (size == 0) {
            System.out.println("Queue Underflow");
            return -1;
        }
        int value = queue[front];
        front++;
        size--;
        return value;
    }

    int peek() {
        if (size == 0) {
            return -1;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        stack2 queue = new stack2(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println(queue.dequeue()); // prints 10
        System.out.println(queue.peek());    // prints 20
    }
}
