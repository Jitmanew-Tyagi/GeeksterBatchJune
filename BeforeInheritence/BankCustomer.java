public class BankCustomer {
    private String name = "";
    private long accNumber;
    private long aadhar;
    private int mob;
    private String pan;
    private double balance = 500;
    private String branch;
   
    public BankCustomer(String name, long aadhar) {
        this.name = name;
        this.aadhar = aadhar;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(this.name.equals("")) {
            this.name = name;
        } else {
            System.out.println("Visit to branch");
        }
    }

    public void deposit(int amt) {
        balance += amt;
    }

    public void withdraw(int amt) {
        if(balance < amt) System.out.println("Insufficient Balance");
        balance -= amt;
    }
}