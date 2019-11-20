import java.util.Scanner;

public class DistinctNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter 10 numbers: ");
    int length = 10;
    int[] num = new int[length];

    //method one
    //    for (int i = 0; i < length; ++i){
    //      num[i] = sc.nextInt();
    //    }
    //
    //    for(int i = 0; i < num.length; ++i){
    //      boolean isDistinct = true;
    //      for (int j = i -1; j >= 0 ; --j){
    //        if (num[i] == num[j])
    //          isDistinct = false;
    //      }
    //      if(isDistinct) System.out.print(num[i] + " ");
    //    }

    int[] numStore;
    int numSize = 0;
    for (int i = 0; i < length; ++i) {
      int n = sc.nextInt();
      boolean isDistinct = true;
      for (int j = i - 1; j >= 0; --j) {
        if (n == num[j]) isDistinct = false;
      }
      if (isDistinct) {
        num[++numSize] = n;
        System.out.print(num[numSize] + " ");
      }
    }
  }

}
