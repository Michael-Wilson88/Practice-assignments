public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private int phoneNumber;

    public BankAccount(){
        System.out.println( "empty constructor");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String eMail, int phoneNumber){
        System.out.println("Account constructor is called");
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setEMail(String eMail) {
        this.eMail = eMail;
    }
    public String getEMail() {
        return eMail;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void depositMoney(double depositAmount){
        this.balance += depositAmount;
        System.out.println("You have deposited " + depositAmount + " euro's");

    }
    public void withdrawMoney(double amountWithdraw){
        if (this.balance - amountWithdraw < 0){
            System.out.println("Insufficient funds for transaction, only " + balance + " available.");
        }
        else {
            balance -= amountWithdraw;
            System.out.println("Withdrawal of " + amountWithdraw + " processed. Remaining amount is " + balance);
        }
    }



}
