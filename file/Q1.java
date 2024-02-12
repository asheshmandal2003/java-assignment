package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Q1 {
    public void readFile() {
        try {
            File file = new File("filestorage/file1.txt");
            InputStream inputStream = new FileInputStream(file);
            byte[] res = new byte[inputStream.available()];
            inputStream.read(res);
            inputStream.close();
            System.out.println(new String(res));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
