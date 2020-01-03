import java.util.ArrayList;

public class Calculator {
  public static void main(String[] args) {

    Character[] cinput= {'1','2','0','*','2','='};
    System.out.println(getCal(cinput));

  }
  public static int getCal(Character[] input){
    ArrayList<String> list = new ArrayList<>();
    ArrayList<Character> mod = new ArrayList<>();
    String c ="";
    Boolean d = false;

    for(Character s: input){
      if (Character.isDigit(s)){
        c += s;
        d = true;
      } else {
        mod.add(s);
        System.out.println(mod);
        if(d){
          list.add(c);
          c = "";
        }
        System.out.println(list);
        d = false;
      }
    }

    int result = 0;
    for(int i = 0; i < mod.size()-1; ++i){
      switch (mod.get(i)){
        case '+': result = Integer.parseInt(list.get(i)) + Integer.parseInt(list.get(i+1));break;
        case '-': result = Integer.parseInt(list.get(i)) - Integer.parseInt(list.get(i+1));break;
        case '*': result = Integer.parseInt(list.get(i)) * Integer.parseInt(list.get(i+1));break;
        case '/': result = Integer.parseInt(list.get(i)) / Integer.parseInt(list.get(i+1));break;
      }
    }
    return result;
  }
}
