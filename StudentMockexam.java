public class StudentMockexam {
  final int THISYEAR = 2019;
  int yearOfBorn;
  String name;

  public StudentMockexam(String name, int yearOfBorn){
    this.name = name;
    this.yearOfBorn = yearOfBorn;
  }

  public int age(){
    return THISYEAR - yearOfBorn;
  }

  public String toString(){
    return name + " is "+ age()+" years old";
  }

  public static void main (String[] args) {
    StudentMockexam student1 = new StudentMockexam("susan", 1992);
    System.out.println(student1);
  }
}
