import java.util.Scanner;
public class NumberOvenOdd {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num;
    do{
      System.out.println("enter an integer");
      num = sc.nextInt();
    }while(num < 50 || num >80 );
    System.out.println("COMPLETE");
  }
}
