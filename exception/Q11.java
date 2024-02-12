package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Q11 {
    public void throwFileNotFoundException() throws FileNotFoundException {
        File file = new File("./ImaginaryFile.txt");
        FileReader fileReader = new FileReader(file);
        System.out.println(fileReader.toString());
    }
}
