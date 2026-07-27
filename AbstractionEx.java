abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("walk on 4 legs");
    }
}

class Chiken extends Animal {
    public void walk() {
        System.out.println("walk on 2 legs");
    }
}

public class AbstractionEx {
    public static void main(String[] args) {
        Animal A = new Animal();
        A.walk();
    }
}