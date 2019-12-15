public class ArrayCreate1117 {
  public static void main(String[] args) {
    String[] s = new String[3];
    String[] myStringArray = new String[3];
    String[] myStringArray1 = {"a", "b", "c"};
    String[] myStringArray2 = new String[]{"a", "b", "c"};

    //assign value to array
    String[] a3 = myStringArray1;
    myStringArray1[0] = "hhh";

    int[] myIntArray = new int[3];
    int[] myIntArray1 = {1, 2, 3};
    int[] myIntArray2 = new int[]{1, 2, 3};

    //array copy
    for (int i = 0; i < myStringArray1.length; ++i) {
      myStringArray2[i] = myStringArray1[i];
    }
    myStringArray1[0] = "eee";


    System.out.println(myStringArray1[0]);
    System.out.println(myStringArray2[0]);
    System.out.println(a3[0] + a3[1] + a3[2]);
  }

}
