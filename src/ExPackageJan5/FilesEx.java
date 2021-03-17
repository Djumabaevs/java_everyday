package ExPackageJan5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesEx {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test1.txt");
        Path directoryPath = Paths.get("C:\\Users\\user\\Desktop\\folder");

        System.out.println(filePath.getFileName() + " " + filePath.getFileSystem());
        System.out.println(directoryPath.getFileName() + " " + directoryPath.getRoot());

       // Files.createFile(filePath);
          List<String> list = Files.readAllLines(filePath);
          for(String s:list){
              System.out.println(s);
          }


    }
}
