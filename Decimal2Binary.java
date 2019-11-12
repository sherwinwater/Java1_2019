import java.util.Scanner;
public class Decimal2Binary {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter a decimal:");
    int decimal = sc.nextInt();
    int binary;
    int i = 0;
    String output = "";

//    while( decimal / 2 >= 0 ){
//      binary = decimal % 2;
//      decimal = decimal / 2;
//      output = binary + output;
//      if( decimal == 0) break;
//      i++;
//    }

    //improved
    while( decimal  != 0 ){
      binary = decimal % 2;
      output = binary + output;
      decimal = decimal / 2;
    }
    System.out.println("binary: " + output);

  }
}