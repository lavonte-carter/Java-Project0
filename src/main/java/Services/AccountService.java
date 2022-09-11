package Services;

import DAO.AccountRepository;
import Model.AccountUser;
import Model.AccountAtm;
import org.apache.log4j.Logger;

import java.util.List;

public class AccountService {


    static AccountRepository ar;

    public AccountService() {
        ar = new AccountRepository();
    }

    public List<AccountAtm> getAllAccounts() {
        return ar.getAllAccounts();
    }

    public List<AccountUser> getAllUsers() {
        return ar.getAllUsers();
    }

    public Object removeUser(int account_userid) {
        ar.removeUser(account_userid);
        return null;
    }


    public void updatePassword(String username, String password) {
        Logger logger2 = Logger.getLogger(AccountService.class);
        logger2.info("User Password Updated!");
        ar.updatePassword(username, password);
    }


    public void addMoney(String username, int balance) {
        Logger logger3 = Logger.getLogger(AccountService.class);
        logger3.info("Transaction Successful!");
        ar.addMoney(username, balance);
    }


    public List<AccountUser> getAccountByUserID(int user_id) {

        return (List<AccountUser>) ar.getAccountByUserID(user_id);
    }


    public void addAccount(int accountid, int balance, int account_userid , String username, String account_name) {
        AccountAtm newAccount = new AccountAtm(accountid, balance, account_userid, username, account_name);
        ar.addAccount(newAccount);
    }

    public void addUser(int user_id, String username, String first_name, String last_name, String password) {
        AccountUser newUser = new AccountUser(user_id, username, first_name, last_name, password);
        ar.addUser(newUser);
    }

    public void withdrawMoney(int userid, int withdrawRequest){
        //AccountAtm newBalance = new AccountAtm(userid, withdrawRequest);
        ar.withdrawMoney(userid, withdrawRequest);
    }

    public double getBalanceByUserID(int userid) {
        return ar.getBalanceByUserID(userid);
    }

    public void addAccount(String username, String first_name, String last_name, String password) {
    }
}





   /* Connection conn;

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



    public static void removeUser(String userName) {
        repository.removeUser(userName);
    }
}

    */

