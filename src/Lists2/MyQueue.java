package Lists2;

public class MyQueue {
    private int maxSize;
    private long[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public MyQueue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insert(long j){
        if(rear == maxSize-1){
            rear = -1;
        }
        rear++;
        queArray[rear] = j;
        nItems++;
    }
    public void view(){
        System.out.println("[ ");
        for (int i = 0; i < queArray.length; i++) {
            System.out.print(queArray[i] + " ");

        }
        System.out.println(" ]");
    }
    public long peekFront(){
        return queArray[front];
    }
    public long remove(){
        long temp = queArray[front];
        front++;
        if(front == maxSize){
            front = 0;
        }
        nItems--;
        return temp;
    }
    public boolean isEmpty(){
        return (nItems == 0);
    }
    public boolean isFull(){
        return (nItems == maxSize);
    }

}
