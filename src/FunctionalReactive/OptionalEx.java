package FunctionalReactive;

import java.util.Optional;

public class OptionalEx {
    public static void main(String[] args) {
        Integer a = 10;
        Optional <Integer> optional = Optional.of(a);

        Integer integerVal = optional.get();;
        System.out.println(integerVal);
        Optional<Integer> emptyOptional = Optional.empty();
        emptyOptional.get();

        Integer val = optional.isPresent() ? optional.get() : 0;
        System.out.println(val);

        Integer orElse = emptyOptional.orElse(0);
        System.out.println(orElse);

        Integer orElseGet = emptyOptional.orElseGet(() -> 0);
        System.out.println(orElseGet);

        Integer orElseThrow = emptyOptional.orElseThrow(IllegalArgumentException::new);

        Optional<String> optionalS = Optional.of("Value");

        String orElseS = optionalS.map(value -> "Replaced").orElse("Empty");
        System.out.println(orElseS);

        Optional<String> filter = optionalS.filter(value -> value.equalsIgnoreCase("Value"));
        System.out.println(filter.get());

        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("Value is absent"));
        optionalS.stream().forEach(System.out :: println);
        Optional.empty().stream().forEach(System.out :: println);
    }

}
