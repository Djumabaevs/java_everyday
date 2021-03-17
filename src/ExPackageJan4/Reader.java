package ExPackageJan4;

import java.io.*;

public class Reader {
    public static void main(String[] args) {
        try ( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("rules.txt"));
              BufferedReader bufferedReader = new BufferedReader(new FileReader("rules.txt"))

                )
        { bufferedWriter.write("Hello from my project Bakyt!");
            System.out.println("Done successfully mr. Bakyt!");
          int character;
          while ((character = bufferedReader.read()) != -1) {
              bufferedWriter.write(character);
          }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
