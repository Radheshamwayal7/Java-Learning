import java.util.Scanner;

public class BinaryRightShiftUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Decimal No:");
        int n = sc.nextInt();
        System.out.println("Enter The Index:");
        int pos = sc.nextInt();

        int num = n >> pos;
        System.out.println("Binary Right Shift Is:");
        System.out.println(num);
        sc.close();
    }
}
