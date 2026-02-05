// Assignment: 2
// Author: Yoav Haviv Vaknin, ID: 208323261
package ex2bank;

public class SavingsAccount {
    /**
     * Declaration of the variables.
     */
    private static double annualInterestRate;
    private static int accountCounter=1000;
    private final int accountNumber;
     PersonId person;
    private double savingsBalance;

    /**
     * A default constructor initializes the pizza variables
     */
    public SavingsAccount(){
        this.accountNumber=0;
        this.savingsBalance=0;

    }

    /**
     * A constructor that takes attributes of a savings account account and matches them to fields
     */
    public SavingsAccount(double savingsBalance ,PersonId person){
        this.person=person;
        this.accountNumber = accountCounter;
        accountCounter++;
        this.savingsBalance=savingsBalance;

    }
    /**
     *A function that returns the current value of the variable
     */
    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    /**
     * A function that calculates the amount of money with the calculation of interest
     */
    public void calculateMonthlyInterest(double annualInterestRate){
        this.savingsBalance+=this.savingsBalance*setAnnualInterestRate(annualInterestRate)/12;

    }
    /**
     * A function that updates the value of the variable
     * as a result of receiving new values from the constructor
     */
    public static double setAnnualInterestRate(double annualInterestRate) {
       return SavingsAccount.annualInterestRate = annualInterestRate;
    }

    /**
     * Printing a savings account object
     */
    public String toString(){
        return "Account number:"+this.accountNumber+
                "\nClient details "+person+
                "\nSaving Balance:"+this.savingsBalance;

    }
}
