package Chapter7._1_Threading.RaceCondition;
/*
I haven't yet finished writing this challenge.
TODO: finish challenge
 */
public class BankAccount {
    /*
    DO NOT remove the Thread.sleep methods in this class! They are essential for illustrating an important point, since
    they make the threads more likely to conflict with each other when we're working with this shared resources.

    You can pretend that the Thread.sleep calls demonstrate the amount of time it takes to do security checks over
    the web prior to every single transaction.

    You will, however, have to make one small change to make sure that the BankAccountServiceThreads do not cause
    race conditions. Consider looking into the synchronized keyword.
     */
    private int userID;
    private double balance;
    public BankAccount(int userID, double initialBalance){
        this.userID = userID;
        double balance = initialBalance;
    }
    public void changeBalance(double amt){
        double tempBalance = balance;
        tempBalance = balance + amt;
        try{
            Thread.sleep(1000);
        }catch(InterruptedException e){
//            this exception never happens, but we still need to watch for it every time we thread.sleep.
            e.printStackTrace();
        }
        balance = tempBalance;
    }

    public int getUserID() {
        return userID;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}
