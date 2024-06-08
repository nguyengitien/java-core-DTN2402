import java.util.Scanner;

public class Exercise04 {
    void question01(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào xau kí tự");
        String s = scanner.nextLine();
        String [] words= s.split(" ");
        int count= 0;
        for(String word : words){
            if(!word.isEmpty()){
                count++;
            }
        }
        System.out.println("so tu la:  " + count);

    }

    void question02(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập vào xâu kí tự 1");
        String s = scanner.nextLine();
        System.out.println("Nhập vào xâu kí tự 2");
        String x = scanner.nextLine();
        System.out.println("s.concat(x) = " + s.concat(x));

    }
}
