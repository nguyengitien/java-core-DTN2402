package com.vti.repository;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> findEmployeeAndManagerByProjectId(int projectId) throws SQLException, IOException;

    User findAdminByEmailAndPassword(String email, String password) throws SQLException, IOException;

    int create(String fullName, String email) throws SQLException, IOException;
}
