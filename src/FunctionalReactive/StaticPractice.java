package FunctionalReactive;

import java.util.function.BiFunction;

public class StaticPractice {
    public static void main(String[] args) {
        BiFunction<String, String, String> biFunction = BiClass :: staticMethod;
        System.out.println(biFunction.apply("Talka", "Bakyt"));
    }
}
class BiClass {
    static String staticMethod(String a, String b) {
        return a + b;
    }
}
