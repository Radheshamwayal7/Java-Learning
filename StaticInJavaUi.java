import java.util.Scanner;

class Student7 {
    String name;
    static String School;
    static int age;

    public void print() {
        System.out.println("The Name Is :"+this.name);
    }
}

public class StaticInJavaUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student7 s = new Student7();

        System.out.println("Enter Student Name :");
        s.name = sc.nextLine();
        s.print();

        System.out.println("Enter School Name :");
        Student7.School = sc.nextLine();
        System.out.println("School Name Is :"+ Student7.School);

        System.out.println("Enter Age :");
        Student7.age = sc.nextInt();
        System.out.println("Age Is :"+ Student7.age);

        sc.close();
        
    }
}
