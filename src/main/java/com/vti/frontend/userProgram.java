package com.vti.frontend;

import com.vti.repository.UserRepository;
import com.vti.util.jdbcUtil;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
@AllArgsConstructor
public class userProgram {
    public static void main(String[] args) throws SQLException, IOException {
      //kiem tra database
       // jdbcUtil.checkConnection();
        UserRepository repository = new UserRepository();
        UserFuction fuction = new UserFuction(repository);
        fuction.showMenu();

    }

}