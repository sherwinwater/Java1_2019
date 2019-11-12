import java.util.Scanner;

public class Loop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int i;

    //    1. Write a program to print all odd number between 1 to 100.
//    for (int z = 1; z <= 100; z++) {
//      if (z % 2 != 0) {
//        System.out.println(z);
//      }
//    }
//
//    for (int z = 1; z <= 100; z += 2) {
//      System.out.println(z);
//    }
//
//    int i = 1;
//    while (i <= 100) {
//      System.out.println(i);
//      i += 2;
//    }
//
//    do {
//      System.out.println(i);
//      i += 2;
//    } while (i <= 100);

    //
    //    2. Write a program that takes as input an int 'n' and calculates sum of
    //    all even numbers between 1 to n. Input entered must be greater than 1.
    System.out.println("enter inter:");
    int n = sc.nextInt();
    int sum = 0;
    for (i = 0; i <= n; i += 2) {
      sum += i;
    }
    System.out.println(sum);

    //    3. Write a program that takes as input an int 'n' and print all numbers
    //    in reverse (from n to 1)
    System.out.println("enter inter:");
    n = sc.nextInt();
    //for loop
    for (i = n; i >= 1; i--) {
      System.out.println(i);
    }

    // while
    i = 0;
    while (i < n) {
      System.out.println(n-i);
      i++;
    }


    //    4. Write a program that takes as input an int 'n' and calculates the factorial of a number.
    String isContinue = "y";
    while (isContinue.equalsIgnoreCase("y")) {
      System.out.println("enter inter:");
      n = sc.nextInt();

      // for loop
      int fac = 1;
        for (i = 1; i <= n; i++) {
          fac *= i;
        }
      System.out.println(fac);

        //while
      i = 1;
      fac = 1;
      while (i <= n){
        fac *= i;
        i++;
      }
      System.out.println(fac);

      System.out.println("conitune y/n?");
      isContinue = sc.next();
    }
  }
  }
