package file;

import java.io.File;
import java.io.FileWriter;

public class Q6 {
    public void writeFile() {
        try {
            File file = new File("filestorage/file4.txt");
            if (file.createNewFile()) {
                FileWriter fileWriter = new FileWriter(file);
                fileWriter.write(
                        "Hello myself Ashesh Mandal\nI'm a passionate MERN stack developer and skilled in java.");
                System.out.println("File created!");
                fileWriter.close();
            }else{
                System.out.println("File already exists!");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
