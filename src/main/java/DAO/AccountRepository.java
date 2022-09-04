package atmMenu;

import java.sql.Connection;
import java.util.List;
import java.util.ArrayList;
import Util.utilConnection;

public class AccountRepository {
    Connection con;

    //public List<AccountAtm> accounts;

    public AccountRepository() {
        Connection conn = utilConnection.getConnection();
        //accounts = new ArrayList<>();
    }

    public List<AccountAtm> getAllAccounts(){
        return null;
    }

    public List<AccountAtm> getAllAccountsByUsername(String userName){
        return null
    }

    public void addUser(String userName) {
        AccountAtm a = new AccountAtm(userName);
        accounts.add(a);
    }

    public void removeUser(String userName) {
        AccountAtm r = new AccountAtm(userName);
        accounts.remove(r);
    }

    public List<AccountAtm> getAccounts() {
        return accounts;
    }

    public String toString() {
        return accounts.toString();
    }

     public int getBalance(int balance) {
        //AccountAtm b = new AccountAtm();
       return 0;
    }

}

/* These are my method for the code.


    public int getBalance(String user, int balance) {
        return Account1.getBalance(user, balance);
    }


    public String addPassword(String password) {
        return Account1.addPassword(password);
    }

    public String getUser(String user) {
        return Account1.getUser(user);
    }
}

 */
