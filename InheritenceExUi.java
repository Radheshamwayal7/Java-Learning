import java.util.Scanner;

class Inheritence1 {
    String name;
    int age;

    public void Print(){
        System.out.println("The Name Is :"+ name);
        System.out.println("The Age Is :"+ age);
    }
}

class StudentInfo extends Inheritence1 {

}

public class InheritenceExUi {
    public static void main(String[] args) {
        StudentInfo St = new StudentInfo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Name:");
        St.name = sc.nextLine();
        System.out.println("Enter The Age:");
        St.age = sc.nextInt();

        St.Print();
        sc.close();
    }
}

