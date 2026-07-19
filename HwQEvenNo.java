public class HwQEvenNo {
    public static void main(String[] args) {
       
        int n = 20;

        for(int i = 2; i <= n; i = i + 2) {
            if(n%2 == 0) {
                System.out.println(i);
            }
        }
    }
}