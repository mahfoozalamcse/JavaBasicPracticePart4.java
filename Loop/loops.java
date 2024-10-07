package Loop;

import java.util.Scanner;

public class loops {
  public static void main(String[] args) {
    // check number is prime or not
    int number = 17;
    if(number == 2){
      System.out.println("Prime");
    }else{
      boolean isPrime = true;
    for(int i = 2; i<number-1; i++){
      if(number % i == 0){
        isPrime = false;
      
      }
    }
    if(isPrime == true){
      System.out.println(" n is prime");
    }else{
      System.out.println(" n is not prime");
    }
  }

    // continueue
    // skip that match point
  

    // Break   
    // Exite the loop

    int count = 1;
    do{
      System.out.print(count+" ");
      count++;
    }while(count <= 10);

    // Do while loop
    /*
     * do{
     * // do something
     * }while();
     */

  // Reverse Given number
  int n = 109992;
  int rev = 0;
  while (n > 0) {
    int lastDigit = n % 10;
    rev = (rev*10)+ lastDigit;
    n = n / 10;
  }  
 System.out.println(rev);

  //  // print reverse of the number
  //  int number = 10998;
  //  while (number > 0) {
  //     int lastDigit = number % 10;
  //      System.out.print(lastDigit);
  //      number /= 10;
  //  }

    // // print square pattern
    // int n = 4;
    // for(int i = 0; i < n; i++){
    //   System.out.println("****");
    // }


    // int n = 12;
    // int sum = 0;
    // for(int i=0; i<n; i++){
    //    sum += i;
      
    // }
    // System.out.println("Sum is : "+ sum);

    // for loop
    /*
     * for(intialisation; condition; updation){
     * // do something
     * 
     * }
     */

    // // print sum of n natural number

    // Scanner sc = new Scanner(System.in);
    // int range = sc.nextInt();
    // int counter = 1;
    // int sum = 0;
    // while (counter <= range ) {
    //      sum =  sum + counter;
    //     counter++;
    // }
    // System.out.println("Sum is : "+ sum);

    // // print number from  1 to n
    // Scanner sc = new Scanner(System.in);
    // int range = sc.nextInt();
    // int counter = 1;

    // while (counter <= range) {
    //   System.out.print(counter+" ");
    //   counter++;
    // }


    // print number from 1 to 10
  
    // int counter = 1;
    // while (counter <= 10) {
    //   System.out.print(counter + " ");
    //   counter++;

    // }
    // while loop
    /*
     * while(condition){
     * // do something
     * }
     */
  }
}
