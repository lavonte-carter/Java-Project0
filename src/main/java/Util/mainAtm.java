package Util;

import Model.AccountAtm;
import Services.AccountService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;


public class mainAtm {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger(mainAtm.class);
        logger.info("User Login Attempt Successful");

            /*there are seven levels to logging.
            These levels correspond to least restrictive to most restrictive
            'info' level is close to the middle range (All, DEBUG, INFO, WARN, ERROR, FATAL, OFF)
             */

        List<AccountAtm> AccountAtm = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        AccountService as = new AccountService();

        boolean haveAccountAccess = true;
        while (haveAccountAccess) {
            System.out.println("WELCOME to JAVA ATM");
            System.out.println("Would you like to add account, delete account, add money, update password, or see all accounts");
            String userInput = in.nextLine();
            if (userInput.equals("quit")) {
                haveAccountAccess = false; //code is clean and works, place JUNIT test here.
            } else if (userInput.equals("add account")) {                 //works for junit
                System.out.println("Enter username to create account");
                String username = in.nextLine();
                System.out.println("How much money would you like to add");
                int balance = in.nextInt();
                in.nextLine();
                //work out issues with password and user id
                System.out.println("Create a new password");
                String password = in.nextLine();
                System.out.println("Create user ID");
                int userid = in.nextInt();
                in.nextLine();
                AccountAtm newAccount = new AccountAtm(username, balance, password, userid);
                as.addAccount(username, balance, password, userid);

            } else if (userInput.equals("delete account")) {
                System.out.println("Enter userid want to delete");
                int userid = in.nextInt();
                as.removeUser(userid);
                in.nextLine();


            } else if (userInput.equals("update password")) {
                System.out.println("Enter username of the password you want to change.");
                String username = in.nextLine();
                System.out.println("Enter new password");
                String new_password = in.nextLine();
                as.updatePassword(username, new_password);


            } else if (userInput.equals("add money")) {
                System.out.println("Enter username of the account you would like to add money to.");
                String username = in.nextLine();
                System.out.println("Enter the amount you are adding");
                int new_money = in.nextInt();
                as.addMoney(username, new_money);


            } if ((userInput.equals("see all accounts"))) {
                System.out.println(as.getAllAccounts());
            }

        }
    }
}
