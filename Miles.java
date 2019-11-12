public class Miles{
  public static void main(String[] args){

    double milesToKilometer = 1.608;
    String s1 = "Miles";
    String s2 = "Kilometers";
    String s3 = "|";
    int m1 = 1;
    int m2 = 2;
    int m9 = 9;
    int m10 = 10;
    int m20 = 20;
    int m25 = 25;
    int m60 = 60;
    int m65 = 65;

    double k1 = m1 * milesToKilometer;
    double k2 = m2 * milesToKilometer;
    double k9 = m9 * milesToKilometer;
    double k10 = m10 * milesToKilometer;
    double k20 = m20 * milesToKilometer;
    double k25 = m25 * milesToKilometer;
    double k60= m60 * milesToKilometer;
    double k65= m65 * milesToKilometer;

    System.out.printf("%-10s %-10s %-1s %-10s %-10s%n", s1, s2, s3, s1, s2);
    System.out.printf("%-10s %-10.3f %-1s %-10s %-10.3f%n", m1, k1, s3, m20, k20);
    System.out.printf("%-10s %-10.3f %-1s %-10s %-10.3f%n", m2, k2, s3, m25, k25);
    System.out.println("...");
    System.out.printf("%-10s %-10.3f %-1s %-10s %-10.3f%n", m9, k9, s3, m60, k60);
    System.out.printf("%-10s %-10.3f %-1s %-10s %-10.3f%n", m10, k10, s3, m65, k65);

    System.out.println("______________________________");

    m1 = 1;
    m20 = 20;
    System.out.printf("%-10s %-10s %-1s %-10s %-10s%n", s1, s2, s3, s1, s2);
    System.out.println("______________________________________________");
    for (m1 = 1, m20 = 20; m1 <= 10 && m20 <= 65; m1++, m20 +=5 ){
      System.out.printf("%-10s %-10.3f %-1s %-10s %-10.3f%n", m1, m1 * milesToKilometer, s3, m20, m20 * milesToKilometer);
    }

  }
}