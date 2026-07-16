import java.util.Scanner;

public class Lecture1FormCreation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = "Welcome\n";
        System.out.println(name);

        System.out.println("Enter Your Name :");
        String names = sc.nextLine();
        System.out.println();
        System.out.println("The Name Is :"+names);

        System.out.println();
        System.out.println("Enter College Name :");
        String college = sc.nextLine();
        System.out.println();
        System.out.println("College Is :"+college);

        System.out.println();
        System.out.println("Enter Your Age :");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println();
        System.out.println("Age Is :"+age);

        System.out.println();
        System.out.println("Enter Profession :");
        String prof = sc.nextLine();
        System.out.println();
        System.out.println("Profession Is :"+prof);

        System.out.println();
        System.out.println("Enter Birth Date (DD/MM/YYYY):");
        String birth = sc.nextLine();
        System.out.println();
        System.out.println("Birth Date Is :"+birth);

        System.out.println();
        String thank = "Thank You !!";
        System.out.println(thank);
        sc.close();
    }
}
