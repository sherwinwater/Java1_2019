public class StaticInstanceVariables {
  private static int staticVariable = 30;
  int instanceVariable = 20;

  int setNum() {
    instanceVariable = 11;
    return instanceVariable;
  }

  public void somebody() {
    int localVariable = 10;
    System.out.println(localVariable);
  }

  StaticInstanceVariables() {
    instanceVariable++;
    staticVariable++;
  }

  public static void main(String[] args) {
    System.out.println(staticVariable);
    StaticInstanceVariables obj1 = new StaticInstanceVariables();
    StaticInstanceVariables obj2 = new StaticInstanceVariables();
    StaticInstanceVariables obj3 = new StaticInstanceVariables();
    System.out.println(obj1.instanceVariable); // not change after each obj created;only the first time.
    //    System.out.println(obj2.setNum());
    //    System.out.println(obj3.getNum());
    System.out.println(obj2.instanceVariable);
    System.out.println(obj3.instanceVariable);
    System.out.println(staticVariable);//change after each obj created, ++

  }

  int getNum() {
    int s = 2;
    return s++;
  }

}
