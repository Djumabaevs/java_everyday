package Patterns;

public class FluentShopping {
    public static void main(String[] args) {
      /*  Order myOrder = new Order();
        myOrder.add("shoes");
        myOrder.add("shirts");
        myOrder.deliver("Radius");
        myOrder.place();
        */


        //using functions

        Order.place(order ->
                order.add("nike")
                .add("adidas")
                .deliver("Bishkek")
                );

    }
}
