package Database;

import java.sql.*;

public class JavaConnect {

    public void result(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jio_recharge", "root", "");
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public ResultSet resultWithReturn(String query) {
        System.out.println("method");
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("driver loaded");           
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306jio_recharge","root","");
            System.out.println("connection");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println(query);
            System.out.println(ex.getMessage());
            return null;
        }

    }

}
