package org.hzhang.designpatterns.creational.factorymethod;

import java.sql.*;

/**
 * Created by Zhang Huan on 13/03/2018.
 */
public class Application {
    public static void main(String[] args) throws SQLException {
        Factory factory = new ConcreteFactory();
        Product product = factory.factoryMethod();
        product.use();

        LogFactory logFactory = new FileLogFactory();
        Log log = logFactory.createLog();
        log.writeLog();

        // JDBC
        Connection conn = DriverManager.getConnection("jdbc::myserver://localhost:3306/db", "root", "");
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("select * from User");
    }
}
