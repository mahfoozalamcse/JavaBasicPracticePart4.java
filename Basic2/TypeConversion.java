package Basic2;

public class TypeConversion {
    public static void main(String[] args) {

        // // Type Promotion
        // int c = 4;
        // byte d = 7;
        // float e = 5;
        // System.out.println(c+d+e);  // output 16.0 which convert long size

        // byte e = 4;
        // byte d = e*4;
        // System.out.println(d);  // give error due to type promotion

        // char a = 'a';
        // char b = 'b';
        // System.out.println((int)a);
        // System.out.println((int)b);
        // System.out.println(a);
        // System.out.println(b-a);

        // coversion rule
        /*
         * a. type compatible
         * b. Destination > source type
         */
        // long a = 23;
        // int b = a;
        // System.out.println(b);  // conversion not autometic


        // type costing // means forcefully convert

        // int a = (int)99.9f;
        // System.out.println(a);
    }
}
