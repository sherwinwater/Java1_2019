public class Truck {
  int numberOfAxles;
  double weightOfTruck;
  double kilometersOfHighway;

  public Truck(int numberOfAxles, double weightOfTruck, double kilometersOfHighway) {
    this.numberOfAxles = numberOfAxles;
    this.weightOfTruck = weightOfTruck;
    this.kilometersOfHighway = kilometersOfHighway;
  }

  public double getCost() {
    //declare variables
    int costPerAxle = 2;
    double costPerKm = 0.2;
    double costPerLbs;
    int costOfAxles;
    double costOfKm;
    double costOfWeight;
    double costOfTotal = 0;

    //catch exception
    try {
//      if values provided is < 0 (for axles) and < 0.0 (for kms and distance),
//      default the value to 0 (for axles) and 0.0 (for kms and distance).
      if (numberOfAxles < 0) numberOfAxles = 0;
      if (kilometersOfHighway < 0.0) kilometersOfHighway = 0.0;
      if (weightOfTruck < 10000) costPerLbs = 0.003;
      else if (weightOfTruck >= 10000 && weightOfTruck <= 20000)
        costPerLbs = 0.0031;
      else costPerLbs = 0.0032;

      //calculate the cost
      costOfAxles = costPerAxle * numberOfAxles;
      costOfKm = costPerKm * kilometersOfHighway;
      costOfWeight = costPerLbs * weightOfTruck;
      costOfTotal = costOfAxles + costOfKm + costOfWeight;

    } catch (Exception e) {
      System.out.println("something wrong. please input again.");
    }
    return costOfTotal;
  }
}
