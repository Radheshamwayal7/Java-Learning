import java.util.Scanner;

public class BinaryOnesComui {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number:");
        int a = sc.nextInt();

        System.out.println("Binary One's Complement is: " + ~a);
        sc.close();
    }
}
