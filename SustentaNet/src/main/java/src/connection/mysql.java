package src.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mysql {

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/teste";
        String user = "root";
        String password = "MiniDudi2005.";
        Connection connection = DriverManager.getConnection(url, user, password);
        return connection;
    }
}
