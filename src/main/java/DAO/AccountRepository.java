package DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.AccountAtm;
import Util.mainAtm;
import Util.utilConnection;
import org.apache.log4j.Logger;
import org.apache.log4j.Logger;

public class AccountRepository {
    Logger logger = Logger.getLogger(AccountRepository.class);
        logger.all("");
    Connection con;
    public AccountRepository() {
        con = utilConnection.getConnection();
    }
    public List<AccountAtm> getAllAccounts(){

        List<AccountAtm> allAccounts = new ArrayList<>();
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("Select  * From accountatm");
            while(rs.next()){
                AccountAtm loadingAccount = new AccountAtm(rs.getString("username"));
                allAccounts.add(loadingAccount);

            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return allAccounts;
    }

    public void addAccount(){

    }


    public void removeUser() {
    }

    /*public AccountAtm getBalancetByUserName(String userName){
        return null;
    }

     */


    /*public void addUser(String userName) {
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

     */

}

