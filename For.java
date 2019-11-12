import java.util.Scanner;

public class For {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    for (int i = 1; i < 10; i++) {
      for (int j = 10; j < i; j--) {
        System.out.println("hello");
      }
    }

    for (int i = 0; i < 2; i++) {
      for (int j = 3; j > i; j--) {
        System.out.println("tim" + i + " " + j);
      }
    }

    String s = "hello";
    int i = 0;
    while (i < s.length()) {
      System.out.println(s.charAt(i++));  //s.charAt(i)
      //      i++;
    }

    int x = 5;
    while (x < 5) {
      System.out.println(x);
      i++;
    }
    int count = 9;
    do {
      System.out.println(count);
      count--;
    } while (count <= 10 && count > 4);
    System.out.println(count);

    int number = 0;  // why do we have to declare this here?
    do {
      System.out.print("Enter a number between 1 and 100, inclusive: ");
      number = in.nextInt();
    } while (number < 1 || number > 100);

    System.out.printf("You entered %d\n", number);
//
    int number2;  // why do we have to declare this here?
    do {
      System.out.print("Enter a number between 1 and 100, inclusive: ");
      number2 = in.nextInt();
      if (number2 < 1 || number2 > 100)
        System.out.println("Error: You must enter a value between 1 and 10.");
    } while (number2 < 1 || number2 > 100);

    System.out.printf("You entered %d\n", number2);

    /////

//    1. Write a program to print all odd number between 1 to 100.
    for (int z = 1; i <= 100; i++){
      if (z % 2 != 0) {
        System.out.println(z);
      }
    }


//
//    2. Write a program that takes as input an int 'n' and calculates sum of all even numbers between 1 to n. Input entered must be greater than 1.
//
//    3. Write a program that takes as input an int 'n' and print all numbers in reverse (from n to 1)
//
//    4. Write a program that takes as input an int 'n' and calculates the factorial of a number.

  }
}
