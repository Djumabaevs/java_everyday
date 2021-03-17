package Lists2;

public class SinglyList {
    private Node first;

    public boolean isEmpty(){
        return (first == null);
    }

    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }

    public Node deleteFirst(){
        Node temp = first;
        first = first.next;
        return temp;
    }

    public void displayList(){
        Node current = first;
        while(current != null){
            current.displayNode();
            current = current.next;
        }
    }

    public static int listLength(Node node){
        int length = 0;
        Node currentNode = node;
        while(currentNode != null){
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }

}
