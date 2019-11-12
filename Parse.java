import java.util.Scanner;

public class Parse {
  public static void main(String[] args){
    String s1 = "44";

    int i1 = Integer.parseInt(s1);
    float f1 = Float.parseFloat(s1);
    double d1 = Double.parseDouble(s1);
    float f2 = (float) i1;
    int i2 = (int) f2;

    char c1 = 'a';
    byte b1 = (byte) c1;
    System.out.println(b1);

    System.out.println(i1);
    System.out.println(i2);

    System.out.println(f1);
    System.out.println(f2);

    System.out.println(d1);

    int i = 5;
    System.out.println(i++);//5
    System.out.println(i); //6
    System.out.println(++i);//7
    System.out.println(i);//7
    System.out.println(i+=1);//8
    System.out.println(i);//8

    Scanner sc = new Scanner(System.in);
    System.out.println("input int: ");
    int x = sc.nextInt();
    sc.nextLine();    //flush

    System.out.println("input number: ");
    String ss = sc.nextLine();
    String w1 = ss.substring(0,2);
    String w2 = ss.substring(2);
    int w1Int = Integer.parseInt(w1);
    int w2Int = Integer.parseInt(w2);
    System.out.println(w1Int+w2Int);

    String s2 = "H";
    String s3 = "h";
    System.out.println(s3.equals(s2));
    System.out.println(s2.toLowerCase());

    System.out.println(s3.equalsIgnoreCase(s2));

  }
}
