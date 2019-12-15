public class BankAccount {
  String typeOfAccount;
  double balance;
  double interest;

  public BankAccount(String typeOfAccount) {
    this.typeOfAccount = typeOfAccount;
    this.balance = 0.0;
    if (typeOfAccount.equalsIgnoreCase("chequing")) this.interest = 0.0;
    else if (typeOfAccount.equalsIgnoreCase("saving")) this.interest = 0.019;

  }

  @Override
  public String toString() {
    return typeOfAccount + " : " + balance;
  }

  public boolean equals(Object bank) {
    BankAccount bank1 = (BankAccount) bank;
    //    return this.getBalance() == bank1.getBalance();

    //    return this.balance == bank1.balance
    //            && Objects.equals(typeOfAccount,bank1.typeOfAccount);

    return this.balance == bank1.balance && this.typeOfAccount.equalsIgnoreCase(bank1.typeOfAccount);

  }

  public String getTypeOfAccount() {
    return typeOfAccount;
  }

  public void setTypeOfAccount(String typeOfAccount) {
    this.typeOfAccount = typeOfAccount;
  }

  public double getBalance() {
    return balance;
  }

  public void increment(double value) {
    balance += value;
  }

  public void withdraw(double value) {
    balance -= value;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public double getInterest() {
    return interest;
  }

  public void setInterest(double interest) {
    this.interest = interest;
  }

  public static void main(String[] args) {
    BankAccount bank1 = new BankAccount("saving");
    BankAccount bank2 = new BankAccount("saving");

    bank1.setBalance(100);
    System.out.println(bank1.getBalance());
    System.out.println(bank1);
    System.out.println(bank1.equals(bank2));

    bank2.setBalance(100);
    System.out.println(bank1.equals(bank2));
    System.out.println(bank1 == bank2);

    ////
    BankAccount ba1 = new BankAccount("chequing");
    System.out.println(ba1);
    ba1.increment(5.0);
    System.out.println(ba1);
    ba1.withdraw(1.5);
    System.out.println(ba1);
    ba1.increment(10.0);
    System.out.println(ba1);

    BankAccount ba2 = new BankAccount("savings");
    System.out.println(ba2);
    ba2.increment(15.0);
    System.out.println(ba2);
    ba2.withdraw(1.5);
    System.out.println(ba2);
    System.out.println("EQUALS::::: " + ba1.equals(ba2));

  }
}
