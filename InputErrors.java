import java.util.*;


public class InputErrors {

  public static void main(String[] args) {

    try {
      Scanner in = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int number = in.nextInt();

      System.out.println("Root: " + Math.sqrt(number));

    } catch (Exception ex) {
      System.out.println("Error: you must enter a whole number.");
    }
  }
}