import java.util.Scanner;

class Shapes1 {
    public void area() {
        System.out.println("The Area Of Cirle");
    }
}

class Circle extends Shapes1 {
    public void circles(int r) {
        double Areacircle = 3.14*r*r;
        System.out.println(Areacircle);
    }
}

class AreaCircle1 extends Circle {

}

public class MultiLevelInheritenceUi {
    public static void main(String[] args) {
        AreaCircle1 ac = new AreaCircle1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number :");
        int Radius= sc.nextInt();
        
        ac.area();
        ac.circles(Radius);
        
        sc.close();
        
    }
}
