public class Assignment5 {

  /*
  public static void main(String[] args) {
    Truck mack1 = new Truck(5, 21000.0, 65.0);
    Truck mack2 = new Truck(6, 22000.4, 15.3);
    Truck mack3 = new Truck(3, 2949.4, 19.0);

    double mack1Cost = mack1.getCost();
    double mack2Cost = mack2.getCost();
    double mack3Cost = mack3.getCost();

    System.out.printf("$%.2f", mack1Cost + mack2Cost + mack3Cost);
    // should output $194.31
  }
   */


/*
  public static void main(String[] args) {

    Truck mack1 = new Truck(5, 21000.0, 65.0);
    Car nissan1 = new Car(36.2);

    double mack1Cost = mack1.getCost();
    double nissan1Cost = nissan1.getCost();

    System.out.printf("$%.2f", mack1Cost + nissan1Cost);
    // should output $102.25
  }
  */

  public static void main(String[] args) {

    Truck mack1 = new Truck(5, 21000.0, 65.0);
    Car nissan1 = new Car(36.2);
    Car nissan2 = new Car(16.2);

    double mack1Cost = mack1.getCost();
    double nissan1Cost = nissan1.getCost();
    double nissan2Cost = nissan2.getCost();

    System.out.printf("$%.2f", mack1Cost + nissan1Cost + nissan2Cost);
    // should output $109.30
  }

}
