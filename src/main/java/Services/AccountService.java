package Services;

import DAO.AccountRepository;
import Model.AccountAtm;

import java.util.List;

public class AccountService {


    static AccountRepository ar;
    public AccountService() {
        ar = new AccountRepository();
        }

        public List<AccountAtm> getAllAccounts() {
            return ar.getAllAccounts();
        }

        public static void removeUser(String userName, int balance) {
            ar.removeUser();
            }



        public void addAccount(String userName, int balance){
            ar.addAccount();
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

