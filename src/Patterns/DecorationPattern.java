package Patterns;

public class DecorationPattern {
    public static void main(String[] args) {
        Burger myOrder = new BurgerShop(Burger::addVeggies).use(new Burger());
        System.out.println(myOrder);

        Burger myOrder2 = new BurgerShop(Burger::addCheese)
                .use(new BurgerShop(Burger::addVeggies)
                        .use(new Burger()));
        System.out.println(myOrder2);

    }
}
