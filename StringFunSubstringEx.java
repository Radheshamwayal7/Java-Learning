import java.util.Scanner;

public class StringFunSubstringEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        System.out.println("SubString Is :" + name.substring(2));

        sc.close();
    }
}
