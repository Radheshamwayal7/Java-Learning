import java.util.Scanner;

abstract class Animals3 {
    String name;
    abstract void walk();
    public void eats(){
        System.out.println("The Animal Eats");
    }
}

class Animal0 extends Animals3 {
    public void walk(){
        System.out.println("The Animal Walk");
    }
}

class Animal4 extends Animals3 {
    public void walk(){
        System.out.println("The Animal Walk");
    }
}

public class abstractUI {
    public static void main(String[] args) {
        Animal0 am0 = new Animal0();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Animal Name:");
        am0.name = sc.nextLine();

        am0.eats();
        am0.walk();
        sc.close();
    }
}
