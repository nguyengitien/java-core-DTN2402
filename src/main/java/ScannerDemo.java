import java.util.Scanner;
public class ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("moi ban nhap ho va ten");
        String fullname= scanner.nextLine();

        System.out.println("ho va ten cua ban la = " + fullname);

        System.out.println("moi ban nhap tuoi");
        int age=scanner.nextInt();
        System.out.println("Tuoi cua ban la " + age);

        System.out.println("moi ban nhap gioi tinh");
        System.out.println("nam");
        System.out.println("nu");
        int menu= scanner.nextInt();
        Gender gender;
        if(menu==1){
            gender=Gender.MALE;
        }else{
            gender=Gender.FEMALE;
        }
        System.out.println("Gioi tinh cua ban la: "+ gender);


    }
}
