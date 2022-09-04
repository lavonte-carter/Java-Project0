package atmProject;


import java.util.Scanner;
import java.util.*;

public class mainAtm {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> accounts = new ArrayList<>();
        boolean haveAccount = false;
        while(haveAccount = true){ //move 12-16 here into scope
            System.out.println("Do you have an account?");
            System.out.println("Enter Yes or No in the terminal");
            String userInput1 = in.nextLine();
            System.out.println ("You have selected " +userInput1);
            if (userInput1.equals("No||NO||no")){
                haveAccount = false; System.out.println("Would you like create an Account? Select Yes or No");
                String userInput2 = in.nextLine(); if (userInput2.equals("Yes||YES||yes")){
                    new addAccount();
                } else return;
            }
            while (haveAccount = false) {
                System.out.println("Would you like create an Account? Select Yes or No");
                Scanner scan = new Scanner(System.in);
                String userInput2 = in.nextLine();
                if (userInput2.equals("Yes||YES||yes")){
                    new addAccount();
                } else return;
        }

            /*while (haveAccount = false) {
                System.out.println("Would you like create an Account? Select Yes or No");
                Scanner scan = new Scanner(System.in);
                String userInput2 = in.nextLine();
                if (userInput2.equals("Yes||YES||yes")){
                    new addAccount();
                } else return;

             */

        }


    }


  /*  public class abc{
        System.out.println("Do you have an account?");
        System.out.println("Please Enter Yes or No in the terminal below");
    }

   */

}
