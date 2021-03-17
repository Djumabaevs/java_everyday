package ExPackageJan3;

public class Queue {
    private int[] arrayQ;
    private int front;
    private  int back;
    private  int queueSize;

    public Queue(){
        queueSize = 3;
        arrayQ = new int[queueSize];
        front = -1;
        back = -1;
    }
    private  void resize(){
        int[] temp = arrayQ;
        queueSize = queueSize*2;
        arrayQ = new int[queueSize];
        for (int i = 0; i <= front; i++) {
            arrayQ[i] = temp[i];
        }
    }
    public void push(int item){
        if (front+1 >= queueSize)
            resize();
        arrayQ[++front] = item;
    }
    public Integer pop(){
        if(front>back)
            return arrayQ[++back];
        return null;
    }
    public boolean isEmpty(){
        return front <= back;
    }
}
class TestQueue{
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push(3);
        queue.push(4);
        queue.push(50);
        System.out.println(queue.pop());
        System.out.println(queue.pop());

    }
}
