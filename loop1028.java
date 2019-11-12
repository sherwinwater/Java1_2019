import java.util.Scanner;

public class loop1028 {
  public static void main(String[] args) {

    //    Write a program which asks the user to input 5 integers.
    //          If the value entered is > 0, then use it to calculate the average.
    //    example: if the value entered are:

    Scanner sc = new Scanner(System.in);

    int j = 0;
    int sum = 0;
    int i = 0;
    int avg = 0;
    String s = " ";
    while (j < 5) {
      j++;
      System.out.println("enter 5 integer. Number " + j);
      int num = sc.nextInt();

      if (num > 0) {
        sum += num;
        avg = sum / ++i;
        s += (char) (num + '0') + " ";
      }
    }
    System.out.println("the avg of " + s + " " + "is" + avg);
    //
    int sumofNumber5 = 0;
    int jj = 0;
    System.out.println("enter one integer");
    int number1 = sc.nextInt();
    if (number1 > 0) {
      sumofNumber5 += number1;
      jj++;
    }
    System.out.println("enter one integer");
    int number2 = sc.nextInt();
    if (number2 > 0) {
      sumofNumber5 += number2;
      jj++;
    }
    System.out.println("enter one integer");
    int number3 = sc.nextInt();
    if (number3 > 0) {
      sumofNumber5 += number3;
      jj++;
    }
    System.out.println("enter one integer");
    int number4 = sc.nextInt();
    if (number4 > 0) {
      sumofNumber5 += number4;
      jj++;
    }
    System.out.println("enter one integer");
    int number5 = sc.nextInt();
    if (number5 > 0) {
      sumofNumber5 += number5;
      jj++;
    }
    System.out.println("the average is " + sumofNumber5 / jj);

    //
    //    2. Write a program that takes as input a number between 1 and 100.
    //    The output of the program will be the multiplication table of the
    //    numbered entered (1 to 10). As an example, if 2 is entered,
    //    then the output of the program will be:
    //    2*1=2
    //    2*2=4
    //.....
    //    2*10 = 20

    //    System.out.println("enter 1 number between 1 and 100");
    //    int m = sc.nextInt();
    //    for (int n=1; n<=10; n++){
    //      System.out.println(m+"*"+n);
    //    }

    //    Write a program to check it the barcode is correct.
    //    A valid barcode is exactly 6 digits. The last digit is always a
    //    “check digit”. To check if the barcode is valid,  add up the sum
    //    of the odd digits (digits in position 1, 3, and 5). If the total
    //    sum is a 2-digit number, add those 2 digits together to get a single
    //    digit number.
    //    Example 1: user enters 909188
    //    check digit: 8
    //    sum = 9 + 9 + 8 = 26 -> 2 + 6 = 8
    //    VALID
    //
    //    Example 2: user enters 211128
    //    check digit: 8
    //    sum = 2 + 1 + 2 = 5
    //
    //int min = Math.pow(10, y);
    //int max = Math.pow(10, y+1);
    //for (int i = min; i < max; i++){
    //    if ( i % xx ==0) {
    //    return i;
    //    break
    //    }
    //}    INVALID

    System.out.println("enter one barcode");




//        String s = sc.next();
//        int slength = s.length();
//        int total = 0;
//        int ss = Integer.parseInt(s);
//        boolean isNarcissistic = true;
//
//        for (int x = 0; x < slength; x++) {
//          char bar = s.charAt(x);
//          int ints = bar - '0';
//          total += Math.pow(ints, slength);
//        }
//
//        if (total == ss ) return isNarcissistic;
//        else return isNarcissistic = false;

    int sumOfBarcode = 0;
    //
    //    String barcode = sc.next();
    //    int barcodeLength = barcode.length();
    //    char barLast = barcode.charAt(barcodeLength-1);
    //    int intbarlast = barLast - '0';
    //
    //    for (int x = 0; x < barcodeLength; x+=2){
    //      char bar = barcode.charAt(x);
    //      int intBarcode = bar - '0';
    ////      int intBarcode = Integer.parseInt(String.valueOf(bar));
    //      sumOfBarcode += intBarcode;
    //    }
    //    if (sumOfBarcode >= 10) {
    //      sumOfBarcode = sumOfBarcode / 10 + sumOfBarcode % 10;
    //    }
    //    if (sumOfBarcode == intbarlast) System.out.println("valid");
    //    else System.out.println("invalid");
    //    }

    //
    int barcode = sc.nextInt();
    int digit1 = barcode / 1000000;
    int digit3 = barcode / 10000 % 100 % 10;
    int digit5 = barcode / 10 % 10000 % 1000 % 100 % 10;
    int digit6 = barcode % 100000 % 100000 % 10000 % 1000 % 100 % 10;
    sumOfBarcode = digit1 + digit3 + digit5;

    if (sumOfBarcode >= 10) {
      sumOfBarcode = sumOfBarcode / 10 + sumOfBarcode % 10;
    }
    if (sumOfBarcode == digit6) System.out.println("valid");
    else System.out.println("invalid");
  }

}
