package Basic2.Operator;

public class Relational {
    public static void main(String[] args) {
        // Relational => ==, !=, > , <, >=, <=
        int a = 8;
        int b = 9;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        // Logical Operator   &&  ||  !

        System.out.println((a>b) && (a < b));
        System.out.println((a>b) || (a<b));
        System.out.println(!(a<b));

        // Assignment operator
        
        System.out.println(a = b);
         a += 10;
        System.out.println(a);
        a -= 1;
        System.out.println(a);
        a /= 2;
        System.out.println(a);
        a %= 3;
        System.out.println(a);
    }
}
