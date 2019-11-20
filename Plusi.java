public class Plusi {
  public static void main(String[] args) {
    int a =0;
    int x = 0;
    int b = 0;
    System.out.println("a  "+"b");

    for (int i =0 ; i < 10; ++i){
//      a++;
      a = a++;
      b = a++;
      System.out.println(a+"  "+b);
    }
    System.out.println();
    System.out.println(a);
    System.out.println(b);
  }
}
