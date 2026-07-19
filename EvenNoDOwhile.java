public class EvenNoDOwhile {
    public static void main(String[] args) {
        
        int n = 33;
        int i = 2;

        if(n >= 2){
            do{
                System.out.println(i);
                i = i + 2;
            }while(i <= n);
        }
    }
}
