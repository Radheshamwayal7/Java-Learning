abstract class Animal1 {
    abstract void walk();
}

class Horse extends Animal1 {
    public void walk() {
        System.out.println("Horse Walk on 4 Legs");
    }
}

class Chicken extends Animal1 {
    public void walk() {
        System.out.println("Chicken walk on 2 Legs");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Horse H = new Horse();
        H.walk();
    }
}
