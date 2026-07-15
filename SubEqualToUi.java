import java.util.Scanner;

public class SubEqualToUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number :");
        int a = sc.nextInt();
        System.out.println("Enter The Number :");
        int b = sc.nextInt();

        a -= b;
        System.out.println("Subtraction is :" + a);
        sc.close();
    }
}
