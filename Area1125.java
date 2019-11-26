public class Area1125 {
  double length;
  double width;
  double radius;
  double area;

  public Area1125 (double length, double width){
    this.length = length;
    this.width = width;
    this.area = length * width;
  }

  public Area1125 (double radius){
    this.radius = radius;
    this.area = radius * radius * Math.PI;
  }

  public Area1125(String type, double length, double width){

  }



}
