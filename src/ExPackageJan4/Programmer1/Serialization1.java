package ExPackageJan4.Programmer1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Serialization1 {
    public static void main(String[] args) {
        List<String> employees = new ArrayList<>();
        employees.add("Bakyt");
        employees.add("Tushka");
        employees.add("Bogomol");

        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream("employees1.bin"))

        ){ objectOutputStream.writeObject(employees);
            System.out.println("done!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
