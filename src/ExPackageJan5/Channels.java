package ExPackageJan5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Channels {
    public static void main(String[] args) {
        try(RandomAccessFile randomAccessFile = new RandomAccessFile("test1.txt","rw")

                ){
            int a = randomAccessFile.read();
            System.out.println((char)a);
            a = randomAccessFile.read();
            System.out.println((char)a);
            randomAccessFile.writeBytes("privet");
            long position = randomAccessFile.getFilePointer();
            System.out.println(position);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
