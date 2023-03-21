package org.example.hotel.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    public static void initAdmins() {
        try {
            String employeeTable = "insert into employee(id,name,surname,phone,birthDate,status) " +
                    "values('-1','admin','adminov','123',now(),'ACTIVE') ON CONFLICT (id) DO NOTHING;";
            Connection con = getConnection();
            Statement statement = con.createStatement();
            statement.executeUpdate(employeeTable);
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        try {
            // 1
            Class.forName("org.postgresql.Driver");
            // 2-yo'l.
            return DriverManager.getConnection("jdbc:postgresql://localhost:5433/db_hotel", "postgres", "123");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage());
        }
    }
}
