import java.util.Scanner;

public class EqualToEqualToUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The Number:");
        int a = sc.nextInt();
        System.out.print("Enter The Number:");
        int b = sc.nextInt();

        if(a == b) {
            System.out.println("The Numbers Are Equal");
        }else {
            System.out.println("The Numbers Are Not Equal");
        }
        sc.close();
    }
}
