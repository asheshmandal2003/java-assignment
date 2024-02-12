package exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Q18 {
    public void throwSQLException() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:postgresql://hostname:port/database");
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}
