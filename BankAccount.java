public class BankAccount {
  String typeOfAccount;
  double balance;
  double interest;

  public BankAccount(String typeOfAccount) {
    this.typeOfAccount = typeOfAccount;
    this.balance = 0.0;
    if(typeOfAccount.equalsIgnoreCase("chequing"))
      this.interest = 0;
    else if(typeOfAccount.equalsIgnoreCase("saving"))
      this.interest = 0.019;

  }

  @Override
  public String toString(){
    return typeOfAccount + " : "+ balance;
  }

  public boolean equals(Object bank){
    BankAccount bank1 = (BankAccount)bank;
    return this.getBalance() == bank1.getBalance();
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
    BankAccount bank1 = new BankAccount("chequing");
    BankAccount bank2 = new BankAccount("saving");

    bank1.setBalance(100);
    System.out.println(bank1.getBalance());
    System.out.println(bank1);
    System.out.println(bank1.equals(bank2));

    bank2.setBalance(100);
    System.out.println(bank1.equals(bank2));
    System.out.println(bank1 == bank2);

  }
}
