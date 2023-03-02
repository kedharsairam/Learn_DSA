package ah_loops;

public class ai {
    public static void main(String args[]){
        int n = 28081997;
        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n/10;
        }
        System.out.println();
    }
}
