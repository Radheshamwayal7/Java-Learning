import java.util.Scanner;

public class PositiveNegativeUi {
    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);

        System.out.print("Enter The Number:");
        int n = c.nextInt();
        if(n > 0) {
            System.out.println("The Number Is Positive.");
        }else if(n == 0) {
            System.out.println("The Number Is Zero.");
        }else{
            System.out.println("The Number Is Negative.");
        }
        c.close();
    }
}
