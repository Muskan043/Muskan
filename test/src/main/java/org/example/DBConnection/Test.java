package org.example;

import java.sql.*;

public class Test{

        public Connection getConnection() throws SQLException {
            String url = "jdbc:h2:mem:Test";// H2 Database URL----> loclhpst:9090
            String user = "sa";            // Database username
            String password = "";          // Database password


            String url1 = "test";


            return DriverManager.getConnection(url, user, password);
        }
    }

