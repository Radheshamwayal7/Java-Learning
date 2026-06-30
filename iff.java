import java.util.Scanner;

public class iff {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        if(x>19){
            System.out.println("Adult");
        }else{
            System.out.println("Not Adult");
        }

    }
}
