package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q7 {
    public void readFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("filestorage/file1.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
