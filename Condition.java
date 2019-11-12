import java.util.Scanner;
public class Condition {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number less than 100:");
    int x = sc.nextInt();
//    if (x < 100){
////      System.out.println("your number is more than 100");
//      System.out.println("the square root of the number:" + Math.sqrt(x));
//      System.out.println("the square of the number:" + Math.pow(x,2));
//      System.out.println("the cube of the number:" + Math.pow(x,3));
//
//    }

//    if ( x >= 1 && x <=45) {
//      System.out.println("1 - 45");
//    } else {
//      System.out.println("not");
//    }

    if (x > 90){
      System.out.println("A");
    } else if (x >= 70){
      System.out.println("B");
    } else if(x >= 60) {
      System.out.println("C");
    } else if (x >= 50){
      System.out.println("D");
    } else if (x < 50){
      System.out.println("less than 50");
    }


//    1. Using Ternary and if statement operator, write a Java program to get a number
//    from the user and print whether it is positive or negative.
//    2. Using both Ternary operator and if statements, take two numbers
//    from the user and print the smallest number.
//    3. Using both Ternary operator and if statements, take two numbers from
//    the user and print the biggest number.
//    4. Using both Ternary operator and if statements, take three numbers from
//    the user and print the smallest and the biggest number.
//

  }
}
