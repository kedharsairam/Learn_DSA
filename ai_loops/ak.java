package ai_loops;

import java.util.Scanner;

public class ak {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){

            do{
                int n = sc.nextInt();

                if(n % 10 == 0){
                    continue;
                }
                System.out.println(n);
            } while (true);
        }
    }
}
