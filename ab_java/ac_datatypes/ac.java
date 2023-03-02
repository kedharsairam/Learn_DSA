package ab_java.ac_datatypes;

import java.util.*;

public class ac {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int product = a * b;
            int sum = a + b;
            System.out.println(product);
            System.out.println(sum);
        }
    }
}
