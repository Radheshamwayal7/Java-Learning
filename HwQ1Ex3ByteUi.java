import java.util.Scanner;

public class HwQ1Ex3ByteUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte age = sc.nextByte();
        System.out.println("The Age Is :" + age);
        sc.close();
    }
}
