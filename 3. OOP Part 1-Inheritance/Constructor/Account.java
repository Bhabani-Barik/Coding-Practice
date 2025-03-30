package Constructor;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account(){
        //constructor chaining
        this("5678", 2.50 , "Default Name", "Default Address", "Dafault Phone");
        System.out.println("Empty Constructor Called");
    }
    public Account(String number, double balance, String customerName, String customerEmail, String customerPhone ) {
        System.out.println("Accounts constructor with parameter called.");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = customerEmail;
        customerPhone = customerPhone;
    }

    public Account(String customerName, String customerEmail, String customerPhone) {
        this("9999", 3.50, customerName, customerEmail, customerPhone);
//        this.customerName = customerName;
//        this.customerEmail = customerEmail;
//        this.customerPhone = customerPhone;
    }

    // Deposit Amount
    public void depositFunds(double depositAmount) {
        balance += depositAmount;
        System.out.println("Deposit of $" + depositAmount + " made. New Balance is $" + this.balance);
    }

    // Withdraw AMount
    public void withdrawFunds(double withdrawlAmount) {
        if (balance - withdrawlAmount < 0) {
            System.out.println("Insufficient Funds! You only have $" + balance + " in your account.");
        } else {
            balance -= withdrawlAmount;
            System.out.println("Withdrawal of $" + withdrawlAmount + " processed, Remaining balance = $" + balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
}
