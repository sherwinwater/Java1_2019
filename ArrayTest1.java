public class ArrayTest1 {
  public static void main(String[] args) {

//    int[] a = {1,2,3};
//    int[] z = a;
//    z[0] = 3;
//    System.out.println(a[0]);
//    z[2] = 1;
//    for (int i=0; i<a.length; i++)
//      System.out.print(a[i] + " ");

    int[] a = {1,2,3};
    int[] z = a;
    z[0] = 3;
    z[2] = 1;
    int[] c = a;
    for (int i=0; i<c.length; i++)
      System.out.print(c[i] + " ");

  }
}
