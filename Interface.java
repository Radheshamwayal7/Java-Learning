interface Animal6 {
    void walk();
}

class Horse6 implements Animal6 {
    public void walk(){
        System.out.println("Horse has 4 Legs");
    }
}

public class Interface {
    public static void main(String[] args) {
        Horse6 h6 = new Horse6();

        h6.walk();
    }
}
