package Patterns;

import java.util.ArrayList;
import java.util.Iterator;

public class ObserverDesignPattern {
    public static void main(String[] args) {


        Book book = new Book("SQL","book", 21.2);
        User user1 = new User("Bob", book);
        User user2 = new User("Rob", book);
        ArrayList<Observer> subscribers = book.getObsList();
        for(Iterator<Observer> itr = subscribers.iterator(); itr.hasNext();) {
            User endUser = (User) itr.next();
            System.out.println(endUser + " has sunscribed to " + book.getName());
        }
        System.out.println(book.getPrice());
        System.out.println("Book is available");
        book.setPrice(24.8);
    }
}
