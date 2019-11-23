public class Car {
  double kilometersOfHighway;

  public Car(double kilometersOfHighway) {
    this.kilometersOfHighway = kilometersOfHighway;
  }

  public double getCost() {
    //declare variables
    int costOfTwoAxles = 3;
    double costPerKm = 0.25;
    double costOfKm;
    double costOfTotal = 0;

    //catch exception
    try {
      if (kilometersOfHighway < 0) kilometersOfHighway = 0;
      costOfKm = costPerKm * kilometersOfHighway;
      costOfTotal = costOfTwoAxles + costOfKm;

    } catch (Exception e) {
      System.out.println("something wrong. please input again.");
    }
    return costOfTotal;
  }
}
