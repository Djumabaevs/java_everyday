package FunctionalReactive;

import java.util.function.Supplier;

public class SupplierPractice {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> new String("A string");

        System.out.println(supplier.get());

        Supplier<Double> randomNumber = () -> Math.random(); //Math :: random;

        System.out.println(randomNumber.get());
    }
}
