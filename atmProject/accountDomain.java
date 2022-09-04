package atmProject;

import java.util.ArrayList;
import java.util.List;

public class accountDomain {
    List<String> accounts;

    public accountDomain(){
        accounts = new ArrayList<>();
    }

    String userName;
    String password;

    public accountDomain(String userName,String password){
        this.password = password;
        this.userName = userName;

    }


}
