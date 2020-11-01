public class BankAccount{

  private double balance;
  private int accountID;
  private String password;

  public BankAccount(int ID, String p){
    balance = 0;
    accountID = ID;
    password = p;
  }

  public double getBalance(){
    return balance;
  }

  public int getAccountID(){
    return accountID;
  }

  public void setPassword(String p){
    password = p;
  }

  public boolean deposit(double amount){
    if(amount >= 0){
      balance += amount;
      return true;
    }
    return false;
  }

  public boolean withdraw(double amount){
    if(amount < 0 || balance - amount < 0){
      return false;
    }
    balance -= amount;
    return true;
  }

  public String toString(){
    return "#" + accountID + "\t$" + balance;
  }

  private boolean authenticate(String password){
    return this.password.equals(password);
  }

  public boolean transferTo(BankAccount other, double amount, String password){
    if(amount >= 0 && authenticate(password) && getBalance() >= amount){
      withdraw(amount);
      other.deposit(amount);
      return true;
    }
    return false;
  }

}
