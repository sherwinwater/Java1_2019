//2.Write a program that mergers two int arrays into one array.
//        The method should be declared as:public int[]joinMe(int[]a1,int[]a2)
//        The array that is returned should have the values in array a1 first
//        and then the values in array a2.

public class JoinMeMockexam1202 {
  public static void main(String[] args) {
    int[] a1 = {2, 3, 4};
    int[] a2 = {6, 7, 8};
    int[] a1Plusa2 = joinMe(a1, a2);
    for (int i : a1Plusa2) System.out.print(i + " ");
  }

  public static int[] joinMe(int[] a1, int[] a2) {
    int[] a3 = new int[a1.length + a2.length];

    for (int i = 0; i < a1.length; ++i) {
      a3[i] = a1[i];
    }
    for (int i = 0; i < a2.length; ++i) {
      a3[a1.length + i] = a2[i];
    }
    return a3;
  }
}
