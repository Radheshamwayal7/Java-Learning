class Shapes2 {
    public void area() {
        System.out.println();
    }
}

class Triangle extends Shapes2 {
    public void triangle(int l,int h){
        double area = 0.5 * l * h;
        System.out.println("The Area Of Triangle:"+area);
    }
}

class Radius1 extends Shapes2 {
   
}

public class Hierarchicalinheritence {
    public static void main(String[] args) {
        Triangle R1 = new Triangle();

        R1.area();
        R1.triangle(5,10);
    }
}
