package ac_datatypes;

import java.util.*;

public class ad {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            float rad = sc.nextFloat();
            float area = 3.14F * rad * rad;
            System.out.println(area);
        }
    }
}
