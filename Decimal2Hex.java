import java.util.Scanner;
public class Decimal2Hex {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter a decimal:");
    int decimal = sc.nextInt();
    int d = decimal;
    int hex;
    int i = 0;
    String output = "";

    while( decimal / 16 >= 0 ){
      hex = decimal % 16;
      decimal = decimal / 16;
      switch (hex){
        case 10: output = "A" + output;break;
        case 11: output = "B" + output;break;
        case 12: output = "C" + output;break;
        case 13: output = "D" + output;break;
        case 14: output = "E" + output;break;
        case 15: output = "F" + output;break;
        default: output = hex + output;
      }
      if( decimal == 0) break;
      i++;
    }
    System.out.println("hex: " + output);


    // improved
    output = "";
    hex = 0;
    decimal = d;

    while( decimal != 0 ){  // !=
      hex = decimal % 16;
      switch (hex){
        case 10: output = "A" + output;break;
        case 11: output = "B" + output;break;
        case 12: output = "C" + output;break;
        case 13: output = "D" + output;break;
        case 14: output = "E" + output;break;
        case 15: output = "F" + output;break;
        default: output = hex + output;
      }
//      if( decimal == 0) break;
//      i++;
      decimal = decimal / 16;  // move to the last to start the iteration
    }
    System.out.println("hex: " + output);

  }
}