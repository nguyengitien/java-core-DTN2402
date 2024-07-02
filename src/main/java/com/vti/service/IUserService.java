package com.vti.service;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> findEployeeAndManagerByProjectId(int projectId);

    User findAdminByEmailAndPassword(String email, String password);

    int create(String fullName, String email);
}
