import java.util.Scanner;

public class HwQ2RadiusOfCircleUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Diameter :");
        double diameter = sc.nextDouble();
        double radius = diameter / 2;
        System.out.println("Radius Of A Circle Is :" + radius);
        sc.close();
    }
}
