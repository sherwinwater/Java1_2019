public class City1125 {
  String cityName;
  int population;
  String mayer;

  public City1125(String cityName, int population, String mayer) {
    this.cityName = cityName;
    this.population = population;
    this.mayer = mayer;
  }

  public static void main(String[] args) {

    City1125 city1 = new City1125("new york", 100000, "jack");
    City1125 city2 = new City1125("b", 1, "sam");
    System.out.println(city1.getCityName());
    System.out.println(city2);

  }

  @Override
  public String toString() {
    return cityName + " " + population + " " + mayer;
  }

  public String getCityName() {
    return cityName;
  }

  public void setCityName(String cityName) {
    this.cityName = cityName;
  }

  public int getPopulation() {
    return population;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  public String getMayer() {
    return mayer;
  }

  public void setMayer(String mayer) {
    this.mayer = mayer;
  }
}
