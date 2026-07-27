abstract class Animals5 {
    abstract void walk();
    
    Animals5(){
        System.out.println("Your creating a new Animal");
    }
    public void eats(){
        System.out.println("Horse Eats");
    }
}

class Horse11 extends Animals5 {
    Horse11(){
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("Horse Has 4 Legs");
    }
}

class Chicken11 extends Animals5 {
     Chicken11(){
            System.out.println("Created a Chicken");
        }
    public void walk() {
        System.out.println("Chicken has 2 Legs");
    }
}

public class abstractUsingConstructor {
    public static void main(String[] args) {
        Horse11 h = new Horse11();
        h.walk();
        h.eats();

        Chicken11 c = new Chicken11();
        c.walk();
        c.eats();
    }
}

