import java.util.Arrays;

public class ReturnArray1117 {
  public static int[] returnArray() {
    int a1 = 20;
    int a2 = 23;
    int a3 = 87;
    return new int[]{a1, a2, a3};     //returns array
  }

  public static void main(String args[]) {
    int[] arr = returnArray();    //invoking method and storing returned array into arr
    System.out.println(Arrays.toString(arr));   //returns the string representation of the object
  }

}
