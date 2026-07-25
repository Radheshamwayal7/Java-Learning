class Shapes {
    public void area() {
        System.out.println("The Area Of Cirle");
    }
}

class Circle extends Shapes {
    public void circles(int r) {
        System.out.println((3.14 * r * r));
    }
}

class AreaCircle extends Circle {

}

public class MultiLevelInheritence {
    public static void main(String[] args) {
        AreaCircle ac = new AreaCircle();

        ac.circles(5);
    }
}