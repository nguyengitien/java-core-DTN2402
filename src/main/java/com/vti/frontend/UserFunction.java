package com.vti.frontend;

import com.vti.controller.UserController;
import com.vti.entity.User;
import com.vti.util.ScannerUtil;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserFunction {
    private UserController controller;

    public void showMenu() {
        while (true){
            System.out.println("1. Tìm kiếm employee theo project_id.");
            System.out.println("2. Hiển thị danh sach manager.");
            System.out.println("3. Đăng nhập dành cho Manager ");
            System.out.println("4. Thoát chương trình.");
            System.out.println("Moi ban chon chuc nang");
            int menu = ScannerUtil.inputInt();
            if (menu == 1){
                findEmployeeByProjectId();
            }else if(menu == 2){
                findAllManager();
            } else if (menu == 3) {
                findManagerByEmailAndPassword();
            }  else if(menu == 4){
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            }else {
                System.err.println("Vui long nhap dung chuc nang");
            }
        }
    }



    public void findAllManager() {
        List<User>  users = controller.findAllManager();
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if(users.isEmpty()){
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
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



    private void findEmployeeByProjectId() {
        System.out.println("Nhập vào project id:");
        int projectId = ScannerUtil.inputInt();
        List<User> users = controller.findEmployeeByProjectId(projectId);
        System.out.println("+------+-------------------------+-------------------------+");
        System.out.printf("| %-4s | %-23s | %-23s |%n", "ID", "FULL NAME", "EMAIL");
        System.out.println("+------+-------------------------+-------------------------+");
        if (users.isEmpty()) {
            System.out.printf("| %-4s | %-23s | %-23s |%n", "NULL", "NULL", "NULL");
            System.out.println("+------+-------------------------+-------------------------+");
        } else {
            for (User user : users) {
                System.out.printf(
                        "| %-4s | %-23s | %-23s |%n",
                        user.getId(), user.getFullName(), user.getEmail()
                );
                System.out.println("+------+-------------------------+-------------------------+");
            }
        }
    }

    private void findManagerByEmailAndPassword() {
        System.out.println("Nhap vao email: ");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhap vao password:" );
        String password = ScannerUtil.inputPassword();
        User user = controller.findManagerByEmailAndPassword(email, password);
        if(user == null){
            System.err.println("Dang nhap that bai.");
        }else {
            User.Role role = user.getRole();
            System.out.printf("Dang nhap thanh cong: %s - %s%n", user.getFullName(), role);
        }
    }


}
