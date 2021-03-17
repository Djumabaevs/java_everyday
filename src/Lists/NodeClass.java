package Lists;

public class NodeClass {
    private NodeClass next;
    private NodeClass previous;
    private final Car car;

    public NodeClass(Car car){
        this.car = car;
    }

    public void display(){
        System.out.println("object of NodeClass: " + next + " object of CarClass: " + car);
    }

    public NodeClass getNext() {
        return next;
    }

    public void setNext(NodeClass next) {
        this.next = next;
    }

    public void setPrevious(NodeClass previous) {
        this.previous = previous;
    }
    public NodeClass getPrevious(){
        return previous;
    }
}
