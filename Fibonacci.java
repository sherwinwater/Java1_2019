import java.util.Scanner;

public class Fibonacci {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a index:");
    int n = sc.nextInt();
    System.out.println("the index" + n+ " Fibonacci num: " + xMath(n));
    for (int i = 0; i <=n; i++){
      System.out.println(i + " " + xMath(i));
    }
  }

    public static int xMath(int i){

      if (i == 0){
        return 0;
      }else if (i ==1){
        return 1;
      } else {
        return xMath(i-1)+xMath(i-2);
      }

    }

}
