import java.util.Scanner;

public class HwQCalculatorUi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:");
        double a = sc.nextDouble();
        System.out.print("Enter a Number:");
        double b = sc.nextDouble();

        System.out.println("Choose An Operator :");
        System.out.println("+ : Addition :");
        System.out.println("- : Subtraction :");
        System.out.println("* : Multiplication :");
        System.out.println("/ : Division :");
        System.out.println("% : Modulo :");        

        System.out.println("Enter The Operator :");
        char op = sc.next().charAt(0);

        switch (op) {
            case '+':
                System.out.println("Answer :" + (a + b));
                break;

            case '-':
                System.out.println("Answer :" + (a - b));
                break;

            case '*':
                System.out.println("Answer :" + (a * b));
                break;

            case '/':
                if(b != 0){
                    System.out.println("Answer :" + (a / b));
                }else{
                    System.out.println("Cannot Divide By Zero ..");
                }

            case '%':
                System.out.println("Answer :" + (a % b));
                break;

            default:
                System.out.println("Invaild Operator.");
                break;
        }
        sc.close();
    }
}
