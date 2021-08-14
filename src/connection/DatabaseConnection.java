package connection;

import java.sql.*;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    
    public static DatabaseConnection getInstance() {
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
    
    private DatabaseConnection() {
        
    }
    
    public void connectToDatabase() throws SQLException, ClassNotFoundException {
        final String URL = "jdbc:mysql://localhost:3306/idfc";
        final String USER = "root";
        final String PWD = "mysql@123";
        //final String PWD = "1234";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(URL, USER, PWD);
    }
    
    public Connection getConnection() {
        return connection;
    }
}
