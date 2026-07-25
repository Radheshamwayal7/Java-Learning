import java.util.Scanner;

class PolyMor1 {
    String name;
    int age;

    public void PrintInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public void PrintInfo(String name) {
        System.out.println(this.name);

    }

    public int PrintInfo(int age) {
        System.out.println(age);
        return age;
    }

    public void PrintInfo(String name , int age) {
        System.out.println(name);
        System.out.println(age);
    }

}

public class PolymorphismExUi {
    public static void main(String[] args) {
        
        PolyMor1 pm  = new PolyMor1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Name:");
        pm.name = sc.nextLine();
        System.out.println("Enter Age:");
        pm.age = sc.nextInt();

        System.out.println("The Output Is :");
        pm.PrintInfo();
        sc.close();
    }
}
