package ag_ifelse;

import java.util.Scanner;

public class aa {
    public static void main (String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            if(age >= 18){
                System.out.println("adult: drive, vote");
            }
            if(age>13 && age<18){
                System.out.println("teenager");
            }
            else{
                System.out.println("not adult");
            }
        }
    }
}
