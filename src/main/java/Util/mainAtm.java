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
            logger.info("User Login Attempt");

            /*there are seven levels to logging.
            These levels correspond to least restrictive to most restrictive
            'info' level is close to the middle range (All, DEBUG, INFO, WARN, ERROR, FATAL, OFF)
             */

        List<AccountAtm> AccountAtm = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        AccountService accountService = new AccountService();

        boolean haveAccountAccess = true;
        while(haveAccountAccess){
            System.out.println("Would you like to add, delete, balance, all");
            String userInput = in.nextLine();
            if (userInput.equals("quit")) {
                haveAccountAccess = false; //code is clean and works, place JUNIT test here.
            }
            else if (userInput.equals("add")) {
                System.out.println("Enter username to create account");
                String userName = in.nextLine();
                System.out.println("How much money would you like to add");
                int balance = in.nextInt();
                accountService.addAccount(userName, 0);

            } else if (userInput.equals("delete")) {
                System.out.println("Enter 'username' to remove account");
                String userName = in.nextLine();
                //int userInt = in.nextInt();
                AccountService.removeUser(userName, 0); //issues with remove

            }  if ((userInput.equals("all"))) {
                System.out.println(accountService.getAllAccounts());
            }

        }
    }
}
        /*int balance = 5000 , withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
        
         */









/*import java.util.Scanner;
public class Util.mainAtm
{
    public static void main(String args[] )
    {
        int balance = 5000 , withdraw, deposit;
        Scanner s = new Scanner(System.in);
        while(true)
        {
            System.out.println("Automated Teller Machine");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");
            int n = s.nextInt();
            switch(n)
            {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    withdraw = s.nextInt();
                    if(balance >= withdraw)
                    {
                        balance = balance - withdraw;
                        System.out.println("Please collect your money");
                    }
                    else
                    {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited:");
                    deposit = s.nextInt();
                    balance = balance + deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Balance : "+balance);
                    System.out.println("");
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }
}

 */



