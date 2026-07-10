import java.util.Scanner;

public class StringConcatenationEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        System.out.print(name1 + " " + name2);
        sc.close();
    }
}
