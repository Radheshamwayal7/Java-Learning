import java.util.Scanner;

interface Animal66 {
    void walk();
}

interface Herbivore1 {
    void eats();
}

class NameAnimal implements Animal66 , Herbivore1 {
    String name;

    public void walk() {
        System.out.println("Animal Can Walk");
    }

    public void eats(){
        System.out.println("Animal Eats Grass");
    }

    public void Print() {
        System.out.println("Name of Animal Is :" + this.name);
    }
}

public class InterfaceExUi {
    public static void main(String[] args) {
        NameAnimal na = new NameAnimal();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Herbivore Animal :");
        na.name = sc.nextLine();
        na.walk();
        na.eats();

        sc.close();
    }
}
