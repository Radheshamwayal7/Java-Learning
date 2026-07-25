import java.util.Scanner;

class Shape1 {
    String name;

    public void Print() {
        System.out.println("Name Of Shape:"+name);
    }
}

class Shapename1 extends Shape1 {

}

public class SingleLevelInheritenceUi{
    public static void main(String[] args) {
        Shapename1 sn = new Shapename1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Shape Name :");
        sn.name = sc.nextLine();

        sn.Print();
        sc.close();
    }
}

