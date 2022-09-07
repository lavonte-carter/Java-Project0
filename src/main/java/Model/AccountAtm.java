package Model;

//model object for the account

public class AccountAtm {
    public String username; //same as artistid
    public String password;
    public int balance;

    public int userid;

    public AccountAtm(String username, int balance, String password, int userid) {
        this.username = username;
        this.password = password;
        this.balance = balance;
        this.userid= userid;
    }


    @Override
    public String toString() {
        return
                "{USERNAME =" + username +
                ", PASSWORD =" + password +
                ", BALANCE =" + balance +
                ", USERid =" + userid + "\n}";
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String userName) {
        this.username = username;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
