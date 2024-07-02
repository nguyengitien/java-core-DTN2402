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
                find();
            }else if(menu == 2){
                findEmployeeAndManagerByProjectId();
            } else if (menu == 3) {
                return;
            }  else {
                System.err.println("Vui long nhap dung chuc nang");
            }
        }
    }

    private void showAdminMenu() {
        while (true){
            System.out.println("1. Hien thi danh sach user.");
            System.out.println("2. Tim kiem user theo id: ");
            System.out.println("3. Them user: ");
            System.out.println("4. Xoa user theo id: ");
            System.out.println("5. Dang xuat.");
            System.out.println("Moi ban chon chuc nang");
            int menu = ScannerUtil.inputInt();
            if(menu == 1){
                findAll();
            } else if (menu == 2) {
                findById();
            } else if (menu == 3) {
                create();
            } else if (menu == 4) {
                deleteById();
            } else if(menu == 5){
                System.out.println("Dang xuat thanh cong");
                return;
            }else {
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


    private void () {
        System.out.println("Nhap vao email: ");
        String email = ScannerUtil.inputEmail();
        System.out.println("Nhap vao password:" );
        String password = ScannerUtil.inputPassword();
        User user = controller.findByEmailAndPassword(email, password);
        if(user == null){
            System.err.println("Dang nhap that bai.");
        }else {
            User.Role role = user.getRole();
            System.out.printf("Dang nhap thnah cong: %s - %s%n", user.getFullName(), role);
            if(role == User.Role.ADMIN){
                showAdminMenu();
            } else if (role == User.Role.EMPLOYEE) {
                showEmployeeMenu();
            }
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
