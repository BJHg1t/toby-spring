package com.example.spring.chapter1.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class DUserDao extends UserDao {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        // D사 DB connection
        return null;
    }
}
