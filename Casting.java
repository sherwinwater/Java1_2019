import java.util.Scanner;

public class Casting {

  public static void main(String[] args) {
//
//    Write single line Java programs for each of the below questions:
//    1. Declare a string called name. Assign value "Sheridan College".
    String name = "Sheridan College";
//    2. Print the length of the variable name using printf.
    System.out.printf("%d%n", name.length());
//    3. Print the 5th character of the value in variable name using substring.
    System.out.printf("%s%n",name.substring(4,5));
//    4. Print the 5th character of the value in variable name using charAt using printf.
    System.out.printf("%c%n", name.charAt(4));
//    5. Change the 1st to the 8th character of the value in variable name to lowercase and the 9th to 16th character of the variable name to uppercase and print the value.
    String name8 = name.substring(0,8).toLowerCase();
    String name15 = name.substring(8,16).toUpperCase();
    System.out.println(name8 + name15);

//    In multiple lines, write a program that:
//
//    1. Take a String as input using Scanners.
    // Print the last character of the value stored in the variable.
//
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string:");
    String inputString = sc.nextLine();
    System.out.println(inputString.charAt(inputString.length()-1));

    /*
    //
    int i = 4;
    int j = 8;
    System.out.println(4/8);
    System.out.printf("%d%n", 4/8);
    // System.out.printf("%f%n", 4/8); Exception

    System.out.printf("%f%n", 4.0/8);

    int num1 = 5;
    double num2 = 8.2;
    char letter = 'A';
    int ascE = 69;

    int num3 = (int) num2;        //WONT WORK
    double num4 = num1;     // statement 2
    double num5 = letter;
    int anA = letter;       // statement 3
    char anE = (char) ascE;        // statement 4

    System.out.println("num3: " + num3);
    System.out.println("num4: " + num4);
    System.out.println("num5: " + num5);
    System.out.println("anA: " + anA);
    System.out.println("anE: " + anE);

    double m = 5.40;
    byte b = (byte) m;
    int myBInt = b;
    int newI = (byte) m;
    System.out.println("explicit casting byte " + b);
    System.out.println("explicit casting int " + newI);

    int latestI = 500000000;
    byte latestB = (byte) latestI;
    System.out.println("latestB is " + latestB);

    char moo = 'm';
    int ioo = moo;
    byte boo = (byte) moo;
    //byte newBoo = moo;
    System.out.println(boo);

    //math
    System.out.println("Math.pow(7, 2) = " + Math.pow(7, 2));
    System.out.println("Math.sqrt(4.0) = " + Math.sqrt(4.0));
    System.out.println("Math.min(5,6) = " + Math.min(5.777777, 6));
    System.out.println("Math.max(5,6) = " + Math.max(5, 6));
    System.out.println("Math.ceil(-5.4) = " + Math.ceil(-5.4));
    System.out.println("Math.ceil(5.4) = " + Math.ceil(5.4));
    System.out.println("Math.floor(5.6) = " + Math.floor(5.6));
    System.out.println("Math.floor(-5.6) = " + Math.floor(-5.6));
    System.out.println("Math.round(5.4) = " + Math.round(5.4));
    System.out.println("Math.round(5.5) = " + Math.round(5.5));
    System.out.println("Math.round(-5.5) = " + Math.round(-5.5000));
    System.out.println("Math.round(-5.55) = " + Math.round(-5.55));

    System.out.println("Math.abs(-5) = " + Math.abs(-5));

    System.out.printf("Math.sqrt(Math.abs(8-12)) = %.2f%n",
            Math.sqrt(Math.abs(8 - 12)));

     //    ******* IMPLICIT CASTING *********
    byte bb = 10;
    short s = 100;
    int ii = 10000;
    long l = 1000000;
    char c = 'a';
    float f = 10000000.55f;
    double d = 1000000000000.56;

    double newNewD = c;
    short newS = b;
    int newi = s;
    long newL = ii;
    float newF = ii;
    double newD = bb;
    System.out.println("byte is: " + bb);
    System.out.println("New D is: " + newD);
    System.out.println("New New D is: " + newNewD);

    //
    byte newBB = (byte) f;
    int myi = (int) newBB;
    System.out.println(newBB);
    System.out.println(myi);

    boolean xx = true;
    System.out.println(xx);

     */

  }
}