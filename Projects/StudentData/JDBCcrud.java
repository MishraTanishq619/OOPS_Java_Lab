import java.sql.*;

public class JDBCcrud {

    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/tanishq1";
    private static final String USERNAME = "tannu619";
    private static final String PASSWORD = "tannu619";

    public static void main(String[] args) {
        try {
            // 1. Register the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Open a connection
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD)) {
                // 3. Create a statement
                Statement statement = connection.createStatement();

                // 4. Create (INSERT)
                insertData(statement, "John Doe", 25);

                // 5. Read (SELECT)
                readData(statement);

                // 6. Update (UPDATE)
                updateData(statement, 1, "Updated Name", 30);

                // 7. Read again to see the updated data
                readData(statement);

                // 8. Delete (DELETE)
                deleteData(statement, 1);

                // 9. Read again to see the deleted data
                readData(statement);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertData(Statement statement, String name, int age) throws SQLException {
        String insertQuery = "INSERT INTO Student (name, age) VALUES ('" + name + "', " + age + ")";
        statement.executeUpdate(insertQuery);
        System.out.println("Data inserted successfully.");
    }

    private static void readData(Statement statement) throws SQLException {
        String selectQuery = "SELECT * FROM Student";
        ResultSet resultSet = statement.executeQuery(selectQuery);

        System.out.println("Student Data:");
        while (resultSet.next()) {
            int id = resultSet.getInt("id");
            String name = resultSet.getString("name");
            int age = resultSet.getInt("age");
            System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
        }
        System.out.println();
    }

    private static void updateData(Statement statement, int id, String name, int age) throws SQLException {
        String updateQuery = "UPDATE Student SET name = '" + name + "', age = " + age + " WHERE id = " + id;
        statement.executeUpdate(updateQuery);
        System.out.println("Data updated successfully.");
    }

    private static void deleteData(Statement statement, int id) throws SQLException {
        String deleteQuery = "DELETE FROM Student WHERE id = " + id;
        statement.executeUpdate(deleteQuery);
        System.out.println("Data deleted successfully.");
    }
}
