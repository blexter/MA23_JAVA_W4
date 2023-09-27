public class Exercise_3_SavingsAccount extends Exercise_3_Account {
    private double interestRate;

    public Exercise_3_SavingsAccount(double rate) {
        this.interestRate = rate;
    }

    public Exercise_3_SavingsAccount(double balance, String name) {
        super(balance, name);
    }

    public void addInterest(double rate){
        this.interestRate = rate;
    }

}
