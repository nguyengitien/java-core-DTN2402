package exercise05;

import jdk.nashorn.internal.objects.Global;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QLCB {
    private Scanner scanner=new Scanner(System.in);
    private List<CanBo> canBoList = new LinkedList<>();

    private void themCanBo(){
        System.out.println("1. Công nhân");
        System.out.println("2. Kỹ sư");
        System.out.println("3. Nhân viên");
        System.out.println("Chọn Vị Trí");
        String menu= scanner.nextLine();
        if(menu.equals("1")){
            System.out.println("Nhập họ và tên: ");
            String hoTen=scanner.nextLine();
            System.out.println("Nhập tuổi: ");
            int tuoi = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập vào giới tính");
            GioiTinh gioiTinh = null;
            System.out.println("1. NAM");
            System.out.println("2. NU");
            System.out.println("3. KHAC");
            String menu1 = scanner.nextLine();
            switch (menu1) {
                case "1":
                    gioiTinh = GioiTinh.NAM;
                    break;
                case "2":
                    gioiTinh = GioiTinh.NU;
                    break;
                case "3":
                    gioiTinh = GioiTinh.KHAC;
                    break;
            }
            System.out.println("Nhập vào địa chỉ");
            String diaChi = scanner.nextLine();
            CanBo canBo = new CanBo(hoTen, tuoi, gioiTinh,diaChi);
            canBoList.add(canBo);
            for (CanBo canbo: canBoList) {
                System.out.println(canbo);
            }
        }
        }
    }
}



