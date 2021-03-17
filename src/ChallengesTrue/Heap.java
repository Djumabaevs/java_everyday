package ChallengesTrue;

public class Heap {

    private Node[] heapArray;
    private int maxSize;// size of the array
    private int currentSize;//number of nodes in the array

    public Heap(int size){
        this.maxSize = size;
        currentSize = 0;
        heapArray = new Node[size]; //actually creates the array
    }

    public int getSize(){
        return currentSize;
    }

    public boolean isEmpty(){
        return (currentSize == 0);
    }

    public boolean insert(int key){

        if(currentSize == maxSize){   // array is full
            return false;
        }

        Node newNode = new Node(key);
        heapArray[currentSize] = newNode;

        trickleUp(currentSize);

        currentSize++;
        return true;
    }

    public void trickleUp(int index){

        int parentIndex = (index - 1) / 2;
        Node nodeToInsert = heapArray[index];

        //loop as long as we haven't reached the root and key of nodeToInsert's parent is less than new node

        while(index > 0 && heapArray[parentIndex].getKey2() < nodeToInsert.getKey2()) {
            heapArray[index] = heapArray[parentIndex]; // move parent down
            index = parentIndex;
            parentIndex = (parentIndex - 1) / 2; // move up
        }
        heapArray[index] = nodeToInsert;
    }

    public Node remove(){

        Node root = heapArray[0];
        currentSize--;
        heapArray[0] = heapArray[--currentSize];

        trickleDown(0);

        return root;
    }

    private void trickleDown(int index){

        int largerChildIndex;
        Node top = heapArray[index]; // save last node into top variable

        //will run as long as index is not on the bottom row (at least one child)

        while(index < currentSize/2) {
            //leftChild index position
            int leftChildIndex = 2 * index  + 1;
            int rightChildIndex = leftChildIndex + 1;

            //figure out which child is larger

            if(rightChildIndex < currentSize &&
                    heapArray[leftChildIndex].getKey2() < heapArray[rightChildIndex].getKey2()) {
                largerChildIndex = rightChildIndex;
            } else {
                largerChildIndex = leftChildIndex;
            }

            if(top.getKey2() >= heapArray[largerChildIndex].getKey2()) {
                //successfully made root the largest key
                break;
            }
            heapArray[index] = heapArray[largerChildIndex];
            index = largerChildIndex; //go down
        }
        heapArray[index] = top;
    }

    public void displayHeap(){


    }
}

class Test{
    public static void main(String[] args) {
        Heap heap = new Heap(10);

    }
}
