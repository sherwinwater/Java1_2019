public class StringBuilder1124 {
  public static void main(String[] args) {

    String s1 = "hello 112world";
    StringBuilder stringbuilder = new StringBuilder(s1);

    String s2 = stringbuilder.reverse().toString();

//    System.out.println(stringbuilder.reverse().toString());
    System.out.println(s2);



  }
}
