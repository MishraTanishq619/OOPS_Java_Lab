import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class First {
    public static void main(String[] args) {
        try {
            System.out.println("JDBC");
            Class.forName("com.mysql.cj.jdbc.Driver"); // Note the updated driver class name
            System.out.println("Driver got.");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tanishq1", "tannu619",
                    "tannu619");
            System.out.println("Database connected.");

            Statement st = con.createStatement();
            System.out.println("Statement created.");

            ResultSet rs = st.executeQuery("SELECT * FROM StudentData");
            if (rs.next()) { // Move the cursor to the first row
                System.out.println("ID is: " + rs.getInt(1)); // Use index 1
            }

            con.close(); // Close the connection when done
        } catch (Exception e) {
            e.printStackTrace(); // Print the full stack trace for debugging
        }
    }
}
