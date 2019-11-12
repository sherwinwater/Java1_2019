import java.util.Scanner;
public class BitOperation {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter a decimal:");
    int decimal = sc.nextInt();
    int binary;
    int i = 0;
    String output = "";

//    while( decimal  != 0 ){
//      binary = decimal % 2;
//      output = binary + output;
//      decimal = decimal / 2;
//    }
//    int x = Integer.parseInt(output);
//    System.out.println(x);
//    int len = output.length();
//    System.out.println(len);
    int x16 = decimal >> 15;
    System.out.println("binary: " + x16);

  }
}