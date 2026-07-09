import java.util.*;

public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //input
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //2D Array
        int numbers [] [] = new int[rows][cols];

        //outer loop rows
        for(int i = 0; i < rows; i++) {
            //inner loop cols
            for(int j = 0; j < cols; j++)
                numbers [i][j] = sc.nextInt();
        }

        //print
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();

}
}