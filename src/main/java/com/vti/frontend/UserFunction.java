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
            System.out.println("1. Dang nhap danh cho admin.");
            System.out.println("2. Tim kiem eployee va manager theo project_id.");
            System.out.println("3. Thoat chuong trinh.");
            System.out.println("Moi ban chon chuc nang");
            int menu = ScannerUtil.inputInt();
            if (menu == 1){
                findAdminByEmailAndPassword();
            }else if(menu == 2){
                findEmployeeAndManagerByProjectId();
            } else if (menu == 3) {
                System.out.println("Cam on ban da su dung chuong trinh");
                return;
            }  else {
                System.err.println("Vui long nhap dung chuc nang");
            }
        }
    }

    public void showAdminMenu() {
        while (true){

            System.out.println("1. Tim kiem eployee va manager theo project_id.");
            System.out.println("2. Them user.");
            System.out.println("3. Dang xuat.");
            System.out.println("Moi ban chon chuc nang");
            int menu = ScannerUtil.inputInt();
            if (menu == 1){
                findEmployeeAndManagerByProjectId();
            }else if(menu == 2){
                create();
            } else if (menu == 3) {
                System.out.println("Dang xuat thanh cong.");
                return;
            }  else {
                System.err.println("Vui long nhap dung chuc nang");
            }
        }
    }


    private void findEmployeeAndManagerByProjectId() {
        System.out.println("Nhập vào project id:");
        int projectId = ScannerUtil.inputInt();
        List<User> users = controller.findEmployeeAndManagerByProjectId(projectId);
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


    private void findAdminByEmailAndPassword() {
        System.out.println("Nhap vao email: ");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhap vao password:" );
        String password = ScannerUtil.inputPassword();
        User user = controller.findAdminByEmailAndPassword(email, password);
        if(user == null){
            System.err.println("Dang nhap that bai.");
        }else {
            User.Role role = user.getRole();
            System.out.printf("Dang nhap thanh cong: %s - %s%n", user.getFullName(), role);
            showAdminMenu();
        }
    }

    private void create() {
    System.out.println("Moi ban nhâp vào thông tin user.");
    System.out.println("Nhâp vào fulL name:");
    String fullName = ScannerUtil.inputFullName();
     System.out.println("Nhap vao email.");
    String email = ScannerUtil.inputEmail();
    int result = controller.create(fullName, email);
        System.out.printf("da tao thanh cong %d user.%n", result);
    }


}
