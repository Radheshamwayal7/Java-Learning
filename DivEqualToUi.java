import java.util.Scanner;

public class DivEqualToUi {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number:");
        int a = sc.nextInt();

        System.out.println("Enter The Number:");
        int b = sc.nextInt();

        a /= b;
        System.out.println("Division Is :" + a);
        sc.close();
    }
}
