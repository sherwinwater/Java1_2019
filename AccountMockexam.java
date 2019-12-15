public class AccountMockexam {
  String typeOfAccount;
  double balance;
  double monthlyFee;

  public AccountMockexam(String typeOfAccount, double balance) {
    this.typeOfAccount = typeOfAccount;
    this.balance = balance;

  }

  public double getMonthlyFee() {
    if (typeOfAccount.equalsIgnoreCase("Chequing")) {
      if (balance < 5000.00) monthlyFee = 8.00;
      else if (balance <= 20000) monthlyFee = 5.00;
      else monthlyFee = 0.00;
    }
    if (typeOfAccount.equalsIgnoreCase("Savings")) {
      if (balance < 10000.00) monthlyFee = 3.00;
      else monthlyFee = 1.00;
    }
    return monthlyFee;
  }

  //bad code with return values
  //      if (typeOfAccount.equals("Chequing")){
  //        if(balance < 5000.00) return 8.00;
  //        else if(balance <= 20000) return 5.00;
  //        else return 0.00;
  //      }
  //      else if (typeOfAccount.equals("Savings")){
  //        if(balance < 10000.00) return 3.00;
  //        else return 1.00;
  //    } else return -1;
  //
  //  }
  @Override
  public String toString() {
    if (getMonthlyFee() == -1) return "wrong account type";
    else return "Your monthly fee is $" + getMonthlyFee();
  }

  public static void main(String[] args) {
    AccountMockexam account1 = new AccountMockexam("Chequing", 1000);
    System.out.println(account1);
    System.out.println(account1.getMonthlyFee());
  }
}