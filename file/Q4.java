package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Q4 {
    public void writeFile() {
        try {
            File file = new File("filestorage/file3.txt");
            if (file.createNewFile()) {
                System.out.println("File created!");
                OutputStream outputStream = new FileOutputStream(file);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
                bufferedOutputStream.write("I love Java!".getBytes());
                bufferedOutputStream.close();
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
