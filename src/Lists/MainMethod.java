package Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainMethod {



    public static void main(String[] args) {
        Car car1 = new Car("Toyota", 300);
        Car car2 = new Car("Lexus", 570);
        Car car3 = new Car("BMW", 400);
        Car car4 = new Car("KIA", 160);
        Car car5 = new Car("Hyundai", 200);

        LinkedList list = new LinkedList();
        list.addToFront(car1);
        list.addToFront(car2);
        list.addToFront(car3);
        list.addToFront(car4);
        list.addToFront(car5);

        List<Car> cars = new ArrayList<>();
        cars.add(car2);
        cars.add(car1);
        cars.add(car3);

        Car carStream = cars.stream()
                .filter(car -> car.equals(car.getModel()))
                .findAny()
                .orElse(null);



    }
    public static Car loop(String name, List<Car> cars){
        for(Car car : cars){
            if(car.getModel().contains("Toyota")){
                return car;
            }
        }
        return null;
    }
    public static Car iterator(String name, List<Car> cars){
        Iterator<Car> iterator = cars.iterator();
        while(iterator.hasNext()){
            Car car = iterator.next();
            if(car.getModel().equals("BMW")){
                return car;
            }
        }
        return null;
    }

}
