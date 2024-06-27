package com.vti.repository;

import com.vti.entity.User;
import com.vti.util.jdbcUtil;

import java.io.IOException;
import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class UserRepository {
    public List<User> findAll() throws SQLException, IOException {
        String sql = "SELECT * FROM users";
        try (
                Connection connection = jdbcUtil.getConnection();
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery(sql)
        ) {
            List<User> users = new LinkedList<>();
            while (rs.next()) {
                User user = getUser(rs);
                users.add(user);
            }
            return users;
        }
    }

    public User findById(int id) throws SQLException, IOException {
        String sql = "SELECT * FROM users WHERE id = ?";
        try(
                Connection connection = jdbcUtil.getConnection();
                PreparedStatement Pstmt = connection.prepareStatement(sql);
                ){
            Pstmt.setInt(1, id);
            try(ResultSet rs = Pstmt.executeQuery()){
                return rs.next() ? getUser(rs) : null;
            }
        }

    }

    public User findByEmailAndPassword(String email, String password) throws SQLException, IOException {
        String sql = "{CALL find_by_email_and_password(?, ?)}";
        try(
                Connection connection = jdbcUtil.getConnection();
                CallableStatement cStmt = connection.prepareCall(sql);
                ){
            cStmt.setString(1, email);
            cStmt.setString(2, password);
            try(ResultSet rs = cStmt.executeQuery()) {
                  return rs.next() ? getUser(rs) : null;
            }
        }
    }

    public int create(String fullName, String email) throws SQLException, IOException {
        String sql = "INSERT INTO users(full_name, email) VALUES (?, ?)";
        try(
                Connection connection = jdbcUtil.getConnection();
                PreparedStatement pStmt = connection.prepareStatement(sql);
                ){
            pStmt.setString(1, fullName);
            pStmt.setString(2, email);
            return pStmt.executeUpdate();
        }
    }

    public int deleteById(int id) throws SQLException, IOException {
        String sql = "DELETE FROM users WHERE id = ?";
        try(
                Connection connection = jdbcUtil.getConnection();
                PreparedStatement Pstmt = connection.prepareStatement(sql);
                ){
            Pstmt.setInt(1,id);
            return Pstmt.executeUpdate();
        }
    }

    private User getUser(ResultSet rs) throws SQLException, IOException {
        User user = new User();
        user.setId(rs.getInt("id"));
        user.setFullName(rs.getString("full_name"));
        user.setEmail(rs.getString("email"));
        user.setPassword(rs.getString("password"));
        user.setRole(rs.getString("role"));
        user.setProSkill(rs.getString("pro_skill"));
        user.setExpInYear(rs.getInt("exp_in_year"));
        return user;
    }
}
