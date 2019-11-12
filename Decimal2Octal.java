import java.util.Scanner;
public class Decimal2Octal {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter a decimal:");
    int decimal = sc.nextInt();
    int octal;
    int i = 0;
    String output = "";

//    while( decimal / 8 >= 0 ){
//      octal = decimal % 8;
//      decimal = decimal / 8;
//      output = octal + output;
//      if( decimal == 0) break;
//      i++;
//    }

    //improve
    while( decimal != 0 ){
      octal = decimal % 8;
      output = octal + output;
      decimal = decimal / 8;
    }
    System.out.println("octal: " + output);

  }
}