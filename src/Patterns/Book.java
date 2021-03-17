package Patterns;

import java.util.ArrayList;

public class Book implements SubjectLibrary {

    private String name;
    private String type;
    private double price;
    private ArrayList<Observer> obsList = new ArrayList<>();

    public Book(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Observer> getObsList() {
        return obsList;
    }

    public void setObsList(ArrayList<Observer> obsList) {
        this.obsList = obsList;
    }

    @Override
    public void subscribeObserver(Observer ob) {
        obsList.add(ob);
    }

    @Override
    public void unsubscribeObserver(Observer ob) {
        obsList.remove(ob);
    }

    @Override
    public void notifyObserver() {
        System.out.println(name + type + price + "in stock, please notify user");
        for(Observer o : obsList) {
            o.update(this.price);
        }
    }
}
