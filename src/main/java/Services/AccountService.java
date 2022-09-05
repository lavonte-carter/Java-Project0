package Services;

import DAO.AccountRepository;
import Model.AccountAtm;
import Util.mainAtm;
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

    public void removeUser(int userid) {
       ar.removeUser(userid);
       }


    public void updatePassword(String username, String password) {
        Logger logger2 = Logger.getLogger(AccountService.class);
        logger2.info("User Password Updated!");
        ar.updatePassword(username, password);
    }


    public List<AccountAtm> getAccountByUserID(int userid){

        return (List<AccountAtm>) ar.getAccountByUserID(userid);
    }


    public void addAccount(String username, int balance, String password, int userid){
            AccountAtm newAccount = new AccountAtm(username, balance, password, userid);
            ar.addAccount(newAccount);
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

