package ah_loops;

import java.util.Scanner;

public class af {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int n = sc.nextInt();
            int sum = 0;
            int i = 1;
            while(i <= n){
                sum += i;
                i++;
            }
            System.out.println("Sum is : " + sum);
        }
    }
}
