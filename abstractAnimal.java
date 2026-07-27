abstract class Animals {
    abstract void walk();
    public void eats(){
        System.out.println("Horse Eats");
    }
}

class Horse1 extends Animals {
    public void walk() {
        System.out.println("Horse Has 4 Legs");
    }
}

class Chicken1 extends Animals {
    public void walk() {
        System.out.println("Chicken has 2 Legs");
    }
}

public class abstractAnimal {
    public static void main(String[] args) {
        Horse1 h = new Horse1();
        h.walk();
        h.eats();

        Chicken1 c = new Chicken1();
        c.walk();
        c.eats();
    }
}
