package ag_ifelse;

import java.util.Scanner;

public class aa {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>=b && a>=c){
                System.out.println("A");
            }
            else if(b>=c){
                System.out.println("B");
            }
            else{
                System.out.println("C");
            }
        }
    }
}
