import java.util.Scanner;
public class Fruit1104midterm {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("input your favorite fruits");
    String fruitInput = sc.next();
    String fruit = "";

    if (fruitInput.equals("Exit")){
      fruit = "NONE";
    }

    while(!fruitInput.equals("Exit")){
      fruit = fruit + " " + fruitInput;
      fruitInput = sc.next();
    }

    System.out.println("fruits are:" + fruit);

  }
}
