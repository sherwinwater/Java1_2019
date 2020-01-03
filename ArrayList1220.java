import java.util.ArrayList;

public class ArrayList1220 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    list.add("bei");
    list.add("nan");
    list.add("sanf");

    System.out.println(list.toString());
    System.out.println(list.isEmpty());
    System.out.println(list.size());

    //
    ArrayList<Number> number = new ArrayList<>();
    number.add(3);
    number.add(2.222);

    System.out.println(number.toString());
    System.out.println(number.get(0));

  }
}
