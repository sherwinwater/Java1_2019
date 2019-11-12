import java.util.Scanner;

public class DecimalToHex {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter decimal: ");
    int decimalInput = sc.nextInt();

    String hex = " ";
    while (decimalInput != 0){
      int x = decimalInput % 16;
//      char hex1 = (x >= 0 && x <=9)? (char)(x+'0'):(char)(x-10+'A');
//      hex = hex1 + hex;
//      decimalInput /= 16;
      System.out.println((char)x);

    }
    System.out.println(hex);

  }
}