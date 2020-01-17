package by.belhard.j19.lessons.lesson11.jdbcExample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL =
            "jdbc:mysql://localhost/bhj19?serverTimezone=UTC";

    private static final String USER = "root";
    private static final String PASS = "root";

    private final Connection connection;

    public DBManager() throws SQLException {
        connection = DriverManager.getConnection(DATABASE_URL, USER, PASS);
    }

    public Connection getConnection() {
        return connection;
    }
}
