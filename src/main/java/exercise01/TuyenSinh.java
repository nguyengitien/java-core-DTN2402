package exercise01;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TuyenSinh implements  ITuyenSinh{
    private Scanner scanner=new Scanner(System.in);
    private List<ThiSinh> thiSinhList = new LinkedList<>();

    public void showMenu(){

    }

   public void themThiSinh(){
       System.out.println("Nhập số báo danh: ");
       int soBaoDanh= Integer.parseInt(scanner.nextLine());
       System.out.println("Nhập họ tên: ");
       String hoTen= scanner.nextLine();
       System.out.println("Nhập địa chỉ: ");
       String diaChi=scanner.nextLine();
       System.out.println("Nhập mức độ ưu tiên: ");
       int mucUutien= Integer.parseInt(scanner.nextLine());
       System.out.println("Nập khối thi: ");
       String khoiThi=scanner.nextLine();
       ThiSinh thiSinh;
       if(khoiThi.equals("1")){
           thiSinh=new ThiSinhKhoiA(soBaoDanh,hoTen,diaChi,mucUutien);
       }else if(khoiThi.equals("2")){
           thiSinh=new ThiSinhKhoiB(soBaoDanh,hoTen,diaChi,mucUutien);
       }else{
           thiSinh=new ThiSinhKhoiC(soBaoDanh,hoTen,diaChi,mucUutien);
       }
       thiSinhList.add(thiSinh);
   }

   public void hienThiDSTS(){
       System.out.println("+------+--------------------+--------------------+------+--------------------|");
       System.out.println("| SBD  |       HO TEN       |       DIA CHI      | MUT  |       KHOI THI     |");
       System.out.println("+------+--------------------+--------------------+------+--------------------|");
       for(ThiSinh thiSinh : thiSinhList){
           if(thiSinh.soBaoDanh != soBaoDanh) continue;
           System.out.printf("| %-4s | %-18s | %-18s | %-4s | %-18s |%n",thiSinh.soBaoDanh,thiSinh.hoTen,thiSinh.diaChi,thiSinh.mucUuTien);
       }
       System.out.println("+------+--------------------+--------------------+------+--------------------|");
   }
}
