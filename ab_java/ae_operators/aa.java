package ae_operators;

public class aa {
    public static void main(String args[]){
        int A = 10;
        int B = 5;
        
        System.out.println(A+B);
        System.out.println(A-B);
        System.out.println(A*B);
        System.out.println(A/B);
        System.out.println(A%B);

        int C = ++A; //pre increment
        int D = B++; //post increment

        System.out.println(C);
        System.out.println(D);

        System.out.println((A == B));
        System.out.println((A != B));
        System.out.println((A > B));
        System.out.println((A < B));
        System.out.println((A >= B));
        System.out.println((A <= B));

        System.out.println((A>B) && (A<B));
        System.out.println((A>B) || (A<B));
    }
}
