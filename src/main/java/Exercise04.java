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
    void question03(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vui lòng nhập họ và tên: ");
        String s = scanner.nextLine();
        String first = s.substring(0,1);
        String late = s.substring(1,s.length());
        System.out.println("Họ tên sau khi chỉnh sửa: " + first.toUpperCase().concat(late.toLowerCase()));
    }

    void question04(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Xin mời nhập tên: ");
        String s = scanner.nextLine();
        String [] words= s.split("");
        for(String word : words){
            int count=0;
            int x;
            if(!word.isEmpty()){
                count++;
                System.out.println("Kí tự "+ count + ": " + word);
            }
        }
    }

    void question05(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Vui lòng nhập họ: ");
        String s = scanner.nextLine();
        System.out.println("Vui lòng nhập tên: ");
        String x = scanner.nextLine();
        System.out.println("Họ tên của người dùng: " + s.concat(" "+ x));
    }

    String question100(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập chuỗi thứ 1: ");
        String s = scanner.nextLine();
        System.out.println("Nhập chuỗi thứ 2: ");
        String x = scanner.nextLine();
        if(s.length()!=x.length()){
            return "KO";
        }
        for(int i=0; i<s.length();i++){
            char c1=s.charAt(i);
            char c2=x.charAt(s.length()-1-i);
            if(c1!=c2){ return "KO";}
        }
        return "OK";
    }

    String question10(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        if (length1 !=  length2) {
            return "KO";
        }
        for (int i = 0; i < length1; i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(length1 - 1 - i);
            if (c1 != c2) {
                return "KO";
            }
        }
        return "OK";
    }

    String question15(String s){
        String[] words=s.split("");
        String result="";
        for(int i=words.length-1;i>=0;i--){
            result += words[i]+" ";
        }
        return result.trim();
    }


}
