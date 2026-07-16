import java.util.Scanner;

public class HwQ1Ex5CharUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char name = sc.next().charAt(0);
        System.out.println("The Char Is :" + name);
        sc.close();
    }
}
