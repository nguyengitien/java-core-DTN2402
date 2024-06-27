package com.vti.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class jdbcUtil {
    public static Connection getConnection() throws SQLException, IOException {
        String path = "src/main/resources/database.properties";
        try(FileInputStream  fis = new FileInputStream(path)) {
            Properties properties = new Properties();
            properties.load(fis);
            String url = properties.getProperty("url");
            String user = properties.getProperty("user");
            String password = properties.getProperty("password");
            return DriverManager.getConnection(url, user, password);
        }


//        String url = "jdbc:mysql://localhost:3306/lesson_10";
//        String user = "root";
//        String password = "root";
//        return DriverManager.getConnection(url, user, password);

    }

    public static void checkConnection() {
        try (Connection connection = getConnection()) {
            System.out.println("Kết nối thành công: " + connection.getCatalog());
        } catch (SQLException | IOException exception) {
            System.err.println("Kết nối thất bại: " + exception.getMessage());
        }
    }
}
