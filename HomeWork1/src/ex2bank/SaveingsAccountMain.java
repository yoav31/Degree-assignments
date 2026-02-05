// Assignment: 2
// Author: Yoav Haviv Vaknin, ID: 208323261
package ex2bank;

public class SaveingsAccountMain {
    public static void main(String[] args) {
/**
 * Creating an array of bank account holder objects
 */
        PersonId []people=new PersonId[10];
         people[0] = new PersonId(5000, "Bill", "Gates,", "Tel-Aviv");
         people[1]=new PersonId(6000,  "Mark", "Zuckerberg",  "Jerusalem");
         people[2]=new PersonId(7000,"Steve", "Jobs", "Beer-Sheva");
         System.out.println("List of clients:");
        /**
         * print the data of bank account holders
         */
        for(int i=0; i<3; i++){
            System.out.println(people[i]);
        }

        System.out.println();
        /**
         * Creating an array of bank account holder objects
         */
        SavingsAccount[] accounts=new SavingsAccount[10];
        accounts[0]=new SavingsAccount(2000,people[0]);
        accounts[1]=new SavingsAccount(3000,people[1]);
        accounts[2]=new SavingsAccount(4000,people[2]);
        System.out.println("Print account status:");
        /**
         * Printing the data of the array of a savings account in cells 0-2
         */
        for (int i = 0; i < 3; i++) {
            System.out.println(accounts[i]);
        }

        System.out.println();
        SavingsAccount.setAnnualInterestRate(0.01);
        /**
         * updating the annual interest rate
         * and the amount of money after two months at the same interest rate
         */
        for(int j=0; j<2;j++){
            for (int i = 0; i < 3; i++) {
            accounts[i].calculateMonthlyInterest(SavingsAccount.getAnnualInterestRate());
        }
            }
        /**
         *Printing object data of a savings account after updating the annual interest rate
         * and the amount of money after two months at the same interest rate
         */
        System.out.println("Account status after two month update of balance (monthly interest: 0.01)");
        for (int i = 0; i < 3; i++) {
            System.out.println(accounts[i]);
        }
        System.out.println();
        System.out.println("Account status after one month update of balance (monthly interest now -0.015)");
        /**
         *updating the annual interest rate
         */
        SavingsAccount.setAnnualInterestRate(-0.015);
        for (int i = 0; i < 3; i++) {
            accounts[i].calculateMonthlyInterest(SavingsAccount.getAnnualInterestRate());
        }
        /**
         *Printing object data of a savings account after updating the annual interest rate
         * and the amount of money after one month at the same interest rate
         */
        for(int i=0; i<3; i++){
            System.out.println(accounts[i]);
        }
    }
}
