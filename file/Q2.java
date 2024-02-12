package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Q2 {
    public void writeFile() {
        try {
            File file = new File("filestorage/file2.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("File has created successfully!");
                OutputStream outputStream = new FileOutputStream(file);
                outputStream.write("Hello, Myself Ashesh Mandal".getBytes());
                outputStream.close();
            } else {
                System.out.println("File already exists!");
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }
}
