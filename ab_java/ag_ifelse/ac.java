package ag_ifelse;

import java.util.Scanner;

public class ac {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int marks = sc.nextInt();
            String student = ((marks) >= 33)? "Pass" : "Fail";
            System.out.println(student);
        }
    }
}
