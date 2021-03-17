package ExPackageJan4.Programmer2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Serialization2 {
    public static void main(String[] args) {
        List<String> employees;
        try(ObjectInputStream objectInputStream = new ObjectInputStream(
                new FileInputStream("employees1.bin")
        )) {
           employees = (ArrayList) objectInputStream.readObject();
            System.out.println(employees);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
