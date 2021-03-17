package Generics;

import java.util.List;

public class WildcardDemo {
    public static void displayData(List<?> l) {
        for(Object t : l) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        DataNode<Integer> node1 = new DataNode<>(20,null);
        DataNode<Integer> node2 = new DataNode<>(30,node1);
        System.out.println(node2.toString());
    }
}
class DataNode<E> {
    private E data;
    private DataNode<E> next;

    public DataNode(E data, DataNode<E> next) {
        this.setData(data);
        this.setNext(next);
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public DataNode<E> getNext() {
        return next;
    }

    public void setNext(DataNode<E> next) {
        this.next = next;
    }
    @Override
    public String toString() {
        return "Data " + data + " next is " + next;
    }
}
