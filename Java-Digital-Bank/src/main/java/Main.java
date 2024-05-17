/*Java-DBS (Digital Banking System)
  This is a basic java program simulating a Digital Banking App*/

import java.util.Scanner; //We import the scanner class for input

public class Main {  //Main class for the first menu
    public static void main(String[] args) {
        System.out.println("---Digital Banking System---");
        System.out.println("1. Create Account");
        System.out.println("2. Exit");

        final int balance = 500; //We declare a default balance for the user

        Scanner choice = new Scanner(System.in);
        String userName;

        System.out.print("Enter your choice: ");
        userName = choice.nextLine();
        int choiceResult = Integer.parseInt(userName);

        switch (choiceResult) {  //Switch cases for the options
            case 1:
                System.out.println("");
                Scanner choice1 = new Scanner(System.in);
                final String username;

                System.out.println("Username: ");
                username = choice1.nextLine();

                System.out.println("");
                Scanner choice2 = new Scanner(System.in);
                String password;

                System.out.println("Password: ");
                password = choice2.nextLine();

                System.out.println("");
                System.out.println("Account created successfully!");
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
                System.out.println("");
                System.out.println("Welcome: " + username + ", your balance is: " + balance + "$");
                System.out.println("");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Exit");

                System.out.print("");
                Scanner choice3 = new Scanner(System.in);
                String choiceUser;

                System.out.print("Pick an option: ");
                choiceUser = choice3.nextLine();

                int choiceResult1 = Integer.parseInt(choiceUser);
                switch (choiceResult1) {   //Another switch after the login menu for the options
                    case 1:
                        System.out.println("");
                        Scanner choice5 = new Scanner(System.in);
                        String deposit;

                        System.out.print("Enter the amount to deposit: ");
                        deposit = choice5.nextLine();

                        int depositResult = Integer.parseInt(deposit);

                        int newBalance = balance + depositResult;

                        System.out.println("");

                        System.out.println("Deposit successful!, your new balance is: " + newBalance + "$");
                        break;

                    case 2:
                        System.out.println("");
                        Scanner choice6 = new Scanner(System.in);
                        String withdraw;

                        System.out.print("Enter the amount to withdraw: ");
                        withdraw = choice6.nextLine();

                        int withdrawResult = Integer.parseInt(withdraw);
                        int newBalance1 = balance - withdrawResult;
                        System.out.println("");
                        System.out.println("Withdraw successful!, your new balance is: " + newBalance1 + "$");
                        break;

                    case 3:
                        System.out.println("");
                        System.out.println("Thanks for using our program " + username + ", have a great day!" );
                        break;
                }
                break;
        }
    }
}
