import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) {
        String path="src/main/resources/abc.txt";

        byte[] bytes = "Javacore".getBytes(StandardCharsets.UTF_8);

        IOManager.writeFile(path, bytes,true);
        IOManager.writeFile(path, bytes,true);
        IOManager.writeFile(path, bytes,false);

        byte[] output=IOManager.readFile(path);
        String content= new String(output);
        System.out.println(content);

        Account account = new Account(1,"Tien","145263");
        IOManager.writeObject(path,account,false);
        Account saveAccount= (Account) IOManager.readObject(path);
        System.out.println(saveAccount);
    }
}
