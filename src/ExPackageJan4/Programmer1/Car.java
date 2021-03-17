package ExPackageJan4.Programmer1;

import java.io.Serializable;

public class Car implements Serializable {
 String model;
 int engine;

    public Car(String model, int engine) {
        this.model = model;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
