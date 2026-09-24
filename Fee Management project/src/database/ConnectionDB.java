package database;

import java.sql.Connection;  // import connection interface ko import karta hai
import java.sql.DriverManager; //DriverManager ek class hai jo JDBC drivers ko manage karti hai. Iska kaam hai sahi driver dhoondhna aur database se connection banana, based on jo URL aap doge.
import java.sql.SQLException;

public class ConnectionDB {

    private static final String URL = "jdbc:mysql://localhost:3306/FeeManagement"; // final use for no one can change your code
    private static final String USER = "root";
    private static final String PASSWORD = "1234";

    public static Connection connect() {  // method for access directly  
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded Succesfully");
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("MYSQL Connection Stablish Successfully ");
            return con;
        } catch (SQLException e){
            System.out.println(e);
            
            
        } 
        
        catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

}
