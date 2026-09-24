
import database.ConnectionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {

    public static void main(String args[]) {
        Connection con = ConnectionDB.connect();
        if (con == null) {
            System.out.println(" MySQL Connection Failure");
        } else {
            System.out.println("Connection Eastablished");
        }
        String query = "select * from courses;";
        try {
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery(query);
            while (rs.next()) {
                int course_id = rs.getInt(1);
                String course_name = rs.getString(2);
                Float total_fee = rs.getFloat(3);
                int duration_year = rs.getInt(4);
                System.out.printf("course_id : %d \t course_name : %s \t total_fee : %f \t duration_year : %d \n", course_id, course_name, total_fee, duration_year);
            }
        } catch (SQLException e) {
            System.out.println("SQl Error : " + e);

        } catch (Exception e) {
            System.out.println("Error at Statement : " + e);
        }

    }
}
