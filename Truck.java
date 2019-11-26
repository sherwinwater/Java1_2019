public class Truck {
  //declare variables
  final double COST_PER_AXLE = 2.0;
  final double COST_PER_KM = 0.2;

  int numberOfAxles;
  double weightOfTruck;
  double kilometersOfHighway;
  double costPerLbs;

  // create a Truck object
  public Truck(int numberOfAxles, double weightOfTruck, double kilometersOfHighway) {
    this.numberOfAxles = numberOfAxles;
    this.weightOfTruck = weightOfTruck;
    this.kilometersOfHighway = kilometersOfHighway;
  }

  //get total cost
  public double getCost() {
      return getCostByAxles() + getCostByDistance() + getCostByWeight();
  }

  //get cost by weight
  public double getCostByWeight() {
    if (weightOfTruck < 10000)
      costPerLbs = 0.003;
    else if (weightOfTruck <= 20000)
      costPerLbs = 0.0031;
    else
      costPerLbs = 0.0032;
    return costPerLbs * weightOfTruck;
  }

  // get cost by distance
  public double getCostByDistance() {
    if(kilometersOfHighway < 0 ) kilometersOfHighway = 0.0;
    return COST_PER_KM * kilometersOfHighway;
  }

  //get cost by axles
  public double getCostByAxles() {
    if (numberOfAxles < 0) numberOfAxles = 0;
    return COST_PER_AXLE * numberOfAxles;
  }

}
