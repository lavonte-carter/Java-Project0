package atmMenu;

import Util.utilConnection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountService {

    Connection conn;

    public AccountService(){ conn = utilConnection.getConnection(); }

    public static AccountRepository repository = new AccountRepository();
    public static void addUser(String userName){
        repository.addUser(userName);
    }

    public static void getBalance(int i) {
        repository.getBalance(i);
    }


    /*public List<AccountAtm> getAccounts(){
        return repository.getAccounts();
    }

     */

    public static void removeUser(String userName) {
        repository.removeUser(userName);
    }
}
