package ExPackageFeb;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class Streams1 {
    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(7);
        list.add(3);
       int result = list.stream().reduce((accumulator,element) ->
                accumulator*element).get();

        System.out.println(result);

        List<Integer> list100 = new ArrayList<>();
        Optional<Integer> o = list100.stream().reduce((accumulator,element) ->
                accumulator*element);
        if(o.isPresent()){
            System.out.println(o.get());
        }else{
            System.out.println("not present!");
        }

        List<String> list3 = new ArrayList<>();
        list3.add("hello");
        list3.add("hey");
        list3.add("there!");

        String result3 = list3.stream().reduce((a,e) -> a + " " + e).get();
        System.out.println(result3);
        /*Predicate<String> p = element -> element.length()<5;
        list3.removeIf(p);
        System.out.println(list3);*/
        list3.removeIf(e -> e.length()<5);
        System.out.println(list3);


    }
}
