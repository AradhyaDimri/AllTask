package Task;
 class Account {
    private int accountNo;
    private String name;
    private String address;
    private String phoneNo;
    private String dob;
    private double balance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account(int accountNo, String name, String address, String phoneNo, String dob, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dob = dob;
        this.balance = balance;
    }

    public void closeAccount() {
        // implementation for closing an account
        System.out.println("Account closed successfully");
    }
}

 class SavingsAccount extends Account {

    public SavingsAccount(int accountNo, String name, String address, String phoneNo, String dob, double balance) {
        super(accountNo, name, address, phoneNo, dob, balance);
    }

    public void withdraw(double amount) {
        // implementation for withdrawing from a savings account
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient balance");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of " + amount + " successful");
        }
    }

    public void deposit(double amount) {
        // implementation for depositing into a savings account
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            setBalance(getBalance() + amount);
            System.out.println("Deposit of " + amount + " successful");
        }
    }

    public void fixedDeposit(double amount) {
        // implementation for making a fixed deposit in a savings account
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            setBalance(getBalance() + amount);
            System.out.println("Fixed deposit of " + amount + " successful");
        }
    }
}

class LoanAccount extends Account {

    public LoanAccount(int accountNo, String name, String address, String phoneNo, String dob, double balance) {
        super(accountNo, name, address, phoneNo, dob, balance);
    }

    public void payEMI(double amount) {
        // implementation for paying an EMI for a loan account
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient balance");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("EMI payment of " + amount + " successful");
        }
    }
    public void topUpLoan(double amount) { // implementation for topping up a loan account
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else {
            setBalance(getBalance() + amount);
            System.out.println("Top-up of " + amount + " successful");
        }
    }

    public void repayment(double amount) {
        // implementation for repaying a loan account
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > getBalance()) {
            System.out.println("Insufficient balance");
        } else {
            setBalance(getBalance() - amount);
            System.out.println("Repayment of " + amount + " successful");
        }
    }
    
    
    
}
    
    class inheritance
    {
    	public static void main(String args[]) {
    		SavingsAccount savingsAccount = new SavingsAccount(123, "John Doe", "123 Main St", "555-1234", "01/01/1980", 5000.0);
    		LoanAccount loanAccount = new LoanAccount(456, "Jane Smith", "456 Oak St", "555-5678", "02/02/1970", 10000.0);
    		savingsAccount.withdraw(1000.0);
    		savingsAccount.deposit(2000.0);
    		savingsAccount.fixedDeposit(3000.0);
    		savingsAccount.closeAccount();

    		loanAccount.payEMI(500.0);
    		loanAccount.topUpLoan(1000.0);
    		loanAccount.repayment(1500.0);
    		loanAccount.closeAccount();
    		}
    	}
    
