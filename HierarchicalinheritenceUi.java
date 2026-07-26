import java.util.Scanner;

class Shapes3 {
    public void area() {
        System.out.println("Area Calculation");
    }
}

class Triangle3 extends Shapes3 {
    public void triangle(int l,int h){
        double area = 0.5 * l * h;
        System.out.println("Length:" + l);
        System.out.println("Height:" + h);
        System.out.println("The Area Of Triangle:"+area);
    }
}

class Radius12 extends Shapes3 {
   
}

public class HierarchicalinheritenceUi {
    public static void main(String[] args) {
        Triangle3 R1 = new Triangle3();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Length:");
        int l = sc.nextInt();
        System.out.println("Enter Height:");
        int h = sc.nextInt();

        
        R1.area();
        R1.triangle(l,h);
        sc.close();
    }
}

