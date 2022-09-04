package Model;



public class AccountAtm {
    public String userName; //same as artistid
    //String password;
    public int balance;

    public AccountAtm(String userName) {
        this.userName = userName;
        //this.password = password;
        this.balance = balance;
    }


    @Override
    public String toString() {
        return "AccountAtm{" +
                "userName='" + userName + '\'' +
                //", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
