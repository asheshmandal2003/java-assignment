import file.Q1;
import file.Q10;
import file.Q11;
import file.Q2;
import file.Q3;
import file.Q4;
import file.Q5;
import file.Q6;
import file.Q7;
import file.Q8;
import file.Q9;

/**
 * File
 */
public class File {

    public static void main(String[] args) {
        Q1 q1 = new Q1();
        q1.readFile();

        Q2 q2 = new Q2();
        q2.writeFile();

        Q3 q3 = new Q3();
        q3.readFile();

        Q4 q4 = new Q4();
        q4.writeFile();

        Q5 q5 = new Q5();
        q5.readFile();

        Q6 q6 = new Q6();
        q6.writeFile();

        Q7 q7 = new Q7();
        q7.readFile();

        Q8 q8 = new Q8();
        q8.writeFile();

        Q9 q9 = new Q9();
        q9.readPropertiesFile();

        Q10 q10 = new Q10();
        q10.readExcel();

        Q11 q11 = new Q11();
        q11.writeExcel();
    }
}