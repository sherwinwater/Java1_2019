//a. Write a program that does the following
//        Asks the user to enter a 4 digit integer.
//        Splits the number into two 2-digit numbers and adds them up.
//        Print the sum.

import java.util.Scanner;
public class Class925 {
 public static void main(String[] args){
//   Scanner sc = new Scanner(System.in);
//
//   System.out.println("enter 4 digit integer");
//   String input = sc.nextLine();
//   String input1 = input.substring(0,2);
//   String input2 = input.substring(2);
//   int input1integer = Integer.parseInt(input1);
//   int input2integer = Integer.parseInt(input2);
//   int sum = input1integer+input2integer;
//   System.out.println(sum);
//
//   //
////   b. Write a program that reads the balance and the annual percentage interest rate using Scanners
////   and displays the interest for the next month.
////           Formula is: interest = balance * (annualInterestRate/1200)
//
//   System.out.println("enter your balance:");
//   float balance = sc.nextFloat();
//   System.out.println("enter your annual percentage interest rate (eg. 5.3, 5.15):");
//   float annualInterest = sc.nextFloat();
//   float monthInterest = balance * annualInterest / 1200;
//   System.out.printf("next month interest: %.2f%n", monthInterest);
//
////
////   c. Write a program that calculates the energy needed to heat water from an initial temperature to
////   a final temperature. Your program should prompt the user to enter the amount of water in kilograms
////   and the initial and final temperatures of the water.
////   The formula to compute the energy is Q = M * (finalTemperature – initialTemperature) * 4184
////   where M is the weight of water in kilograms, temperatures are in degrees Celsius, and energy Q is measured in joules.
////   Ensure your output has two decimal places.
//
//   System.out.println("enter the amount of water in KiloGrams(KG):");
//   float waterAmount = sc.nextFloat();
//   System.out.println("enter the initial temperature(Celsius):");
//   float initialTemperature = sc.nextFloat();
//   System.out.println("enter the final temperature(Celsius):");
//   float finalTemperature = sc.nextFloat();
//   float energy = waterAmount * (finalTemperature - initialTemperature) * 4184;
//   System.out.printf("%.2f%n", energy);
//
////   d. Write a program that reads a String input. Print the following:
//   //   first character of the input
//   //   last character of the input
//   //   ASCII code of the first character
//   //   ASCII code of the last character
//
//   System.out.println("enter a string:");
//   String inputString = sc.next();
//   char firstChar = inputString.charAt(0);
//   char lastChar = inputString.charAt(inputString.length()-1);
//   int firstCharASCII = (int)firstChar;
//   byte lastCharASCII = (byte)lastChar;
//
//   System.out.println(firstChar);
//   System.out.println(lastChar);
//   System.out.println(firstCharASCII);
//   System.out.println(lastCharASCII);
//
//   char m = '5';
//   System.out.println(m);

   int i = 5;
   System.out.println("i++: " + i++ * 2);
   System.out.println(i);
   System.out.println("++i " + ++i);
   System.out.println(i);

   int x = 1;
   System.out.println(x+=1);
   System.out.println(x*=2);

   System.out.println(Math.pow(x*=2,2));
   System.out.println((int)(Math.pow(x*=2,2)));


 }
}
