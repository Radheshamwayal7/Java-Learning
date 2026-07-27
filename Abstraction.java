abstract class Animal1 {
    abstract void walk();
}

class Horse2 extends Animal1 {
    public void walk() {
        System.out.println("Horse Walk on 4 Legs");
    }
}

class Chicken2 extends Animal1 {
    public void walk() {
        System.out.println("Chicken walk on 2 Legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse2 H = new Horse2();
        H.walk();
    }
}
