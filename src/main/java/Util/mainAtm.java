package atmMenu;

import Services.AccountService;

import java.util.Scanner;


public class mainAtm {
    public static void main(String args[]) {
        //Connection conn = ConnectionUtil.getConnection();
        Scanner in = new Scanner(System.in);
        AccountService accountService = new AccountService();

        boolean haveAccountAccess = true;
        while(haveAccountAccess){
            System.out.println("Would you like to add , delete, balance, or all");
            String userInput = in.nextLine();
            if (userInput.equals("quit")) {
                haveAccountAccess = false;
            } else if (userInput.equals("add")) {
                System.out.println("Enter username to create account");
                //String userName = in.nextLine();
                //AccountService.addUser(userName);
            } else if (userInput.equals("delete")) {
                System.out.println("Enter 'username' to remove account");
                //String userName = in.nextLine();
                //AccountService.removeUser(userName);

            } else if ((userInput.equals("balance"))) {
                System.out.println("Enter 'username' to see you account balance");
                //String account = in.nextLine();
                //AccountService.getBalance(0);

            } else if (userInput.equals("all")){
                //System.out.println("Enter 'all' to see whole list.");
                //System.out.println(AccountService.repository);//want to print out all account detail
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
public class atmMenu.mainAtm
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
                    System.out.println("Your Money has been successfully depsited");
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



