package file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q5 {
    public void readFile() {
        try {
            File file = new File("filestorage/file1.txt");
            FileReader fileReader = new FileReader(file);
            int line;
            while ((line = fileReader.read()) != -1) {
                System.out.print((char) line);
            }
            System.out.println();
            fileReader.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
