package Final.Bank;

public class Bank {
    public double balance;
    public double rate;


    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    //getter va setter
    public double getBalance(){
        return balance;
    }

    public double getRate() {
        return rate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    //Ham tinh lai hang thang
    public double calculateInterest(double balance, double rate) {
        return  balance * (rate / 1200);
    }
}
