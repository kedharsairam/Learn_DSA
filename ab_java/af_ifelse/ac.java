package af_ifelse;

import java.util.*;

public class ac {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();
            if( number % 2 == 0){
                System.out.println("Even");
            }
            else{
                System.out.println("Odd");
            }
        }
    }
}
