package Util;

public class AccountAtm {
    String userName;
    //String password;
    //int balance;

    public AccountAtm(String userName) {
        this.userName = userName;
        //this.password = password;
        //this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountAtm{" +
                "userName='" + userName + '\'' +
                //", password='" + password + '\'' +
               // ", balance=" + balance +
                '}';
    }
}
