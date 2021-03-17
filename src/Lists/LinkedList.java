package Lists;

public class LinkedList {
    private NodeClass head;
    private NodeClass tail;
    private int size;

    public NodeClass getTail() {
        return tail;
    }

    public void setTail(NodeClass tail) {
        this.tail = tail;
    }

    public void addToFront(Car car){

        NodeClass node = new NodeClass(car);
        node.setNext(head);

        if(head == null){
            tail = node;
        } else {
            head.setPrevious(node);
            node.setNext(head);
        }

        head = node;
        size++;
    }

    public NodeClass removeFromEnd(){
        if(isEmpty()){
            return null;
        }
        NodeClass removedNode = tail;
        if(tail.getPrevious() == null){
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public void printList(){
        NodeClass current = head;
        System.out.println("HEAD -> ");

        while(current != null){
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public NodeClass removeNode(){
        if(isEmpty()) {
            return null;
        }

        NodeClass removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head == null;
    }


}
