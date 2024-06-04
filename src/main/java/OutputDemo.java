public class OutputDemo {
    public static void main(String[] args) {
        //   \n xuong dong
        //   \t tab
        //     \"

        //%s: đại diện cho String
        //  %d: đại diện cho số nguyên
        //%f: đại diện cho số thực
        //%c: đại diện cho kí tự
        //%n: xuống dòng
        System.out.printf("Họ tên: %s, Tuôi: %d%n", "Tiến", 23);

        // Căn lề
        System.out.println("+----+--------------------+");
        System.out.println("| ID |     FULL NAME      |");
        System.out.println("+----+--------------------+");
        System.out.printf("| %2d | %18s |%n", 1, "Khoa");
        System.out.println("+----+--------------------+");
        System.out.printf("| %-2d | %-18s |%n", 2, "Long");
        System.out.println("+----+--------------------+");

        //gom nhóm, làm tròn
        double money = 125436413953.125;
        System.out.printf("money = %.2f%n",money);
        System.out.printf("money = %,f%n",money);
        System.out.printf("money = %,.2f%n",money);
    }
}
