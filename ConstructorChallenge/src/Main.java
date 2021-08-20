public class Main {
    public static void main(String[] args) {
    BankAccount startAccount = new BankAccount(1234, 0, "Ali G", "ALig@gmail.com", 922);

    startAccount.withdrawMoney(210);
    startAccount.withdrawMoney(190);

    startAccount.depositMoney(225);
    startAccount.withdrawMoney(10.50);
    }

}
