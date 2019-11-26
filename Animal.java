public class Animal {

  String species;
  String name;
  int yearOfBirth;
  char gender;
  int daysInZoo;

  public Animal(String species, String name, int yearOfBirth, char gender, int daysHere) {
    this.species = species;
    this.name = name;
    this.yearOfBirth = yearOfBirth;
    this.gender = gender;
    daysInZoo = daysHere;
  }


  public String toString(){
    return species +" " + name +" "+ yearOfBirth + " " + gender;
  }

  public String getSpecies() {
    return species;
  }

  public void setSpecies(String species) {
    this.species = species;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getYearOfBirth() {
    return yearOfBirth++;
  }

  public void setYearOfBirth(int yearOfBirth) {
    this.yearOfBirth = yearOfBirth;
  }

  public char getGender() {
    return gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public int getDaysInZoo() {
    return daysInZoo;
  }

  public void setDaysInZoo(int daysInZoo) {
    this.daysInZoo = daysInZoo;
  }
}



