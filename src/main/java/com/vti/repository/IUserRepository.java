package com.vti.repository;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {

    /**
    * @return trả về tất cả user trong database
    * @throws SQLException nếu xảy ra lỗi về SQL
     * @throws IOException Nếu xảy ra lỗi cấu hình
    * */

    List<User> findAll() throws SQLException, IOException;

    /**
     * @param id định danh user
     * @return thông tin user theo id
     * @throws SQLException nếu xảy ra lỗi về SQL
     * @throws IOException Nếu xảy ra lỗi cấu hình
     * */
    User findById(int id) throws SQLException, IOException;

    User findByEmailAndPassword(String email, String password) throws SQLException, IOException;

    int create(String fullName, String email) throws SQLException, IOException;

    int deleteById(int id) throws SQLException, IOException;
}
