import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Scanner1124 {
  public static void main(String[] args) throws IOException

  {
    java.io.File file = new java.io.File("text.txt");
    Scanner input = new Scanner(file);
//    Scanner input = new Scanner(System.in);
    int intValue = input.nextInt();
    String line = input.next();
    System.out.println(intValue);
    System.out.println(line);

  }
}
