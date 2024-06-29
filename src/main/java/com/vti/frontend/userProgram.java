package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.repository.UserRepository;
import com.vti.service.UserService;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;

public class userProgram {
    public static void main(String[] args) {
      //kiem tra database
       // jdbcUtil.checkConnection();
        UserRepository repository = new UserRepository();
        UserService service = new UserService(repository);
        UserController controller = new UserController(service);
        UserFunction fuction = new UserFunction(controller);
        fuction.showMenu();

    }

}