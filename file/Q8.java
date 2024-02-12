package file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Q8 {
    public void writeFile() {
        try {
            File file = new File("filestorage/file5.txt");
            if (file.createNewFile()) {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("Hello I'm Ashesh Mandal.\nA 3rd year student.");
                System.out.println("File created!");
                bufferedWriter.close();
            }
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
}
