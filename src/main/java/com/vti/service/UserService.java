package com.vti.service;

import com.vti.entity.User;
import com.vti.repository.IUserRepository;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
public class UserService implements IUserService{
    private IUserRepository repository;

    @Override
    public List<User> findEmployeeByProjectId(int projectId) {
        try {
            return repository.findEmployeeByProjectId(projectId);
        } catch (SQLException |IOException e) {
            return Collections.emptyList();
        }
    }

    @Override
    public List<User>  findAllManager() {
        try {
            return repository.findAllManager();
        } catch (SQLException |IOException e) {
            return Collections.emptyList();
        }
    }

    @Override
    public User findManagerByEmailAndPassword(String email, String password) {
        try {
            return repository.findManagerByEmailAndPassword(email, password);
        } catch (SQLException |IOException e) {
            return null;
        }
    }


}
