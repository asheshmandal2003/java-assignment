package exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Q12 {
    public void throwIOException() throws IOException {
        File file = new File("./ImaginaryFile.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println(fileReader.toString());
        fileReader.close();
    }
}
