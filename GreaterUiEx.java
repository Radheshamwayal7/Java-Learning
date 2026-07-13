import java.util.Scanner;

public class GreaterUiEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b) {
            System.out.println("A is Greater Than B");
        }else {
            System.out.println("B is Greater Than A");
        }
        sc.close();
    }
}
