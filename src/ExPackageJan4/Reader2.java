package ExPackageJan4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reader2 {
    public static void main(String[] args) {
        try(FileInputStream fileInputStream = new FileInputStream(
                "C:\\Users\\user\\Desktop\\mario.png"
        );
            FileOutputStream fileOutputStream = new FileOutputStream("mario_png")){
            int i;
            while((i = fileInputStream.read()) != -1){
                fileOutputStream.write(i);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
