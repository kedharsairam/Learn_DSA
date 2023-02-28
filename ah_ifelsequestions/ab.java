package ah_ifelsequestions;

import java.util.Scanner;

public class ab {
    public static void main(String args[]){
        try(Scanner sc = new Scanner(System.in)){
            int number = sc.nextInt();
            String type = ((number % 2) == 0) ? "even" : "odd";
            System.out.println(type);
        }
    }
}
