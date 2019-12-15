import java.util.Scanner;
public class Exception1120 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    try {
      int grade = sc.nextInt();
      System.out.println(grade);
    } catch (Exception e){
      System.out.println("incorrect input");
    }

//      int g = sc.nextInt();
//      System.out.println(g);
//      if ( g == 0) throw new Exception("cannot be 0");

  }
}
