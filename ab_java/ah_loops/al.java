package ah_loops;

import java.util.Scanner;

public class al {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){

            do{
                int n = sc.nextInt();
                if(n % 10 == 0){
                    break;
                }
                System.out.println(n);
            } while(true);
        }
    }
}
