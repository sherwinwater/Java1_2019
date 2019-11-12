import java.util.Scanner;

public class Relation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //  System.out.println((int)'m');
    //  int i = 5;
    //  int j = 6;
    //  String str1 = "5";
    //
    //  System.out.println(! (i == j));
    //  System.out.println( str1.equals(i));
    //  System.out.println("enter age:");
    //  int age = sc.nextInt();
    //  String val = (age > 65? "Senior" : "not senior");
    //  System.out.println(val);
    //
    //  boolean isTrue = age > 65 ? true : false;
    //  String val1 = age > 65? "senior" : " not senior";
    //  int newValue = age > 65? 5 : 9;
    //  System.out.println(isTrue);

    //    1. Using Ternary operator, write a Java program that gets an int from the user and print whether it is positive or negative.
    System.out.println("enter int");
    int input1 = sc.nextInt();
    String valInt = input1 > 0 ? "positive" : "negative";
    System.out.println(valInt);

    if (input1 > 0) System.out.println("positive");
    else System.out.println("negative");


    //    2. Using Ternary operator, write a Java program that takes two ints from the user and print the smallest number.
    System.out.println("enter 2 integers");
    int one = sc.nextInt();
    int two = sc.nextInt();
    int smallestNumber = (one - two) > 0 ? two : one;
    System.out.println("smallest: " + smallestNumber);

    if (one > two) {
      System.out.println("smallest: " + two);
    } else {
      System.out.println("smallest: " + one);
    }

    //    3. Using Ternary operator, write a Java program that take two ints from the user and print the biggest number.
    System.out.println("enter 2 integers");
    int one1 = sc.nextInt();
    int two2 = sc.nextInt();
    int biggestNumber = (one1 - two2) > 0 ? one1 : two2;
    System.out.println("biggest: " + biggestNumber);

    if (one1 > two2) {
      System.out.println("biggest: " + one1);
    } else {
      System.out.println("biggest: " + two2);
    }

    //    4. Using Ternary operator, write a Java program that takes three ints from the user and print the smallest number.

    String isContinue = "y";
    while (isContinue.equalsIgnoreCase("y")) {
      System.out.println("enter 3 integers");
      int int1 = sc.nextInt();
      int int2 = sc.nextInt();
      int int3 = sc.nextInt();

//      int smallestIsInt1 = (int1 < int2 && int1 < int3) ? int1 : 0;
//      int smallestIsInt2 = (int2 < int1 && int2 < int3) ? int2 : 0;
//      int smallestIsInt3 = (int3 < int2 && int3 < int1) ? int3 : 0;
//      System.out.println("smallest: " + (smallestIsInt1 + smallestIsInt2 + smallestIsInt3));

      int small = (int1 < int2 && int1 < int3) ? int1 :
              (int2 < int1 && int2 < int3) ? int2:
                      (int3 < int2 && int3 < int1) ? int3: 0;
      System.out.println("smallest: " + small);


//      int biggestIsInt1 = (int1 > int2 && int1 > int3) ? int1 : 0;
//      int biggestIsInt2 = (int2 > int1 && int2 > int3) ? int2 : 0;
//      int biggestIsInt3 = (int3 > int2 && int3 > int1) ? int3 : 0;
//
//      System.out.println("biggest: " + (biggestIsInt1 + biggestIsInt2 + biggestIsInt3));



      if ( int1 < int2 && int1 < int3) {
        System.out.println("smallest: " + int1);
      } else if(int2 < int1 && int2 < int3) {
        System.out.println("smallest: " + int2);
      } else if(int3 < int1 && int3 < int2) {
        System.out.println("smallest: " + int3);
      }

      if ( int1 > int2 && int1 > int3) {
        System.out.println("biggest: " + int1);
      } else if(int2 > int1 && int2 > int3) {
        System.out.println("biggest: " + int2);
      } else if(int3 > int1 && int3 > int2) {
        System.out.println("biggest: " + int3);
      }


      System.out.println("Continue y/n?");
      isContinue = sc.next();
    }

    //    5. Using Ternary operator, write a Java program that reads two strings and prints "EQUAL"
    //    if they are equal and "NOT EQUAL" if the two Strings are not equal.

    System.out.println("enter two strings: first one");
    sc.nextLine();
    String s1 = sc.nextLine();
    System.out.println("enter two strings: second one");
    String s2 = sc.nextLine();
    String isEqual = s1.equals(s2)? "EQUAL" : "NOT EQUAL";
    System.out.println(isEqual);

  }
}
