package Patterns;

public class Burger {

    private String burgerType;

    public Burger() {
        this.burgerType = "";
    }
    public Burger(String type) {
        this.burgerType = type;
    }
    public Burger addVeggies() {
        System.out.println("Adding veggies to the burger");
        return new Burger(this.burgerType += "veggie");
    }
    public Burger addCheese() {
        System.out.println("Adding cheese to burger");
        return new Burger(this.burgerType += "cheese");
    }
    public String toString() {
        return String.format("%s", burgerType + " burger");
    }
}
