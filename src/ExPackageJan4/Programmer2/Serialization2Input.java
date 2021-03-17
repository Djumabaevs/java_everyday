package ExPackageJan4.Programmer2;

import ExPackageJan4.Programmer1.SalesMan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Serialization2Input {
    public static void main(String[] args) {
        SalesMan bestSalesMan;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("employees2.bin")
        )

                )
        { bestSalesMan = (SalesMan) objectInputStream.readObject();
            System.out.println(bestSalesMan);

        } catch (FileNotFoundException | ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
