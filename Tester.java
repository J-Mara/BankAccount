public class Tester{
  public static void main(String[] args) {
    BankAccount b1 = new BankAccount(4328490, "this is a test");
    b1.deposit(300.0);
    b1.withdraw(234.0);
    System.out.println(b1.getBalance());
    System.out.println(b1.getAccountID());
    System.out.println(b1.toString());
  }
}
