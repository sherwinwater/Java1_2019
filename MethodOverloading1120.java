public class MethodOverloading1120 {
  public static void main(String[] args) {
    tryMe();
    tryMe("hello",2);
  }

  public static void tryMe(String val) {
    System.out.println(val);
  }

  public static void tryMe(int val) {
    System.out.println(val);
  }

  public static void tryMe(String val, int num) {
    System.out.println(val + " " + num);
  }

  public static void tryMe(short num, String val) {
    System.out.println(val + " " + num);
  }

  public static void tryMe() {
    System.out.println("Nothing");
  }


}
