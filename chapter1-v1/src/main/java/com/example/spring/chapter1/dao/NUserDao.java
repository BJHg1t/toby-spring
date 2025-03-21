package com.example.spring.chapter1.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDao extends UserDao {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        // N사 DB connection
        return null;
    }
}
