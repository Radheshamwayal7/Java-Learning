import java.util.Scanner;

public class multiplyNo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int mul = 1;
            for(int i = 1; i <= n; i++){
                mul = mul * i;
            }
            System.out.println("Multiply =" + mul);

            sc.close();
        }
}
