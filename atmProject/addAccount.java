package atmProject;

import javax.security.auth.login.AccountException;
import java.util.ArrayList;
import java.util.List;

public class addAccount {
//    String userName;
  //  String password;


    List<addAccount> accounts;
    public addAccount(){
        accounts = new ArrayList<>();
    }

    public void addAccount(String username, String password){
        addAccount a = new addAccount();
        accounts.add(a);
    }


}
