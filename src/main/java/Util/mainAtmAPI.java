package Util;

import Model.AccountAtm;
import Model.AccountUser;
import Services.AccountService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.javalin.Javalin;

import java.sql.SQLException;

public class mainAtmAPI {
    public static void main(String[] args) throws SQLException {
        AccountService as = new AccountService();
        Javalin app = Javalin.create().start(9000);

        //1 this words with postman
        app.get("/allaccounts", ctx -> {
            ctx.json(as.getAllAccounts());
        });

        app.get("/allUsers", ctx -> {
            ctx.json(as.getAllUsers());
        });

        //2 this does work in postman
        app.get("/getBalanceByUserID/{userid}", ctx ->
        {
            ctx.json(as.getBalanceByUserID(Integer.parseInt(ctx.pathParam("userid"))));
        });

        //3 this does work with postman, but only after you 'addUser'
        app.post("addAccount", ctx -> {
            ObjectMapper mapper = new ObjectMapper();
            AccountAtm requestAccount = mapper.readValue(ctx.body(), AccountAtm.class);
            as.addAccount(requestAccount.getAccountid(), requestAccount.getBalance(), requestAccount.getAccount_userid(), requestAccount.getAccount_name(),
                    requestAccount.getAccount_name());
        });

        //adds user
        app.post("addUser", ctx -> {
            ObjectMapper mapper2 = new ObjectMapper();// jackson objectMapper
            AccountUser requestUser = mapper2.readValue(ctx.body(), AccountUser.class);
            //int user_id, String username, String first_name, String last_name, String password
            as.addUser(requestUser.getUser_id(), requestUser.getUsername(), requestUser.getFirst_name(), requestUser.getLast_name(), requestUser.getPassword());
        });

        //deletes user
        app.delete("/deleteUser/{account_userid}", ctx ->
        {

            as.removeUser(Integer.parseInt(ctx.pathParam("account_userid")));
            ctx.result("User Deleted");
        });

        //adds money
        app.put("addMoney", ctx -> {
            ObjectMapper mapper = new ObjectMapper();// jackson objectMapper
            AccountAtm requestAccount = mapper.readValue(ctx.body(), AccountAtm.class);
            as.addMoney(requestAccount.getAccount_userid(), requestAccount.getBalance());
        });

        app.put("withdrawMoney", ctx -> {
            ObjectMapper mapper = new ObjectMapper();
            AccountAtm requestAccount = mapper.readValue(ctx.body(), AccountAtm.class);
            as.withdrawMoney(requestAccount.getAccount_userid(), requestAccount.getBalance());
        });


    }
}


