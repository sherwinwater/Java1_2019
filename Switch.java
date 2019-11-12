import java.util.Scanner;

public class Switch {
  public static void main(String[] args) {

    //    Using ternary operators && if statements && switch statements:
    //
    //    1. Write a program that reads two integers and check if they are equal
    Scanner sc = new Scanner(System.in);
    System.out.println("enter two integers:");
    int int1 = sc.nextInt();
    int int2 = sc.nextInt();

    String isEqual = (int1 == int2) ? "equal" : "not equal";
    System.out.println(isEqual);
    if (int1 == int2) {
      System.out.println("equal");
    } else {
      System.out.println("not equal");
    }

    switch (int1 - int2) {
      case 0:
        System.out.println("equal");
        break;
      default: System.out.println("not equal");
    }
    //
    //    2. Write a program that reads an integer and check if it is even or odd
    System.out.println("enter one integer(even/odd):");
    int int3 = sc.nextInt();

    String isEven = (int3 % 2 == 0) ? "even" : "odd";
    System.out.println(isEven);
    if (int3 % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }

    switch (int3 % 2) {
      case 0:
        System.out.println("even");
        break;
      default: System.out.println("odd");
    }

    //
    //    3. Write a program that reads two strings and check if they are equal (for switch, assume max length of 4)
    System.out.println("enter first strings:");
    String string1 = sc.next();

    System.out.println("enter second strings:");
    String string2 = sc.next();

    String stringIsEqual = (string1.equals(string2)) ? "equal" : "not equal";
    System.out.println(stringIsEqual);

    if (string1.equals(string2)) {
      System.out.println("equal");
    } else {
      System.out.println("not equal");
    }

    String isTrue = Boolean.toString(string1.equals(string2));

    switch (isTrue) {
      case "true":
        System.out.println("equal");
        break;
      default: System.out.println("not equal");
    }

    switch (string1.length() - string2.length()) {
      case 0: {
        switch ((int) string1.charAt(0) - (int) string2.charAt(0)) {
          case 0: {
            switch ((int) string1.charAt(1) - (int) string2.charAt(1)) {
              case 0: {
                switch ((int) string1.charAt(2) - (int) string2.charAt(2)) {
                  case 0: {
                    switch ((int) string1.charAt(3) - (int) string2.charAt(3)) {
                      case 0: System.out.println("equal");
                        break;
                      default: System.out.println("not equal");
                    }
                  }
                  break;
                  default: System.out.println("not equal");
                }
              }
              break;
              default: System.out.println("not equal");
            }
          }
          break;
          default: System.out.println("not equal");
        }
      }
      break;
      default: System.out.println("not equal");
    }
  }
}
