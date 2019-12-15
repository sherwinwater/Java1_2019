public class VariableScoping {
  public static void main(String[] args) {

    int i = 5;
    int j = changeMe(i);
    int z = changeMeAgain(j);
    System.out.println(j);
    System.out.println(z);
  }

  public static int changeMe(int moo) {
    return moo++;
//    return moo;

  }

  public static int changeMeAgain(int boo) {
   return boo+=2;
//    return boo;
  }
}
