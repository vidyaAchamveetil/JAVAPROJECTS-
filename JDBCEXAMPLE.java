package org.example;
import java.sql.*;

public class JDBCEXAMPLE {



             static final   String url = "jdbc:mysql://localhost/TUTORIALSPOINT"; // Adjust for your database
              static final  String user = "root";
              static final  String password = "Achamveetil@123";
              static final String QUERY1= "UPDATE Employees SET Age=55 WHERE Id=18";
       static final String QUERY = "SELECT Id, Age FROM Employees";
    public  static void main (String args []){

        try(Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
           )
        {
            stmt.executeUpdate(QUERY1);
            ResultSet rs = stmt.executeQuery(QUERY);
            System.out.println("Connection established successfully!");
                   // Perform database operations here
            while (rs.next()) {
                // Retrieve by column name
                System.out.print(",Id: " + rs.getInt("Id"));
                System.out.print(", Age: " + rs.getInt("Age"));

            }
               } catch (SQLException e) {
                   System.err.println("Database connection failed: " + e.getMessage());
               }


   }
}
