package ExPackageJan4.Programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 460);
        SalesMan salesMan = new SalesMan("NIck",45, car, 12000);
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("employees2.bin")
        )

                )
        { objectOutputStream.writeObject(salesMan);
            System.out.println("done!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
