package main.JAVA.incapsulare;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAdress;
    private String customerPhoneNumber;

    public Account() {
        this("56789", 2.50, "Default name", "Default email adress", "Default phone number");
        System.out.println("Empty Constructor called");
    }
    public Account(String number, double balance, String customerName, String customerEmailAdress, String customerPhoneNumber) {
        System.out.println("Account constructor" + "with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAdress = customerEmailAdress;
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public void deposit(double depositAmount) {
        this.balance += depositAmount;
        System.out.println("Deposit of" + depositAmount + "made. New balance is" + this.balance);
    }
    public void withdrawal(double withdrawalAmount) {
        if (this.balance - withdrawalAmount <= 0) {
            System.out.println("Only" + this.balance + "available. Withdrawal" + "not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of" + withdrawalAmount + "processed Remaining balance=" + this.balance);
        }

    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
