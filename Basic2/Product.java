package Basic2;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        
        int Product = a * b;
        System.out.println(Product);
        // Area

        int radius = sc.nextInt();
        float AreaofCircle = 3.14f*radius*radius;
        System.out.println("Area of Circle : " + AreaofCircle);

    }
}
