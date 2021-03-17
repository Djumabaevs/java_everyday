package ExPackageJan5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;

public class Channels2 {
    public static void main(String[] args) {
        try(RandomAccessFile file  =new RandomAccessFile("test1.txt", "rw");
            FileChannel channel = file.getChannel();

                )
        {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            StringBuilder sb = new StringBuilder();

            int byteRead = channel.read(buffer);
            while(byteRead>0){
                System.out.println("Read" + byteRead);
                buffer.flip();
                while(buffer.hasRemaining()){
                    sb.append((char)buffer.get());

                }
                buffer.clear();
                byteRead = channel.read(buffer);
            }
            System.out.println(sb);

            String text = "\n Life is a miracle! And i love enjoying it!";
           /*  ByteBuffer buffer2 = ByteBuffer.allocate(text.getBytes().length);
            buffer2.put(text.getBytes());
            buffer2.flip();
            channel.write(buffer2); */

            ByteBuffer buffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(buffer2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
