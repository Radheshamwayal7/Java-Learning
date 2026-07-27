interface Animal6 {
    void walk();
}

interface Herbivore {
    void eats();
}

class Horse62 implements Animal6 , Herbivore {
    public void walk(){
        System.out.println("Horse has 4 Legs");
    }

    public void eats() {
        System.out.println("Horse Eats Grass");
    }
}

public class InterfaceEx {
    public static void main(String[] args) {
        Horse62 h6 = new Horse62();

        h6.walk();
        h6.eats();
    }
}

