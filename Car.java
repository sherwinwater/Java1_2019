public class Car {
  //declare variables
  final double COST_TWO_AXLES = 3.0;
  final double COST_PER_KM = 0.25;
  double kilometersOfHighway;
  double totalCost;

  //create a car object
  public Car(double kilometersOfHighway) {
    this.kilometersOfHighway = kilometersOfHighway;
  }

  //get total cost
  public double getCost() {
      return  COST_TWO_AXLES + getCostByDistance();
  }

  // get cost by distance
  public double getCostByDistance() {
    if(kilometersOfHighway < 0 )
      kilometersOfHighway = 0.0;
    return COST_PER_KM * kilometersOfHighway;
  }

}
