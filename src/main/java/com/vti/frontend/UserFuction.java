package com.vti.frontend;

import com.vti.entity.User;
import com.vti.repository.UserRepository;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.sql.SQLException;
import java.util.List;

@AllArgsConstructor
public class UserFuction {
    private UserRepository repository;



    public void showMenu() throws SQLException {
        while (true){
            System.out.println("1. Hien thi danh sach user");
            System.out.println("2. Thoat chuong trinh");
            System.out.println("moi ban chon chuc nang");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findAll();
            }else if(menu == 2){
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            }else {
                System.err.println("Vui long nhap dung chuc nang");
            }
        }
    }

    public void findAll() throws SQLException {
        List<User>  users = repository.findAll();
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if(users.isEmpty()){
            System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
            System.out.println("+------+-------------------------+-------------------------+");
        }else {
            for (User user : users) {
                System.out.printf(
                        "| %-4s | %-23s | %-23s |%n",
                        user.getId(), user.getFullName(), user.getEmail()
                );
                System.out.println("+------+-------------------------+-------------------------+");
            }
        }
    }

    private void create() throws SQLException {
    System.out.println("Moi ban nhâp vào thông tin user.");
    System.out.println("Nhâp vào fulL name:");
    String fullName = ScannerUtil.inputFullName();
     System.out.println("Nhap vao email.");
    String email = ScannerUtil.inputEmail();
    int result = repository.create(fullName, email);
        System.out.println("da tao thanh cong");
    }
}
