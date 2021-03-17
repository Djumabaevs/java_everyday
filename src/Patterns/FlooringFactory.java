package Patterns;

import java.util.function.Supplier;

public class FlooringFactory {
    public static Flooring getFlooring(int minTemp, int maxTemp) {
        Supplier<Flooring> flooring;
        if(minTemp <= 5 && maxTemp <= 20) {
            flooring = WoodenFlooring::new;
        } else {
            flooring = () -> new CorkFlooring();
        }
        return flooring.get();
    }

    public static void main(String[] args) {
        Flooring flooring  =FlooringFactory.getFlooring(-1,18);
        flooring.installation();
    }
}
