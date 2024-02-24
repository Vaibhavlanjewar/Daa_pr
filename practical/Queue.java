package Design_Algo_Analysis.practical;
// practical 8
public class Queue {
    private int[] elements;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
        front = this.size = 0; 
        rear = capacity - 1; // Rear is at the end of the queue
    }

    // Check if the queue is full
    public boolean isFull() {
        return (size == capacity);
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return (size == 0);
    }

    // Add an element to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % capacity;
        elements[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = elements[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Get the front item from the queue
    public int front() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return elements[front];
    }

    // Get the rear item from the queue
    public int rear() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return elements[rear];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);

        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.front());
        System.out.println("Rear item is " + queue.rear());
    }
}
