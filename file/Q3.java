package file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Q3 {
    public void readFile() {
        try {
            File file = new File("filestorage/file1.txt");
            InputStream inputStream = new FileInputStream(file);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            byte[] data = new byte[bufferedInputStream.available()];
            bufferedInputStream.read(data);
            System.out.println(new String(data));
            bufferedInputStream.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
