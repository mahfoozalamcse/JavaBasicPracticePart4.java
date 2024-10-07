package Basic2;
import java.util.*;;
public class Conditional {

    public static void main(String[] args) {
       // switch statement
       /*
        * switch(variable){
        case1:
        case2:
        case3:
        case4:
        default
        }
        */

        int number = 2;
        switch (number) {
            case 1:
                System.out.println("Burger");
                break;
            case 2:
               System.out.println("Samosa");
               break;
            default:
                System.out.println("Give valid input");
                break;
        }

       // Ternary Operator
       // variable = condition ? state1 : state2

       String largest = (5 % 3 == 0) ? "Even" : "Odd";
       System.out.println(largest);

       // check student will pass or Fail
       int marks = 89;
       String rc = (marks >= 33) ? "Pass" : "Fail";
       System.out.println(rc); 

        // print Largest of 3
        int a = 111, b = 90, c = 45;

        if((a > b)  && (a > c)){
            System.out.println("A is Larger");
        }else if((b > a) && (b > c)){
            System.out.println("B is greater ");
        }else{
            System.out.println("C is greater");
        }

        // // income tax calculator

        // Scanner sc = new Scanner(System.in);
        // float income = sc.nextFloat();
        // float tax = 0;
        // if(income < 5){
        //     System.out.println("Tax is :" + tax + " Lakh");
        // }else if (income >= 5 && income <= 10) {
        //     tax = tax + income*0.2f;
        //     System.out.println("Tax is : "+ tax + " Lakh");
        // }else if (income > 10) {
        //     tax = tax + income*0.3f;
        //     System.out.println("Tax is : " + tax + " Lakh");
        // }else{
        //     System.out.println("Give right income ");
        // }

        // int age = 13;

        // if(age >= 18){
        //     System.out.println("adult");
        // }else if(age > 13 && age <18){
        //     System.out.println("teenager");
        // }else{
        //     System.out.println("give valid age");
        // }
     
        // else if statements
        /*
         * if(conditon 1){
         * 
         * }
         * else if(condition 2){
         * 
         * }else{
         * 
         * }
         */

    //  // print number is odd or Even
    //  int a = 177;
    //  if(a % 2 == 0){
    //     System.out.println("Even");
    //  }else{
    //     System.out.println("Odd");
    //  }
  
    //    // print largest of two number
    //    int a = 8;
    //    int b = 9;
    //    if(a > b){
    //     System.out.println("A  is greater : " + a);
    //    }else{
    //     System.out.println("B is greater : " + b);
    //    }




        //1.  if - else
        /*
         * if(condition){
         * 
         * }else{
         * 
         * }
         */

        // int age = 14;
        // if(age > 18){
        //     System.out.println("You are adult");
        // }else{
        //     System.out.println("Yuo not adult");
        // }
    }
}