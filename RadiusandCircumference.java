import java.util.Scanner;

public class RadiusandCircumference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Radius=");
        double radius = sc.nextDouble();

        double circumference = 2 * Math.PI * radius;

        System.out.println("Circumference ="+circumference);

        sc.close();
    }
}
