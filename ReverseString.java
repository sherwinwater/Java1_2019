import java.util.Scanner;
public class ReverseString {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    System.out.println("enter a decimal:");
    String s = sc.next();
    int len =s.length();
    String result = "";
    for (int i = 0; i < len; i++){
      result = s.charAt(i) + result;
    }
      System.out.print(result);

  }
}