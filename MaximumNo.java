import java.util.Scanner;

public class MaximumNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Maximum="+a);
            System.out.println("Minimum="+b);
        }else{
            System.out.println("Maximum="+b);
            System.out.println("Minimum="+a);
        }

        sc.close();
    }
}
