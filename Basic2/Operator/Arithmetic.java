package Basic2.Operator;

public class Arithmetic {
    public static void main(String[] args) {
        // Binary + , - , * , / %  
        // Unary  ++ --

        int a = 5;
        int b = 6;
         System.out.println("Add : "+ (a+b));

         System.out.println("Add : "+ (a-b));

         System.out.println("Add : "+ (a*b));

         System.out.println("Add : "+ (a/b));

         // unary Operator
         // ++ , --
        // ++a preIncreement, a++ postIncreement

        int c = 10;
        int d = ++c;
        System.out.println(c);
        System.out.println(d);

        int e = 3;
        int f = e--;
        System.out.println(e); // 2
        System.out.println(f); // 3

        int g = 2;
        int h = --g;
        System.out.println(g);
        System.out.println(h);
    }
}
