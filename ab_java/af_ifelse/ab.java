package ab_java.af_ifelse;

import java.util.*;

public class ab {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b){
                System.out.println("A is largest of 2");
            }
            else if (b > a){
                System.out.println("B is largest of 2");
            }
            else{
                System.out.println("Both are equal");
            }
        }
    }
}
